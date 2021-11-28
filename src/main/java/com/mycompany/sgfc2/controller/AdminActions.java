package com.mycompany.sgfc2.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminActions {

    private Connection conn = null;

    public AdminActions() {
        try {
            conn = Conexao.getConexao();
        } catch (SQLException e) {
        } catch (Exception ex) {
        }
    }

    public void apagaTudo() throws Exception {
        String sql;
        PreparedStatement ps = null;

        sql = "TRUNCATE TABLE caminhao, carga, carga_notafiscal, endereco, funcionario, motorista, notafiscal, notafiscal_produto, produto";

        ps = conn.prepareStatement(sql);

        ps.execute();
        ps.close();
    }
}
