package com.mycompany.sgfc2.controller.DAO;

import com.mycompany.sgfc2.controller.Conexao;
import com.mycompany.sgfc2.model.NotaFiscal;
import com.mycompany.sgfc2.model.Produto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class NotaFiscalDAO {

    private Connection conn = null;
    private EnderecoDAO endDao;
    private FuncionarioDAO funcDao;
    private ProdutoDAO prodDao;

    public NotaFiscalDAO() {
        try {
            conn = Conexao.getConexao();
            endDao = new EnderecoDAO();
            funcDao = new FuncionarioDAO();
            prodDao = new ProdutoDAO();
        } catch (SQLException e) {
        } catch (Exception ex) {
        }
    }

    public void incluir(NotaFiscal nf) throws Exception {
        String sql;
        String sqlSec;
        PreparedStatement ps = null;
        PreparedStatement psSec = null;

        sql = "INSERT INTO notafiscal(numero, origem, destino, ajudante) VALUES (?, ?, ?, ?)";

        ps = conn.prepareStatement(sql);
        ps.setInt(1, nf.getNumero());
        ps.setInt(2, nf.getOrigem().getId());
        ps.setInt(3, nf.getDestino().getId());
        ps.setString(4, nf.getFuncionario().getCtps());

        ps.execute();

        for (Produto p : nf.getProdutos()) {
            sqlSec = "INSERT INTO notafiscal_produto(notafiscal, produto) VALUES (?, ?)";
            psSec = conn.prepareStatement(sqlSec);

            psSec.setInt(1, nf.getNumero());
            psSec.setInt(2, p.getId());

            psSec.execute();
        }

        ps.close();
        psSec.close();

    }

    public void alterar(NotaFiscal nf, int num) throws Exception {

        String sql;
        String sqlSec;
        PreparedStatement ps = null;
        PreparedStatement psRmv = null;
        PreparedStatement psSec = null;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");

        sql = "UPDATE notafiscal SET origem = ?, destino = ?, data_expedicao = ?, data_entrega = ?, ajudante = ? WHERE numero = ?";

        ps = conn.prepareStatement(sql);
        ps.setInt(1, nf.getOrigem().getId());
        ps.setInt(2, nf.getDestino().getId());

        if (nf.getDataExpedicao() != null) {
            Date data = Date.valueOf(nf.getDataExpedicao());
            df.format(data);
            ps.setDate(3, data);
        } else {
            ps.setNull(3, 0);
        }

        if (nf.getDataEntrega() != null) {
            Date data2 = Date.valueOf(nf.getDataEntrega());
            df.format(data2);
            ps.setDate(4, data2);
        } else {
            ps.setNull(4, 0);
        }
        ps.setString(5, nf.getFuncionario().getCtps());

        ps.setInt(6, num);

        psRmv = conn.prepareStatement("DELETE FROM notafiscal_produto WHERE notafiscal = " + nf.getNumero());
        psRmv.execute();

        for (Produto p : nf.getProdutos()) {
            sqlSec = "INSERT INTO notafiscal_produto(notafiscal, produto) VALUES (?, ?)";
            psSec = conn.prepareStatement(sqlSec);

            psSec.setInt(1, nf.getNumero());
            psSec.setInt(2, prodDao.proximoCodigo());
            prodDao.incluir(p);

            psSec.execute();
        }

        ps.execute();

        ps.execute();
        ps.close();

    }

    public void apagar(int num) throws Exception {
        String sql;
        String sqlSec;
        PreparedStatement ps = null;
        PreparedStatement psSec = null;

        sql = "DELETE FROM notafiscal WHERE numero = ?";
        sqlSec = "DELETE FROM notafiscal_produto WHERE notafiscal = ?";

        ps = conn.prepareStatement(sql);
        psSec = conn.prepareStatement(sqlSec);

        ps.setInt(1, num);
        psSec.setInt(1, num);

        psSec.execute();
        psSec.close();
        ps.execute();
        ps.close();

    }

    public NotaFiscal consulta(int num) throws Exception {
        String sql;
        String sqlSec;

        PreparedStatement ps = null;
        PreparedStatement psSec = null;

        ResultSet rs = null;
        ResultSet rsSec = null;

        NotaFiscal nf = null;

        sql = "SELECT numero, origem, destino, data_expedicao, data_entrega, ajudante FROM notafiscal WHERE numero = ?";
        sqlSec = "SELECT produto FROM notafiscal_produto WHERE notafiscal = ?";

        ps = conn.prepareStatement(sql);
        ps.setInt(1, num);
        rs = ps.executeQuery();

        while (rs.next()) {
            nf = new NotaFiscal();

            nf.setNumero(rs.getInt("numero"));
            nf.setOrigem(endDao.consulta(rs.getInt("origem")));
            nf.setDestino(endDao.consulta(rs.getInt("destino")));

            if (rs.getDate("data_expedicao") != null) {
                LocalDate ld = rs.getDate("data_expedicao").toLocalDate();
                nf.setDataExpedicao(ld);
            } else {
                nf.setDataExpedicao(null);
            }

            if (rs.getDate("data_entrega") != null) {
                LocalDate ld2 = rs.getDate("data_expedicao").toLocalDate();
                nf.setDataEntrega(ld2);
            } else {
                nf.setDataEntrega(null);
            }

            nf.setFuncionario(funcDao.consulta(rs.getString("ajudante")));

            psSec = conn.prepareStatement(sqlSec);
            psSec.setInt(1, rs.getInt("numero"));
            rsSec = psSec.executeQuery();

            while (rsSec.next()) {
                Produto p = prodDao.consulta(rsSec.getInt("produto"));

                nf.getProdutos().add(p);
            }
        }

        if (rsSec != null) {
            rsSec.close();
            psSec.close();
        }
        rs.close();
        ps.close();

        return nf;
    }

    public ArrayList<NotaFiscal> listar() throws Exception {
        String sql;
        String sqlSec;
        ArrayList<NotaFiscal> notasfiscais = new ArrayList<>();

        PreparedStatement ps = null;
        PreparedStatement psSec = null;

        ResultSet rs = null;
        ResultSet rsSec = null;

        sql = "SELECT numero, origem, destino, data_expedicao, data_entrega, ajudante FROM notafiscal";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            NotaFiscal nf = new NotaFiscal();
            nf.setNumero(rs.getInt("numero"));
            nf.setOrigem(endDao.consulta(rs.getInt("origem")));
            nf.setDestino(endDao.consulta(rs.getInt("destino")));

            if (rs.getDate("data_expedicao") != null) {
                LocalDate ld = rs.getDate("data_expedicao").toLocalDate();
                nf.setDataExpedicao(ld);
            } else {
                nf.setDataExpedicao(null);
            }

            if (rs.getDate("data_expedicao") != null) {
                LocalDate ld2 = rs.getDate("data_expedicao").toLocalDate();
                nf.setDataEntrega(ld2);
            } else {
                nf.setDataEntrega(null);
            }

            nf.setFuncionario(funcDao.consulta(rs.getString("ajudante")));

            sqlSec = "SELECT produto FROM notafiscal_produto WHERE notafiscal = ?";
            psSec = conn.prepareStatement(sqlSec);
            psSec.setInt(1, rs.getInt("numero"));
            rsSec = psSec.executeQuery();

            while (rsSec.next()) {
                Produto p = prodDao.consulta(rsSec.getInt("produto"));

                nf.getProdutos().add(p);
            }

            notasfiscais.add(nf);
        }
        if (rsSec != null) {
            rsSec.close();
            psSec.close();
        }

        rs.close();
        ps.close();

        return notasfiscais;
    }

}
