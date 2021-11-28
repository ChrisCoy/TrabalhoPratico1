package com.mycompany.sgfc2.controller.DAO;

import com.mycompany.sgfc2.controller.Conexao;
import com.mycompany.sgfc2.model.Carga;
import com.mycompany.sgfc2.model.NotaFiscal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class CargaDAO {

    private Connection conn = null;
    private NotaFiscalDAO nfDao;
    private FuncionarioDAO funcDao;

    public CargaDAO() {
        try {
            conn = Conexao.getConexao();
            nfDao = new NotaFiscalDAO();
            funcDao = new FuncionarioDAO();
        } catch (SQLException e) {
        } catch (Exception ex) {
        }
    }

    public void incluir(Carga cg) throws Exception {
        String sql;
        String sqlSec;
        PreparedStatement ps = null;
        PreparedStatement psSec = null;

        sql = "INSERT INTO carga(id, autorizado_por, conferido_por, data_autorizacao, data_conferencia) VALUES (?, ?, ?, ?, ?)";

        ps = conn.prepareStatement(sql);
        ps.setInt(1, proximoCodigo());
        ps.setString(2, cg.getAutorizadoPor().getCtps());
        ps.setString(3, cg.getConferidoPor().getCtps());

        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        Date data = Date.valueOf(cg.getDataAutorizacao());
        df.format(data);
        ps.setDate(4, data);

        Date data2 = Date.valueOf(cg.getDataConferencia());
        df.format(data2);
        ps.setDate(5, data2);

        ps.execute();
        ps.close();

        for (NotaFiscal nf : cg.getNotasFiscais()) {
            sqlSec = "INSERT INTO carga_notafiscal(carga, notafiscal) VALUES (?, ?)";
            psSec = conn.prepareStatement(sqlSec);

            psSec.setInt(1, proximoCodigo() - 1);
            psSec.setInt(2, nf.getNumero());

            psSec.execute();
        }

        psSec.close();

    }

    public void alterar(Carga cg, int id) throws Exception {
        String sql;
        String sqlSec;
        PreparedStatement ps = null;
        PreparedStatement psRmv = null;
        PreparedStatement psSec = null;

        sql = "UPDATE carga SET autorizado_por = ?, conferido_por = ?, data_autorizacao = ?, data_conferencia = ? WHERE id = ?";

        ps = conn.prepareStatement(sql);
        ps.setString(1, cg.getConferidoPor().getCtps());
        ps.setString(2, cg.getAutorizadoPor().getCtps());

        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        Date data = Date.valueOf(cg.getDataAutorizacao());
        df.format(data);
        ps.setDate(3, data);

        Date data2 = Date.valueOf(cg.getDataConferencia());
        df.format(data2);
        ps.setDate(4, data2);

        ps.setInt(5, id);

        psRmv = conn.prepareStatement("DELETE FROM carga_notafiscal WHERE carga = " + cg.getId());
        psRmv.execute();

        for (NotaFiscal nf : cg.getNotasFiscais()) {
            sqlSec = "INSERT INTO carga_notafiscal(carga, notafiscal) VALUES (?, ?)";
            psSec = conn.prepareStatement(sqlSec);

            psSec.setInt(1, proximoCodigo() - 1);
            psSec.setInt(2, nf.getNumero());

            psSec.execute();
        }

        ps.execute();

        ps.execute();
        ps.close();

    }

    public void apagar(int id) throws Exception {
        String sql;
        String sqlSec;
        PreparedStatement ps = null;
        PreparedStatement psSec = null;

        sql = "DELETE FROM carga WHERE id = ?";
        sqlSec = "DELETE FROM carga_notafiscal WHERE carga = ?";

        ps = conn.prepareStatement(sql);
        psSec = conn.prepareStatement(sqlSec);

        ps.setInt(1, id);
        psSec.setInt(1, id);

        psSec.execute();
        psSec.close();
        ps.execute();
        ps.close();

    }

    public Carga consulta(int id) throws Exception {
        String sql;
        String sqlSec;

        PreparedStatement ps = null;
        PreparedStatement psSec = null;

        ResultSet rs = null;
        ResultSet rsSec = null;

        Carga cg = null;

        sql = "SELECT id, autorizado_por, conferido_por, data_autorizacao, data_conferencia FROM carga WHERE id = ?";
        sqlSec = "SELECT notafiscal FROM carga_notafiscal WHERE carga = ?";

        ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        rs = ps.executeQuery();

        while (rs.next()) {
            cg = new Carga();

            cg.setId(rs.getInt("id"));
            cg.setAutorizadoPor(funcDao.consulta(rs.getString("autorizado_por")));
            cg.setConferidoPor(funcDao.consulta(rs.getString("conferido_por")));

            LocalDate ld = rs.getDate("data_autorizacao").toLocalDate();
            cg.setDataAutorizacao(ld);

            LocalDate ld2 = rs.getDate("data_conferencia").toLocalDate();
            cg.setDataConferencia(ld2);

            psSec = conn.prepareStatement(sqlSec);
            psSec.setInt(1, cg.getId());
            rsSec = psSec.executeQuery();

            while (rsSec.next()) {
                NotaFiscal nf = nfDao.consulta(rsSec.getInt("notafiscal"));

                cg.getNotasFiscais().add(nf);
            }
        }

        if (rsSec != null) {
            rsSec.close();
            psSec.close();
        }
        rs.close();
        ps.close();

        return cg;
    }

    public ArrayList<Carga> listar() throws Exception {
        String sql;
        String sqlSec;
        ArrayList<Carga> cargas = new ArrayList<>();

        PreparedStatement ps = null;
        PreparedStatement psSec = null;

        ResultSet rs = null;
        ResultSet rsSec = null;

        sql = "SELECT id, autorizado_por, conferido_por, data_autorizacao, data_conferencia FROM carga";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            Carga cg = new Carga();

            cg.setId(rs.getInt("id"));
            cg.setAutorizadoPor(funcDao.consulta(rs.getString("autorizado_por")));
            cg.setConferidoPor(funcDao.consulta(rs.getString("conferido_por")));

            LocalDate ld = rs.getDate("data_autorizacao").toLocalDate();
            cg.setDataAutorizacao(ld);

            LocalDate ld2 = rs.getDate("data_conferencia").toLocalDate();
            cg.setDataConferencia(ld2);

            sqlSec = "SELECT notafiscal FROM carga_notafiscal WHERE carga = ?";
            psSec = conn.prepareStatement(sqlSec);
            psSec.setInt(1, cg.getId());
            rsSec = psSec.executeQuery();

            while (rsSec.next()) {
                NotaFiscal nf = nfDao.consulta(rsSec.getInt("notafiscal"));

                cg.getNotasFiscais().add(nf);
            }

            cargas.add(cg);
        }
        if (rsSec != null) {
            rsSec.close();
            psSec.close();
        }
        rs.close();
        ps.close();

        return cargas;
    }

    public int proximoCodigo() {
        String sql;
        PreparedStatement ps = null;
        int proximoCodigo = 0;

        try {
            sql = "SELECT MAX(id) FROM carga";

            ps = conn.prepareStatement(sql);
            ResultSet rs = null;
            rs = ps.executeQuery();

            if (rs.next()) {
                proximoCodigo = rs.getInt(1);
                proximoCodigo++;
            }

            ps.close();
        } catch (Exception e) {
        }

        return proximoCodigo;
    }

}
