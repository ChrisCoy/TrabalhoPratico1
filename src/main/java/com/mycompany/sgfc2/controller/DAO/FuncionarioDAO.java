package com.mycompany.sgfc2.controller.DAO;

import com.mycompany.sgfc2.controller.Conexao;
import com.mycompany.sgfc2.model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FuncionarioDAO {

    private Connection conn = null;

    public FuncionarioDAO() {
        try {
            conn = Conexao.getConexao();
        } catch (SQLException e) {
        } catch (Exception ex) {
        }
    }

    public void incluir(Funcionario func) throws Exception {
        String sql;
        PreparedStatement ps = null;

        sql = "INSERT INTO funcionario(nome, salario, ctps, funcao, nivel_permissao) VALUES (?, ?, ?, ?, ?)";

        ps = conn.prepareStatement(sql);
        ps.setString(1, func.getNome());
        ps.setFloat(2, func.getSalario());
        ps.setString(3, func.getCtps());
        ps.setString(4, func.getFuncao());
        ps.setInt(5, func.getNivelPermissao());

        ps.execute();
        ps.close();

    }

    public void alterar(Funcionario func, String ctps) throws Exception {
        String sql;
        PreparedStatement ps = null;

        sql = "UPDATE funcionario SET nome = ?, salario = ?, funcao = ?, nivel_permissao = ? WHERE ctps = ?";

        ps = conn.prepareStatement(sql);
        ps.setString(1, func.getNome());
        ps.setFloat(2, func.getSalario());
        ps.setString(3, func.getFuncao());
        ps.setInt(4, func.getNivelPermissao());

        ps.setString(5, ctps);

        ps.execute();
        ps.close();
    }

    public void apagar(String ctps) throws Exception {
        String sql;
        PreparedStatement ps = null;

        sql = "DELETE FROM funcionario WHERE ctps = ?";

        ps = conn.prepareStatement(sql);
        ps.setString(1, ctps);
        ps.execute();
        ps.close();

    }

    public Funcionario consulta(String ctps) throws Exception {
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Funcionario func = null;

        sql = "SELECT nome, salario, ctps, funcao, nivel_permissao FROM funcionario WHERE ctps = ?";

        ps = conn.prepareStatement(sql);
        ps.setString(1, ctps);
        rs = ps.executeQuery();

        while (rs.next()) {
            func = new Funcionario();

            func.setNome(rs.getString("nome"));
            func.setSalario(rs.getFloat("salario"));
            func.setCtps(rs.getString("ctps"));
            func.setFuncao(rs.getString("funcao"));
            func.setNivelPermissao(rs.getInt("nivel_permissao"));
        }

        rs.close();
        ps.close();

        return func;
    }

    public ArrayList<Funcionario> listar() throws Exception {
        String sql;
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        PreparedStatement ps = null;
        ResultSet rs = null;

        sql = "SELECT nome, salario, ctps, funcao, nivel_permissao FROM funcionario";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            Funcionario func = new Funcionario();
            func.setNome(rs.getString("nome"));
            func.setSalario(rs.getFloat("salario"));
            func.setCtps(rs.getString("ctps"));
            func.setFuncao(rs.getString("funcao"));
            func.setNivelPermissao(rs.getInt("nivel_permissao"));

            funcionarios.add(func);
        }

        rs.close();
        ps.close();

        return funcionarios;
    }

}
