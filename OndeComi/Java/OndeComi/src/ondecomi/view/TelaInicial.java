/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ondecomi.view;

import java.awt.Color;
import java.awt.Toolkit;

/**
 *
 * @author Luan Amor
 */
public class TelaInicial extends javax.swing.JFrame {
    private String id; 
    private String nomeAvaliador;
    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
        setIcon();
    }
    
    public void recebeID(String id, String nome){
        this.id = id;
        this.nomeAvaliador = nome;
        
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
        btnBares = new javax.swing.JButton();
        btnJapones = new javax.swing.JButton();
        btnHamburgues = new javax.swing.JButton();
        btnVoltaAvaliadores = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Onde Comi?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 57, 430, -1));

        btnBares.setBackground(new Color(0,0,0,0));
        btnBares.setFont(new java.awt.Font("Bookman Old Style", 1, 30)); // NOI18N
        btnBares.setForeground(new java.awt.Color(255, 255, 255));
        btnBares.setText("Bares");
        btnBares.setBorderPainted(false);
        btnBares.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBares.setFocusPainted(false);
        btnBares.setFocusable(false);
        btnBares.setOpaque(false);
        btnBares.setRequestFocusEnabled(false);
        btnBares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaresActionPerformed(evt);
            }
        });
        getContentPane().add(btnBares, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 430, 60));

        btnJapones.setBackground(new Color(0,0,0,0));
        btnJapones.setFont(new java.awt.Font("Bookman Old Style", 1, 30)); // NOI18N
        btnJapones.setForeground(new java.awt.Color(255, 255, 255));
        btnJapones.setText("Restaurantes Japones");
        btnJapones.setBorderPainted(false);
        btnJapones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnJapones.setFocusPainted(false);
        btnJapones.setFocusable(false);
        btnJapones.setOpaque(false);
        btnJapones.setRequestFocusEnabled(false);
        btnJapones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJaponesActionPerformed(evt);
            }
        });
        getContentPane().add(btnJapones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 430, 60));

        btnHamburgues.setBackground(new Color(0,0,0,0));
        btnHamburgues.setFont(new java.awt.Font("Bookman Old Style", 1, 30)); // NOI18N
        btnHamburgues.setForeground(new java.awt.Color(255, 255, 255));
        btnHamburgues.setText("Hamburguerias");
        btnHamburgues.setBorderPainted(false);
        btnHamburgues.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHamburgues.setFocusPainted(false);
        btnHamburgues.setFocusable(false);
        btnHamburgues.setOpaque(false);
        btnHamburgues.setRequestFocusEnabled(false);
        btnHamburgues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHamburguesActionPerformed(evt);
            }
        });
        getContentPane().add(btnHamburgues, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 430, 63));

        btnVoltaAvaliadores.setBackground(new Color(0,0,0,0));
        btnVoltaAvaliadores.setFont(new java.awt.Font("Bookman Old Style", 1, 30)); // NOI18N
        btnVoltaAvaliadores.setText("Voltar");
        btnVoltaAvaliadores.setBorder(null);
        btnVoltaAvaliadores.setBorderPainted(false);
        btnVoltaAvaliadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltaAvaliadores.setFocusPainted(false);
        btnVoltaAvaliadores.setFocusable(false);
        btnVoltaAvaliadores.setOpaque(false);
        btnVoltaAvaliadores.setRequestFocusEnabled(false);
        btnVoltaAvaliadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltaAvaliadoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltaAvaliadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 130, 45));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ondecomi/view/Imagens/principal.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 460, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJaponesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJaponesActionPerformed
        JJapones telaJapa = new JJapones();
        telaJapa.setVisible(true);
        telaJapa.recebeId(id, nomeAvaliador);
        dispose();
    }//GEN-LAST:event_btnJaponesActionPerformed

    private void btnBaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaresActionPerformed
        JBar irParaBar = new JBar();
        irParaBar.setVisible(true);
        irParaBar.recebeId(id, nomeAvaliador);
        dispose();
    }//GEN-LAST:event_btnBaresActionPerformed

    private void btnVoltaAvaliadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltaAvaliadoresActionPerformed
        Avaliadores avaliadores = new Avaliadores();
        avaliadores.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltaAvaliadoresActionPerformed

    private void btnHamburguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHamburguesActionPerformed
        JHamburguerias ham = new JHamburguerias();
        ham.setVisible(true);
        ham.recebeId(id, nomeAvaliador);
        dispose();
    }//GEN-LAST:event_btnHamburguesActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
    
     private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("food.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBares;
    private javax.swing.JButton btnHamburgues;
    private javax.swing.JButton btnJapones;
    private javax.swing.JButton btnVoltaAvaliadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}