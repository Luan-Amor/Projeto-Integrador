/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ondecomi.view;
import dao.BarDao;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import ondecomi.model.Bar;
/**
 *
 * @author Luan Amor
 */
public class NovoBar extends javax.swing.JFrame {
    private BarDao dao = new BarDao();
    private int id;
    private String nomeAvaliador;
    private String end = "Endereço";
    private String nome = "Nome";
    private float preco = 0;
    private float ambiente = 0;
    private float atendimento = 0;
    private float gelada = 0;
    private float drinks = 0;
    

    /**
     * Creates new form NovoBar
     */
    public NovoBar() {
        initComponents();
        setIcon();
    }
    
    public void recebeId(int id, String nome){
        this.nomeAvaliador = nome;
        this.id = id;
        
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
        lbend = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        notaBebidaBar = new javax.swing.JFormattedTextField();
        notaAmbienteBar = new javax.swing.JFormattedTextField();
        notaDrinkBar = new javax.swing.JFormattedTextField();
        notaAtendimentoBar = new javax.swing.JFormattedTextField();
        notaPrecoBar = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNomeBar = new javax.swing.JTextField();
        txtEndBar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        notaGeralBar = new javax.swing.JLabel();
        btnVoltarBar = new javax.swing.JButton();
        btnSalvarBar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Novo Bar");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        lbend.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbend.setForeground(new java.awt.Color(255, 255, 255));
        lbend.setText("Endereço:");
        getContentPane().add(lbend, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 30));

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Preço.............................................");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ambiente.......................................");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Notas de 0 a 9:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        try {
            notaBebidaBar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        notaBebidaBar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        notaBebidaBar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(notaBebidaBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 40, 30));

        try {
            notaAmbienteBar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        notaAmbienteBar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        notaAmbienteBar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(notaAmbienteBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 40, 30));

        try {
            notaDrinkBar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        notaDrinkBar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        notaDrinkBar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(notaDrinkBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 40, 30));

        try {
            notaAtendimentoBar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        notaAtendimentoBar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        notaAtendimentoBar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(notaAtendimentoBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 40, 30));

        try {
            notaPrecoBar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        notaPrecoBar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        notaPrecoBar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(notaPrecoBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 40, 30));

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Atendimento..................................");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bebida gelada................................. ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Drinks............................................");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txtNomeBar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeBar.setText("Informe o nome do Bar");
        getContentPane().add(txtNomeBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 270, 30));

        txtEndBar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEndBar.setText("Qual o endereço?");
        getContentPane().add(txtEndBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 270, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nota Geral");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        notaGeralBar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        notaGeralBar.setForeground(new java.awt.Color(255, 255, 255));
        notaGeralBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notaGeralBar.setText("0.0");
        getContentPane().add(notaGeralBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 360, 40, -1));

        btnVoltarBar.setBackground(new Color(0,0,0,0));
        btnVoltarBar.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        btnVoltarBar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarBar.setText("Voltar");
        btnVoltarBar.setBorder(null);
        btnVoltarBar.setBorderPainted(false);
        btnVoltarBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltarBar.setFocusPainted(false);
        btnVoltarBar.setFocusable(false);
        btnVoltarBar.setOpaque(false);
        btnVoltarBar.setRequestFocusEnabled(false);
        btnVoltarBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarBarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltarBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 150, -1));

        btnSalvarBar.setBackground(new Color(0,0,0,0));
        btnSalvarBar.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        btnSalvarBar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarBar.setText("Salvar");
        btnSalvarBar.setBorder(null);
        btnSalvarBar.setBorderPainted(false);
        btnSalvarBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarBar.setFocusPainted(false);
        btnSalvarBar.setFocusable(false);
        btnSalvarBar.setOpaque(false);
        btnSalvarBar.setRequestFocusEnabled(false);
        btnSalvarBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarBarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 145, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ondecomi/view/Imagens/novobar.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, 0, 580, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    

    private void btnSalvarBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarBarActionPerformed
    //Instancia a class Bar
        end = txtEndBar.getText();
        nome = txtNomeBar.getText();
        preco = new Float(notaPrecoBar.getText()); //Float.parseFloat(notaPrecoBar.getText());
        ambiente = new Float(notaAmbienteBar.getText()); //Float.parseFloat(notaAmbienteBar.getText());
        atendimento = new Float(notaAtendimentoBar.getText()); //Float.parseFloat(notaAtendimentoBar.getText());
        gelada = new Float(notaBebidaBar.getText()); //(Float.parseFloat(notaBebidaBar.getText());
        drinks = new Float(notaDrinkBar.getText()); // Float.parseFloat(notaDrinkBar.getText());
        
        Bar bar = new Bar(nome, end, preco, ambiente, atendimento, gelada, drinks);
    //Preenchendo tabela BD : BAR e Avalia_Bar
        dao.addBar(bar);
        dao.addAvaliaBar(id);
    //NotaGeral
        float a1 = (preco + ambiente + atendimento + gelada + drinks)/5;
        notaGeralBar.setText(Float.toString(a1));
        JOptionPane.showMessageDialog(null, "Novo Bar adicionado!");
        //Fechando a tela
        JBar bares = new JBar();
        bares.setVisible(true);
        bares.recebeId(Integer.toString(id), nomeAvaliador);
        System.out.println(id+": "+ nomeAvaliador); 
        dispose();
    }//GEN-LAST:event_btnSalvarBarActionPerformed

    //voltar para bares
    private void btnVoltarBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarBarActionPerformed
        JBar bares = new JBar();
        bares.setVisible(true);
        bares.recebeId(Integer.toString(id), nomeAvaliador);
        System.out.println(id+": "+ nomeAvaliador); 
        dispose();
    }//GEN-LAST:event_btnVoltarBarActionPerformed
    
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
            java.util.logging.Logger.getLogger(NovoBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoBar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoBar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarBar;
    private javax.swing.JButton btnVoltarBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbend;
    private javax.swing.JFormattedTextField notaAmbienteBar;
    private javax.swing.JFormattedTextField notaAtendimentoBar;
    private javax.swing.JFormattedTextField notaBebidaBar;
    private javax.swing.JFormattedTextField notaDrinkBar;
    private javax.swing.JLabel notaGeralBar;
    private javax.swing.JFormattedTextField notaPrecoBar;
    private javax.swing.JTextField txtEndBar;
    private javax.swing.JTextField txtNomeBar;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("food.png")));
    }
}