package com.mycompany.sgfc2.controller.DAO;

import com.mycompany.sgfc2.controller.Conexao;
import com.mycompany.sgfc2.model.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EnderecoDAO {

    private Connection conn = null;

    public EnderecoDAO() {
        try {
            conn = Conexao.getConexao();
        } catch (SQLException e) {
        } catch (Exception ex) {
        }
    }

    public void incluir(Endereco end) throws Exception, SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "INSERT INTO endereco(id, rua, municipio, bairro, estado, numero, cep) VALUES (?, ?, ?, ?, ?, ?, ?)";

        ps = conn.prepareStatement(sql);
        ps.setInt(1, proximoCodigo());
        ps.setString(2, end.getRua());
        ps.setString(3, end.getMunicipio());
        ps.setString(4, end.getBairro());
        ps.setString(5, end.getEstado());
        ps.setInt(6, end.getNumero());
        ps.setString(7, end.getCep());

        ps.execute();
        ps.close();

    }

    public void alterar(Endereco end, int id) throws Exception {
        String sql;
        PreparedStatement ps = null;

        sql = "UPDATE endereco SET rua = ?, municipio = ?, bairro = ?, estado = ?, numero = ?, cep = ? WHERE id = ?";

        ps = conn.prepareStatement(sql);
        ps.setString(1, end.getRua());
        ps.setString(2, end.getMunicipio());
        ps.setString(3, end.getBairro());
        ps.setString(4, end.getEstado());
        ps.setInt(5, end.getNumero());
        ps.setString(6, end.getCep());

        ps.setInt(7, id);
        ps.execute();
        ps.close();

    }

    public void apagar(int id) throws Exception {
        String sql;
        PreparedStatement ps = null;

        sql = "DELETE FROM endereco WHERE id = ?";

        ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.execute();
        ps.close();

    }

    public Endereco consulta(int id) throws Exception {
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Endereco end = null;

        sql = "SELECT id, rua, municipio, bairro, estado, numero, cep FROM endereco WHERE id = ?";

        ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        rs = ps.executeQuery();

        while (rs.next()) {
            end = new Endereco();

            end.setId(rs.getInt("id"));
            end.setRua(rs.getString("rua"));
            end.setMunicipio(rs.getString("municipio"));
            end.setBairro(rs.getString("bairro"));
            end.setEstado(rs.getString("estado"));
            end.setNumero(rs.getInt("numero"));
            end.setCep(rs.getString("cep"));
        }

        rs.close();
        ps.close();
        return end;
    }

    public ArrayList<Endereco> listar() throws Exception {
        String sql;
        ArrayList<Endereco> enderecos = new ArrayList<>();

        PreparedStatement ps = null;
        ResultSet rs = null;

        sql = "SELECT id, rua, municipio, bairro, estado, numero, cep FROM endereco";
        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            Endereco end = new Endereco();

            end.setId(rs.getInt("id"));
            end.setRua(rs.getString("rua"));
            end.setMunicipio(rs.getString("municipio"));
            end.setBairro(rs.getString("bairro"));
            end.setEstado(rs.getString("estado"));
            end.setNumero(rs.getInt("numero"));
            end.setCep(rs.getString("cep"));

            enderecos.add(end);
        }
        rs.close();
        ps.close();

        return enderecos;
    }

    public int proximoCodigo() {
        String sql;
        PreparedStatement ps = null;
        int proximoCodigo = 0;

        sql = "SELECT MAX(id) FROM endereco";

        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = null;
            rs = ps.executeQuery();

            if (rs.next()) {
                proximoCodigo = rs.getInt(1);
                proximoCodigo++;
            }

            ps.close();
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        return proximoCodigo;
    }

}
