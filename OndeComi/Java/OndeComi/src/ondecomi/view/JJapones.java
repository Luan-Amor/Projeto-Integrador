/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ondecomi.view;

import dao.SushiDao;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import util.DBUtil;

/**
 *
 * @author Luan Amor
 */
public class JJapones extends javax.swing.JFrame {
    private String nome;
    private int idAvaliador;
    private ResultSet rs = null;
    private Connection con = DBUtil.getConnection();
    private PreparedStatement pstm = null;
    private DefaultListModel model = new DefaultListModel();
    private SushiDao dao = new SushiDao();
    /**
     * Creates new form JJapones
     */
    public JJapones() {
        initComponents();
        fillJaponesGeral();
        setIcon();
    }
     public void limpaRank(){
        model.removeAllElements();
    }
    
    public void recebeId(String id, String nome){
        int idInt = Integer.parseInt(id);
        this.nome = nome;
        this.idAvaliador = idInt;
    }
    
        
    public void fillJaponesGeral(){
        try {
            pstm = con.prepareStatement("select id, nome, mediaGeral(preco, ambiente, atendimento, variedades, peixefresco) as media\n" +
                                        "from japones inner join avalia_sushi\n" +
                                        "on id_japones = id\n" +
                                        "where id_avaliador = ? order by media desc;");
            //pstm = con.prepareStatement(sql);
            pstm.setInt(1, idAvaliador);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                //pega os parametros do select 
                String id = Integer.toString(rs.getInt("id"));
                String name = rs.getString("nome");
                String nota = Float.toString(rs.getFloat("media"));
                //passa os parametros para a lista
                model.addElement(id+" | "+nota+" | "+name);
            }
            jList1.setModel(model);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                rs.close();
                pstm.close();
            } catch (Exception e) {
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnVoltarTela = new javax.swing.JButton();
        btnMaisBar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnRankPreco = new javax.swing.JButton();
        btnRankVariedades = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblRank = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRankAmbiente = new javax.swing.JButton();
        btnRankAtendimento = new javax.swing.JButton();
        btnRankPeixe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRankGeral = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restaurentes Japonês");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltarTela.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        btnVoltarTela.setText("Voltar");
        btnVoltarTela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltarTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarTelaActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltarTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 125, 45));

        btnMaisBar.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        btnMaisBar.setText("Adicionar");
        btnMaisBar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMaisBar.setBorderPainted(false);
        btnMaisBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMaisBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisBarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMaisBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 140, 45));

        jList1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setMaximumSize(new java.awt.Dimension(71, 170));
        jList1.setMinimumSize(new java.awt.Dimension(71, 170));
        jList1.setPreferredSize(new java.awt.Dimension(71, 170));
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 268, 260));

        btnRankPreco.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        btnRankPreco.setText("Preço");
        btnRankPreco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRankPreco.setBorderPainted(false);
        btnRankPreco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRankPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankPrecoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRankPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 140, 41));

        btnRankVariedades.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        btnRankVariedades.setText("Variedades");
        btnRankVariedades.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRankVariedades.setBorderPainted(false);
        btnRankVariedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRankVariedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankVariedadesActionPerformed(evt);
            }
        });
        getContentPane().add(btnRankVariedades, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 160, 41));

        btnDelete.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        btnDelete.setText("Deletar");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.setBorderPainted(false);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 128, 45));

        lblRank.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRank.setText("RANK's");
        getContentPane().add(lblRank, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cod.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nota");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nome");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        btnRankAmbiente.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        btnRankAmbiente.setText("Ambiente");
        btnRankAmbiente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRankAmbiente.setBorderPainted(false);
        btnRankAmbiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRankAmbiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankAmbienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnRankAmbiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 150, 41));

        btnRankAtendimento.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        btnRankAtendimento.setText("Atendimento");
        btnRankAtendimento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRankAtendimento.setBorderPainted(false);
        btnRankAtendimento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRankAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankAtendimentoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRankAtendimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 170, 41));

        btnRankPeixe.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        btnRankPeixe.setText("Peixe Fresco");
        btnRankPeixe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRankPeixe.setBorderPainted(false);
        btnRankPeixe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRankPeixe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankPeixeActionPerformed(evt);
            }
        });
        getContentPane().add(btnRankPeixe, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 180, 41));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Japonês");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        btnRankGeral.setFont(new java.awt.Font("Bookman Old Style", 1, 20)); // NOI18N
        btnRankGeral.setText("Geral");
        btnRankGeral.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRankGeral.setBorderPainted(false);
        btnRankGeral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRankGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRankGeralActionPerformed(evt);
            }
        });
        getContentPane().add(btnRankGeral, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 130, 41));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ondecomi/view/Imagens/Japones.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, 0, 750, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarTelaActionPerformed
        TelaInicial inicial = new TelaInicial();
        inicial.setVisible(true);
        inicial.recebeID(Integer.toString(idAvaliador), nome);
        dispose();
    }//GEN-LAST:event_btnVoltarTelaActionPerformed

    private void btnMaisBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisBarActionPerformed
        NovoJapones novoJapa = new NovoJapones();
        novoJapa.setVisible(true);
        novoJapa.recebeId(idAvaliador, nome);
        dispose();
    }//GEN-LAST:event_btnMaisBarActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String a[] = new String[2];
        a = jList1.getSelectedValue().split(" ");
        System.out.println(a[0]+": "+a[1]);
        try {
            if(jList1.isSelectedIndex(jList1.getSelectedIndex())){
                dao.deleteJapones(Integer.parseInt(a[0]));
                model.removeElementAt(jList1.getSelectedIndex());
                JOptionPane.showMessageDialog(null, "Japones excluído");
                
            }else{
                JOptionPane.showMessageDialog(null, "Selecione um Japones antes de deletar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
    }//GEN-LAST:event_btnDeleteActionPerformed

    //RANK's
    private void btnRankGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankGeralActionPerformed
        limpaRank();
        fillJaponesGeral();
    }//GEN-LAST:event_btnRankGeralActionPerformed

    private void btnRankPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankPrecoActionPerformed
       limpaRank();
        try {
            pstm = con.prepareStatement("select id, nome, preco \n" +
                                        "from japones inner join avalia_sushi\n" +
                                        "on id = id_japones\n" +
                                        "where id_avaliador = ? order by preco desc");
            pstm.setInt(1, idAvaliador);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                String id = Integer.toString(rs.getInt("id"));
                String nome = rs.getString("nome");
                String nota = Float.toString(rs.getFloat("preco"));
                //Adicionando na lista
                model.addElement(id+" | "+nota+ " | "+ nome);
            }
            jList1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                pstm.close();
                rs.close();
            }catch(Exception e1){
                JOptionPane.showMessageDialog(null, e1);
            } 
            
        }
    }//GEN-LAST:event_btnRankPrecoActionPerformed

    private void btnRankAmbienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankAmbienteActionPerformed
        limpaRank();
        try {
            pstm = con.prepareStatement("select id, nome, ambiente \n" +
                                        "from japones inner join avalia_sushi\n" +
                                        "on id = id_japones\n" +
                                        "where id_avaliador = ? order by ambiente desc");
            pstm.setInt(1, idAvaliador);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                String id = Integer.toString(rs.getInt("id"));
                String nome = rs.getString("nome");
                String preco = Float.toString(rs.getFloat("ambiente"));
                //Adicionando na lista
                model.addElement(id+" | "+preco+ " | "+ nome);
            }
            jList1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                pstm.close();
                rs.close();
            }catch(Exception e1){
                JOptionPane.showMessageDialog(null, e1);
            } 
            
        }
    }//GEN-LAST:event_btnRankAmbienteActionPerformed

    private void btnRankAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankAtendimentoActionPerformed
        limpaRank();
        try {
            pstm = con.prepareStatement("select id, nome, atendimento \n" +
                                        "from japones inner join avalia_sushi\n" +
                                        "on id = id_japones\n" +
                                        "where id_avaliador = ? order by atendimento desc");
            pstm.setInt(1, idAvaliador);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                String id = Integer.toString(rs.getInt("id"));
                String nome = rs.getString("nome");
                String preco = Float.toString(rs.getFloat("atendimento"));
                //Adicionando na lista
                model.addElement(id+" | "+preco+ " | "+ nome);
            }
            jList1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                pstm.close();
                rs.close();
            }catch(Exception e1){
                JOptionPane.showMessageDialog(null, e1);
            } 
            
        }
    }//GEN-LAST:event_btnRankAtendimentoActionPerformed

    private void btnRankPeixeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankPeixeActionPerformed
        limpaRank();
        try {
            pstm = con.prepareStatement("select id, nome, peixefresco \n" +
                                        "from japones inner join avalia_sushi\n" +
                                        "on id = id_japones\n" +
                                        "where id_avaliador = ? order by peixefresco desc");
            pstm.setInt(1, idAvaliador);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                String id = Integer.toString(rs.getInt("id"));
                String nome = rs.getString("nome");
                String preco = Float.toString(rs.getFloat("peixefresco"));
                //Adicionando na lista
                model.addElement(id+" | "+preco+ " | "+ nome);
            }
            jList1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                pstm.close();
                rs.close();
            }catch(Exception e1){
                JOptionPane.showMessageDialog(null, e1);
            } 
            
        }
    }//GEN-LAST:event_btnRankPeixeActionPerformed

    private void btnRankVariedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRankVariedadesActionPerformed
       limpaRank();
        try {
            pstm = con.prepareStatement("select id, nome, variedades \n" +
                                        "from japones inner join avalia_sushi\n" +
                                        "on id = id_japones\n" +
                                        "where id_avaliador = ? order by variedades desc");
            pstm.setInt(1, idAvaliador);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                String id = Integer.toString(rs.getInt("id"));
                String nome = rs.getString("nome");
                String preco = Float.toString(rs.getFloat("variedades"));
                //Adicionando na lista
                model.addElement(id+" | "+preco+ " | "+ nome);
            }
            jList1.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                pstm.close();
                rs.close();
            }catch(Exception e1){
                JOptionPane.showMessageDialog(null, e1);
            } 
            
        }
    }//GEN-LAST:event_btnRankVariedadesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JJapones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JJapones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JJapones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JJapones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JJapones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnMaisBar;
    private javax.swing.JButton btnRankAmbiente;
    private javax.swing.JButton btnRankAtendimento;
    private javax.swing.JButton btnRankGeral;
    private javax.swing.JButton btnRankPeixe;
    private javax.swing.JButton btnRankPreco;
    private javax.swing.JButton btnRankVariedades;
    private javax.swing.JButton btnVoltarTela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRank;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("food.png")));
    }
}
