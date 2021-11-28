package com.mycompany.sgfc2.controller.DAO;

import com.mycompany.sgfc2.controller.Conexao;
import com.mycompany.sgfc2.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoDAO {

    private Connection conn = null;

    public ProdutoDAO() {
        try {
            conn = Conexao.getConexao();
        } catch (SQLException e) {
        } catch (Exception ex) {
        }
    }

    public void incluir(Produto prod) throws Exception {
        String sql;
        PreparedStatement ps = null;

        sql = "INSERT INTO produto(id, nome, peso, preco) VALUES (?, ?, ?, ?)";

        ps = conn.prepareStatement(sql);
        ps.setInt(1, proximoCodigo());
        ps.setString(2, prod.getNome());
        ps.setFloat(3, prod.getPeso());
        ps.setFloat(4, prod.getPreco());
        ps.execute();
        ps.close();

    }

    public void alterar(Produto prod, int id) throws Exception {
        String sql;
        PreparedStatement ps = null;

        sql = "UPDATE produto SET nome = ?, peso = ?, preco = ? WHERE id = ?";

        ps = conn.prepareStatement(sql);
        ps.setString(1, prod.getNome());
        ps.setFloat(2, prod.getPeso());
        ps.setFloat(3, prod.getPreco());

        ps.setInt(4, id);
        ps.execute();
        ps.close();

    }

    public void apagar(int id) throws Exception {
        String sql;
        PreparedStatement ps = null;

        sql = "DELETE FROM produto WHERE id = ?";

        ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.execute();
        ps.close();

    }

    public Produto consulta(int id) throws Exception {
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Produto prod = null;

        sql = "SELECT id, nome, peso, preco FROM produto WHERE id = ?";

        ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        rs = ps.executeQuery();

        while (rs.next()) {
            prod = new Produto();
            prod.setId(rs.getInt("id"));
            prod.setNome(rs.getString("nome"));
            prod.setPeso(rs.getFloat("peso"));
            prod.setPreco(rs.getFloat("preco"));
        }

        rs.close();
        ps.close();

        return prod;
    }

    public ArrayList<Produto> listar() throws Exception {
        String sql;
        ArrayList<Produto> produtos = new ArrayList<>();

        PreparedStatement ps = null;
        ResultSet rs = null;

        sql = "SELECT id, nome, peso, preco FROM produto";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            Produto prod = new Produto();

            prod.setId(rs.getInt("id"));
            prod.setNome(rs.getString("nome"));
            prod.setPeso(rs.getFloat("peso"));
            prod.setPreco(rs.getFloat("preco"));

            produtos.add(prod);
        }
        rs.close();
        ps.close();

        return produtos;
    }

    public int proximoCodigo() {
        String sql;
        PreparedStatement ps = null;
        int proximoCodigo = 0;

        sql = "SELECT MAX(id) FROM produto";

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
        }

        return proximoCodigo;
    }

}
