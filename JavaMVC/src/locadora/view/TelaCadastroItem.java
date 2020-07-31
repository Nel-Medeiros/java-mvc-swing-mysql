/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.view;

/**
 *
 * @author Nel
 */
public class TelaCadastroItem extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroItem
     */
    public TelaCadastroItem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCadastroItem = new javax.swing.JLabel();
        jPanelCadastroItem = new javax.swing.JPanel();
        jLabelTituloFilme = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelPreco = new javax.swing.JLabel();
        jTextFieldTituloFilme = new javax.swing.JTextField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jButtonBuscar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jFormattedTextFieldPreco = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vídeo Locadora Nostalgia");
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jLabelCadastroItem.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelCadastroItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon.png"))); // NOI18N
        jLabelCadastroItem.setText("Cadastro de Item");

        jPanelCadastroItem.setBackground(new java.awt.Color(102, 102, 102));
        jPanelCadastroItem.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelTituloFilme.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTituloFilme.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloFilme.setText("Título:");

        jLabelTipo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipo.setText("Tipo:");

        jLabelPreco.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelPreco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPreco.setText("Preço:");

        jTextFieldTituloFilme.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldTituloFilme.setToolTipText("Informe o título do filme.");
        jTextFieldTituloFilme.setEnabled(false);

        jComboBoxTipo.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um tipo", "Blu-Ray Disc", "CD", "DVD", "VHS", " " }));
        jComboBoxTipo.setToolTipText("Escolha um tipo de item");

        jButtonBuscar.setText("Buscar");

        jButtonSalvar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonSalvar.setText("Salvar");

        jButtonLimpar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonLimpar.setText("Limpar");

        jButtonCancelar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");

        jButtonConsultar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonConsultar.setText("Consultar");

        jFormattedTextFieldPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        javax.swing.GroupLayout jPanelCadastroItemLayout = new javax.swing.GroupLayout(jPanelCadastroItem);
        jPanelCadastroItem.setLayout(jPanelCadastroItemLayout);
        jPanelCadastroItemLayout.setHorizontalGroup(
            jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                                .addComponent(jLabelTipo)
                                .addGap(28, 28, 28)
                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                                .addComponent(jLabelPreco)
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                                        .addComponent(jButtonSalvar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonLimpar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonCancelar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonConsultar)))))
                        .addContainerGap(291, Short.MAX_VALUE))
                    .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                        .addComponent(jLabelTituloFilme)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTituloFilme)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscar)
                        .addGap(71, 71, 71))))
        );
        jPanelCadastroItemLayout.setVerticalGroup(
            jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroItemLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTituloFilme)
                    .addComponent(jTextFieldTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(30, 30, 30)
                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPreco)
                    .addComponent(jFormattedTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanelCadastroItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonConsultar))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabelCadastroItem))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabelCadastroItem)
                .addGap(18, 18, 18)
                .addComponent(jPanelCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaCadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JFormattedTextField jFormattedTextFieldPreco;
    private javax.swing.JLabel jLabelCadastroItem;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTituloFilme;
    private javax.swing.JPanel jPanelCadastroItem;
    private javax.swing.JTextField jTextFieldTituloFilme;
    // End of variables declaration//GEN-END:variables
}
