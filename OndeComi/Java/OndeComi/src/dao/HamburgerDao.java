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
import ondecomi.model.Hamburgueria;
import util.DBUtil;

/**
 *
 * @author Luan Amor
 */
public class HamburgerDao {
    private PreparedStatement stm;
    private ResultSet rs;
    private Connection con;
    
    public HamburgerDao(){
        con = DBUtil.getConnection();
    }
    
    public void addHamburgueria(Hamburgueria hamburgueria){
        try {
            //Preenche tabela Bar
            stm = con.prepareStatement("insert into hamburgueria values(default, ?, ?, ?, ?, ?, ?, ?);");
            
            stm.setString(1, hamburgueria.getNomeLocal());
            stm.setString(2, hamburgueria.getEndereco());
            stm.setFloat(3, hamburgueria.getPreco());
            stm.setFloat(4, hamburgueria.getAmbiente());
            stm.setFloat(5, hamburgueria.getAtendimento());
            stm.setFloat(6, hamburgueria.getHamburger());
            stm.setFloat(7, hamburgueria.getAcompanhamentos());
            
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
    
    public void addAvaliaHam(int idAvaliador){
        try {
             stm = con.prepareStatement("select id from Hamburgueria order by id desc limit 1");
             rs = stm.executeQuery();
             rs.next();
             int num = rs.getInt("id");
             System.out.println(num);
             stm = con.prepareStatement("insert into avalia_hamburger values(?, ?);");
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
    
    public void deleteHamburger(int id){
         try {
             stm = con.prepareStatement("delete from avalia_hamburger cascade where id_hamburgueria = ?;"
                                      + "delete from hamburgueria cascade where id = ?;");
             stm.setInt(1, id);
             stm.setInt(2, id);
             stm.execute();
             stm.close();
             
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
}
