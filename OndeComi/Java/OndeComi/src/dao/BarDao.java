/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import ondecomi.model.Bar;
import util.DBUtil;

/**
 *
 * @author Luan Amor
 */
public class BarDao {
    private PreparedStatement stm;
    private ResultSet rs;
    private Connection con;
    
    public BarDao(){
        con = DBUtil.getConnection();
    }
    
    public void addBar(Bar bar){
        try {
            //Preenche tabela Bar
            stm = con.prepareStatement("insert into bar values(default, ?, ?, ?, ?, ?, ?, ?);");
            
            stm.setString(1, bar.getNomeLocal());
            stm.setString(2, bar.getEndereco());
            stm.setFloat(3, bar.getPreco());
            stm.setFloat(4, bar.getAmbiente());
            stm.setFloat(5, bar.getAtendimento());
            stm.setFloat(6, bar.getBebidaGelada());
            stm.setFloat(7, bar.getDrinks());
            
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
    
    public void addAvaliaBar(int idAvaliador){
        try {
             stm = con.prepareStatement("select id from bar order by id desc limit 1");
             rs = stm.executeQuery();
             rs.next();
             int num = rs.getInt("id");
             System.out.println(num);
             stm = con.prepareStatement("insert into avalia_bar values(?, ?);");
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
    
    public void deleteBar(int id){
         try {
             stm = con.prepareStatement("delete from avalia_bar cascade where id_bar = ?;"
                                      + "delete from bar cascade where id = ?;");
             stm.setInt(1, id);
             stm.setInt(2, id);
             stm.execute();
             stm.close();
             
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
    
    /*public Bar verBar(int id){
        Bar bar;
        try {
            stm = con.prepareStatement("select * from bar where = id = ?");
            stm.setInt(1, id);
            rs = stm.executeQuery();
            while(rs.next()){
                String nome = rs.getString("nome");
                String endereco = rs.getString("endereco");
                float preco = rs.getFloat("preco");
                float ambiente = rs.getFloat("ambiente");
                float atendimento = rs.getFloat("atendimento");
                float gelada = rs.getFloat("gelada");
                float drinks = rs.getFloat("drinks");
                
                bar = new Bar(nome, endereco, preco, ambiente, atendimento, gelada, drinks);
            }
            return bar;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }finally{
            try {
                stm.close();
            } catch (Exception e) {
            }
        }
        
    }*/
    
}
