/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import ondecomi.model.Avaliador;
import util.DBUtil;

/**
 *
 * @author Luan Amor
 */
public class AvaliadorDao {
    private PreparedStatement pstm;
    private Connection con;
    
    public AvaliadorDao(){
        con = DBUtil.getConnection();
    }
    
    public void addAvaliador(Avaliador avaliador){
        try {
            pstm = con.prepareStatement("insert into avaliador values(default, ?)");
            pstm.setString(1, avaliador.getNome());
            pstm.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteAvaliador(int idAvaliador) throws SQLException{
        try {
            PreparedStatement pstm = con.prepareStatement("delete from avalia_bar cascade where id_avaliador = ?;"
                                                        + "delete from avalia_hamburger cascade where id_avaliador = ?;"
                                                        + "delete from avalia_sushi cascade where id_avaliador = ?;"
                                                        + "delete from avaliador where id = ?;");
            pstm.setInt(1, idAvaliador);
            pstm.setInt(2, idAvaliador);
            pstm.setInt(3, idAvaliador);
            pstm.setInt(4, idAvaliador);
            pstm.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void updateAvaliador(Avaliador avaliador) throws SQLException{
        try {
            
            PreparedStatement pstm = con.prepareStatement("update avaliador set nome = ? where id = ?");
            pstm.setString(1, avaliador.getNome());
            pstm.setInt(2, avaliador.getIdAvaliador());
            pstm.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        con.close();
    }

}
