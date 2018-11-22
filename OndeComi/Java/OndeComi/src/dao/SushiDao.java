/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import ondecomi.model.Japones;
import util.DBUtil;

/**
 *
 * @author Luan Amor
 */
public class SushiDao {
        private PreparedStatement stm;
    private ResultSet rs;
    private final Connection con;
    
    public SushiDao(){
        con = DBUtil.getConnection();
    }
    
    public void addJapones(Japones japones){
        try {
            //Preenche tabela Japones
            stm = con.prepareStatement("insert into japones values(default, ?, ?, ?, ?, ?, ?, ?);");
            
            stm.setString(1, japones.getNomeLocal());
            stm.setString(2, japones.getEndereco());
            stm.setFloat(3, japones.getPreco());
            stm.setFloat(4, japones.getAmbiente());
            stm.setFloat(5, japones.getAtendimento());
            stm.setFloat(6, japones.getPeixeFresco());
            stm.setFloat(7, japones.getVariedades());
            
            stm.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally {
            try {
                stm.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    }
    
    public void addAvaliaJapones(int idAvaliador){
        try {
             stm = con.prepareStatement("select id from japones order by id desc limit 1");
             rs = stm.executeQuery();
             rs.next();
             int num = rs.getInt("id");
             System.out.println(num);
             stm = con.prepareStatement("insert into avalia_sushi values(?, ?);");
             stm.setInt(1, idAvaliador);
             stm.setInt(2, num);
             stm.executeUpdate();
             

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e);
           
        }finally{
            try {
                stm.close();
                rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
       
    }
    
    public void deleteJapones(int id){
         try {
             stm = con.prepareStatement("delete from avalia_sushi cascade where id_japones = ?;"
                                      + "delete from japones cascade where id = ?;");
             stm.setInt(1, id);
             stm.setInt(2, id);
             stm.execute();
             stm.close();
             
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
}
