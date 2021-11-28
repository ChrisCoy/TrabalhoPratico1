package com.mycompany.sgfc2.controller.DAO;

import com.mycompany.sgfc2.controller.Conexao;
import com.mycompany.sgfc2.model.Caminhao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class CaminhaoDAO {

    private Connection conn = null;
    private CargaDAO cgDao;
    private MotoristaDAO motDao;

    public CaminhaoDAO() {
        try {
            conn = Conexao.getConexao();
            cgDao = new CargaDAO();
            motDao = new MotoristaDAO();
        } catch (SQLException e) {
        } catch (Exception ex) {
        }
    }

    public void incluir(Caminhao cam) throws Exception{
        String sql;
        PreparedStatement ps = null;

        sql = "INSERT INTO caminhao(marca, ano_modelo, capacidade_carga, ultimarevisao, motorista, disponivel, quilometragem) VALUES (?, ?, ?, ?, ?, ?, ?)";


            ps = conn.prepareStatement(sql);
            ps.setString(1, cam.getMarca());
            ps.setInt(2, cam.getAnoModelo());
            ps.setFloat(3, cam.getCapacidadeCarga());

            SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
            Date data = Date.valueOf(cam.getUltimaRevisao());
            df.format(data);
            ps.setDate(4, data);

            ps.setString(5, cam.getMotorista().getCtps());
            ps.setBoolean(6, cam.isDisponivel());
            ps.setInt(7, cam.getQuilometragem());

            ps.execute();
            ps.close();

    }

    public void alterar(Caminhao cam, int id) throws Exception{
        String sql;
        PreparedStatement ps = null;

        sql = "UPDATE caminhao SET marca = ?, ano_modelo = ?, capacidade_carga = ?, ultimarevisao = ?, motorista = ?, disponivel = ?, quilometragem = ? WHERE id = ?";

            ps = conn.prepareStatement(sql);
            ps.setString(1, cam.getMarca());
            ps.setInt(2, cam.getAnoModelo());
            ps.setFloat(3, cam.getCapacidadeCarga());

            SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
            Date data = Date.valueOf(cam.getUltimaRevisao());
            df.format(data);
            ps.setDate(4, data);

            ps.setString(5, cam.getMotorista().getCtps());
            ps.setBoolean(6, cam.isDisponivel());
            ps.setInt(7, cam.getQuilometragem());

            ps.setInt(8, id);
            ps.execute();
            ps.close();

    }

    public void apagar(int id) throws Exception{
        String sql;
        PreparedStatement ps = null;

        sql = "DELETE FROM caminhao WHERE id = ?";


            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ps.close();

    }

    public Caminhao consulta(int id) throws Exception{
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Caminhao cam = null;

        sql = "SELECT id, marca, ano_modelo, capacidade_carga, ultimarevisao, motorista, disponivel, carga, quilometragem FROM caminhao WHERE id = ?";

            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                cam = new Caminhao();

                cam.setId(rs.getInt("id"));
                cam.setMarca(rs.getString("marca"));
                cam.setAnoModelo(rs.getInt("ano_modelo"));
                cam.setCapacidadeCarga(rs.getFloat("capacidade_carga"));

                LocalDate ld = rs.getDate("ultimarevisao").toLocalDate();
                cam.setUltimaRevisao(ld);

                cam.setMotorista(motDao.consulta(rs.getString("motorista")));
                cam.setDisponivel(rs.getBoolean("disponivel"));

                cam.setQuilometragem(rs.getInt("quilometragem"));

                if (rs.getObject("carga") != null) {
                    cam.setCarga(cgDao.consulta(rs.getInt("carga")));
                } else {
                    cam.setCarga(null);
                }

            }

            rs.close();
            ps.close();

        return cam;
    }

    public ArrayList<Caminhao> listar() throws Exception{
        String sql;
        ArrayList<Caminhao> caminhoes = new ArrayList<>();

        PreparedStatement ps = null;
        ResultSet rs = null;

        sql = "SELECT  id, marca, ano_modelo, capacidade_carga, ultimarevisao, motorista, disponivel, quilometragem, carga FROM caminhao";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Caminhao cam = new Caminhao();

                cam.setId(rs.getInt("id"));
                cam.setMarca(rs.getString("marca"));
                cam.setAnoModelo(rs.getInt("ano_modelo"));
                cam.setCapacidadeCarga(rs.getFloat("capacidade_carga"));

                LocalDate ld = rs.getDate("ultimarevisao").toLocalDate();
                cam.setUltimaRevisao(ld);

                cam.setMotorista(motDao.consulta(rs.getString("motorista")));
                cam.setDisponivel(rs.getBoolean("disponivel"));

                cam.setQuilometragem(rs.getInt("quilometragem"));

                if (rs.getObject("carga") != null) {
                    cam.setCarga(cgDao.consulta(rs.getInt("carga")));
                } else {
                    cam.setCarga(null);
                }

                caminhoes.add(cam);
            }
            rs.close();
            ps.close();


        return caminhoes;
    }

    public void updateCarga(Caminhao c, int id) throws Exception{
        String sql;
        PreparedStatement ps = null;

        sql = "UPDATE caminhao SET carga = ? WHERE id = ?";


            ps = conn.prepareStatement(sql);
            if (c != null) {
                if (c.getCarga() != null) {
                    ps.setInt(1, c.getCarga().getId());
                } 
            } else {
                ps.setNull(1, 0);
            }

            ps.setInt(2, id);

            ps.execute();
            ps.close();

    }

    public boolean temCarga(int id) throws Exception{
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Caminhao cam = null;

        sql = "SELECT id FROM caminhao WHERE carga = ?";

            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()){
                return true;
            }

            rs.close();
            ps.close();
            
        return false;
    }

    public Caminhao getCaminhaoCarga(int carga) throws Exception{
        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Caminhao cam = null;

        sql = "SELECT id, marca, ano_modelo, capacidade_carga, ultimarevisao, motorista, disponivel, carga, quilometragem FROM caminhao WHERE carga = ?";

            ps = conn.prepareStatement(sql);
            ps.setInt(1, carga);
            rs = ps.executeQuery();

            while (rs.next()) {
                cam = new Caminhao();

                cam.setId(rs.getInt("id"));
                cam.setMarca(rs.getString("marca"));
                cam.setAnoModelo(rs.getInt("ano_modelo"));
                cam.setCapacidadeCarga(rs.getFloat("capacidade_carga"));

                LocalDate ld = rs.getDate("ultimarevisao").toLocalDate();
                cam.setUltimaRevisao(ld);

                cam.setMotorista(motDao.consulta(rs.getString("motorista")));
                cam.setDisponivel(rs.getBoolean("disponivel"));

                cam.setQuilometragem(rs.getInt("quilometragem"));

                if (rs.getObject("carga") != null) {
                    cam.setCarga(cgDao.consulta(rs.getInt("carga")));
                } else {
                    cam.setCarga(null);
                }

            }

            rs.close();
            ps.close();

        return cam;
    }

    public int proximoCodigo(){
        String sql;
        PreparedStatement ps = null;
        int proximoCodigo = 0;

        sql = "SELECT MAX(id) FROM caminhao";

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
