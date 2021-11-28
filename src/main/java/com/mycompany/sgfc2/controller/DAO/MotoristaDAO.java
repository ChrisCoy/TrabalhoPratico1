package com.mycompany.sgfc2.controller.DAO;

import com.mycompany.sgfc2.controller.Conexao;
import com.mycompany.sgfc2.model.Motorista;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class MotoristaDAO {

    private Connection conn = null;

    public MotoristaDAO() {
        try {
            conn = Conexao.getConexao();
        } catch (SQLException e) {
        } catch (Exception ex) {
        }
    }

    public void incluir(Motorista mot) throws Exception {
        String sql;
        PreparedStatement ps = null;

        sql = "INSERT INTO motorista(nome, salario, ctps, cnh, tipo_carteira, data_validade) VALUES (?, ?, ?, ?, ?, ?)";

        ps = conn.prepareStatement(sql);
        ps.setString(1, mot.getNome());
        ps.setFloat(2, mot.getSalario());
        ps.setString(3, mot.getCtps());
        ps.setString(4, mot.getCnh());
        ps.setString(5, mot.getTipoCarteira());

        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        Date data = Date.valueOf(mot.getDataValidade());
        df.format(data);

        ps.setDate(6, data);

        ps.execute();
        ps.close();
    }

    public void alterar(Motorista mot, String ctps) throws Exception {
        String sql;
        PreparedStatement ps = null;

        sql = "UPDATE motorista SET nome = ?, salario = ?, cnh = ?, tipo_carteira = ?, data_validade = ? WHERE ctps = ?";

        ps = conn.prepareStatement(sql);
        ps.setString(1, mot.getNome());
        ps.setFloat(2, mot.getSalario());
        ps.setString(3, mot.getCnh());
        ps.setString(4, mot.getTipoCarteira());

        SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        Date data = Date.valueOf(mot.getDataValidade());
        df.format(data);
        ps.setDate(5, data);

        ps.setString(6, ctps);
        ps.execute();
        ps.close();

    }

    public void apagar(String ctps) throws Exception {
        String sql;
        PreparedStatement ps = null;

        sql = "DELETE FROM motorista WHERE ctps = ?";

        ps = conn.prepareStatement(sql);
        ps.setString(1, ctps);
        ps.execute();
        ps.close();

    }

    public Motorista consulta(String ctps) throws Exception {
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Motorista mot = null;

        sql = "SELECT nome, salario, ctps, cnh, tipo_carteira, data_validade FROM motorista WHERE ctps = ?";

        ps = conn.prepareStatement(sql);
        ps.setString(1, ctps);
        rs = ps.executeQuery();

        while (rs.next()) {
            mot = new Motorista();
            mot.setNome(rs.getString("nome"));
            mot.setSalario(rs.getFloat("salario"));
            mot.setCtps(rs.getString("ctps"));
            mot.setCnh(rs.getString("cnh"));
            mot.setTipoCarteira(rs.getString("tipo_carteira"));

            LocalDate ld = rs.getDate("data_validade").toLocalDate();
            mot.setDataValidade(ld);
        }

        rs.close();
        ps.close();

        return mot;
    }

    public ArrayList<Motorista> listar() throws Exception {
        String sql;
        ArrayList<Motorista> motoristas = new ArrayList<>();

        PreparedStatement ps = null;
        ResultSet rs = null;

        sql = "SELECT nome, salario, ctps, cnh, tipo_carteira, data_validade FROM motorista";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            Motorista mot = new Motorista();

            mot.setNome(rs.getString("nome"));
            mot.setSalario(rs.getFloat("salario"));
            mot.setCtps(rs.getString("ctps"));
            mot.setCnh(rs.getString("cnh"));
            mot.setTipoCarteira(rs.getString("tipo_carteira"));

            LocalDate ld = rs.getDate("data_validade").toLocalDate();
            mot.setDataValidade(ld);

            motoristas.add(mot);
        }

        rs.close();
        ps.close();

        return motoristas;
    }

}
