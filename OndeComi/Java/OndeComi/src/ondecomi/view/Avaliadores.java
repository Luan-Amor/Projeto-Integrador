/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ondecomi.view;
import dao.AvaliadorDao;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ondecomi.model.Avaliador;
import util.DBUtil;
/**
 *
 * @author Luan Amor
 */
public class Avaliadores extends javax.swing.JFrame {
    AvaliadorDao dao = new AvaliadorDao();
    private ResultSet rs = null;
    private Connection con = DBUtil.getConnection();
    PreparedStatement pstm = null;
    DefaultListModel model = new DefaultListModel();
    /**
     * Creates new form Avaliadores
     */
    public Avaliadores() {
        initComponents();
        fillListSQL();
        setIcon();
    }
    
    private void fillListSQL(){
        
        try {
            String sql = "select * from avaliador";
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                String id = Integer.toString(rs.getInt("id"));
                String name = rs.getString("nome");
                
                //model.addElement(id);
                model.addElement(id+" "+name);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        jblAvaliadores = new javax.swing.JLabel();
        jlbTeste = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Avaliadores");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExcluir.setBackground(new Color(0,0,0,0));
        btnExcluir.setFont(new java.awt.Font("Bookman Old Style", 1, 30)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setBorderPainted(false);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.setFocusPainted(false);
        btnExcluir.setFocusable(false);
        btnExcluir.setOpaque(false);
        btnExcluir.setRequestFocusEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 160, 60));

        btnVoltar.setBackground(new Color(0,0,0,0));
        btnVoltar.setFont(new java.awt.Font("Bookman Old Style", 1, 30)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setBorderPainted(false);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setFocusPainted(false);
        btnVoltar.setFocusable(false);
        btnVoltar.setOpaque(false);
        btnVoltar.setRequestFocusEnabled(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 160, 60));

        btnEntrar.setBackground(new Color(0,0,0,0));
        btnEntrar.setFont(new java.awt.Font("Bookman Old Style", 1, 30)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setBorderPainted(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setFocusPainted(false);
        btnEntrar.setFocusable(false);
        btnEntrar.setOpaque(false);
        btnEntrar.setRequestFocusEnabled(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 160, 60));

        jblAvaliadores.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jblAvaliadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblAvaliadores.setText("Avaliadores");
        getContentPane().add(jblAvaliadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 480, 40));

        jlbTeste.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbTeste.setText("OndeComi?");
        getContentPane().add(jlbTeste, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 20));

        jList1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 320, 310));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ondecomi/view/Imagens/principal.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 620, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
           String a[] = new String[2];
           a = jList1.getSelectedValue().split(" ");
           System.out.println(a[0]);
           dao.deleteAvaliador(Integer.parseInt(a[0]));
           model.removeElementAt(jList1.getSelectedIndex());
           JOptionPane.showMessageDialog(null, "Avaliador Excluido");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed
    
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        //Pegando o ID
        String a[] = new String[3];
        a = jList1.getSelectedValue().split(" ");
        //Enviando o ID para a telaInicial e Instanciando 
        if(jList1.isSelectedIndex(jList1.getSelectedIndex())){
            TelaInicial rest = new TelaInicial();
            rest.setVisible(true);
            rest.recebeID(a[0],a[1]); //ID
            dispose();
            
        }else{
            JOptionPane.showMessageDialog(null, "Não existe avaliador para Cadastrado");
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    /*public void recebendo(String ava){
         jlbTeste.setText(ava);
    }*/
    
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
            java.util.logging.Logger.getLogger(Avaliadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Avaliadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Avaliadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Avaliadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Avaliadores().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblAvaliadores;
    private javax.swing.JLabel jlbTeste;
    // End of variables declaration//GEN-END:variables
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("food.png")));
    }

}
