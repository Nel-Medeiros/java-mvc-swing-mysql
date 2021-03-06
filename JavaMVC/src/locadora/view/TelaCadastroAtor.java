/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.view;

import javax.swing.JOptionPane;
import locadora.controller.AtorController;

/**
 *
 * @author Nel
 */
public class TelaCadastroAtor extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroAtor
     */
    public TelaCadastroAtor() {
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

        jLabelTitulo = new javax.swing.JLabel();
        jPanelCadastroAtor = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNacionalidade = new javax.swing.JLabel();
        jComboBoxNacionalidade = new javax.swing.JComboBox<>();
        SalvarAtor = new javax.swing.JButton();
        LimparTelaCadastroAtor = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Video Locadora Nostalgia");
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon.png"))); // NOI18N
        jLabelTitulo.setText("Cadastro de Ator");

        jPanelCadastroAtor.setBackground(new java.awt.Color(102, 102, 102));
        jPanelCadastroAtor.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldNome.setToolTipText("Informe o nome do Ator.");

        jLabelNacionalidade.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelNacionalidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNacionalidade.setText("Nacionalidade:");

        jComboBoxNacionalidade.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBoxNacionalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma Nacionalidade", "Afeganistão", "África do Sul", "Alemanha", "Arábia Saudita", "Argentina", "Austrália", "Áustria", "Brasil", "Canadá", "Chile", "China", "Coreia do Sul", "Dinamarca", "Egipto", "Emiratos Árabes Unidos", "Equador", "Espanha", "Estados Unidos", "Faroé", "Fiji", "Filipinas", "Finlândia", "França", "Gana", "Geórgia", "Geórgia do Sul e Sandwich do Sul", "Gibraltar", "Grécia", "Gronelândia", "Guiana", "Guiné", "Guiné Equatorial", "Guiné-Bissau", "Haiti", "Honduras", "Hong Kong", "Hungria", "Iémen", "Ilhas Falkland", "Índia", "Indonésia", "Irão", "Iraque", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Japão", "Kuwait", "Luxemburgo", "Malásia", "Malta", "Marrocos", "México", "Nigéria", "Noruega", "Nova Zelândia", "Países Baixos", "Paquistão", "Paraguai", "Peru", "Polinésia Francesa", "Polónia", "Porto Rico", "Portugal", "Quénia", "Reino Unido", "Ruanda", "Rússia", "Senegal", "Serra Leoa", "Sérvia", "Singapura", "Somália", "Sri Lanca", "Suazilândia", "Sudão", "Sudão do Sul", "Suécia", "Suíça", "Suriname", "Tailândia", "Taiwan", "Trindade e Tobago", "Tunísia", "Turquemenistão", "Turquia", "Ucrânia", "Uganda", "Uruguai", "Usbequistão", "Vanuatu", "Vaticano", "Vietname", "Wake Island", "Wallis e Futuna", "West Bank", "Zâmbia", "Zimbabué" }));
        jComboBoxNacionalidade.setToolTipText("Selecione uma Nacionalidade");

        SalvarAtor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        SalvarAtor.setText("Salvar");
        SalvarAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarAtorActionPerformed(evt);
            }
        });

        LimparTelaCadastroAtor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LimparTelaCadastroAtor.setText("Limpar");
        LimparTelaCadastroAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparTelaCadastroAtorActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonConsultar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButtonConsultar.setText("Consultar");

        javax.swing.GroupLayout jPanelCadastroAtorLayout = new javax.swing.GroupLayout(jPanelCadastroAtor);
        jPanelCadastroAtor.setLayout(jPanelCadastroAtorLayout);
        jPanelCadastroAtorLayout.setHorizontalGroup(
            jPanelCadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroAtorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNacionalidade)
                    .addComponent(jLabelNome))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBoxNacionalidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelCadastroAtorLayout.createSequentialGroup()
                            .addComponent(SalvarAtor)
                            .addGap(18, 18, 18)
                            .addComponent(LimparTelaCadastroAtor)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonCancelar)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonConsultar))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanelCadastroAtorLayout.setVerticalGroup(
            jPanelCadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroAtorLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanelCadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanelCadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNacionalidade)
                    .addComponent(jComboBoxNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanelCadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalvarAtor)
                    .addComponent(LimparTelaCadastroAtor)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonConsultar))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelCadastroAtor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jPanelCadastroAtor, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    TelaPrincipal telaPrincipal = new TelaPrincipal();
    
    private void SalvarAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarAtorActionPerformed
        // TODO add your handling code here:
        String nacionalidade = jComboBoxNacionalidade.getSelectedItem().toString();
        boolean sucesso;
        
        try{
            
            AtorController atorController = new AtorController();
            sucesso = atorController.cadastrarAtor(jTextFieldNome.getText(), nacionalidade);
            
            if(sucesso == true) {
                JOptionPane.showMessageDialog(null, "O ator foi cadastrado com sucesso.");
                this.LimparTelaCadastroAtorActionPerformed(evt);
            }else {
                JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente.");                
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error:" + ex);
        }
    }//GEN-LAST:event_SalvarAtorActionPerformed

    private void LimparTelaCadastroAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparTelaCadastroAtorActionPerformed
        // TODO add your handling code here:
        jTextFieldNome.setText("");
        jComboBoxNacionalidade.setSelectedIndex(0);
    }//GEN-LAST:event_LimparTelaCadastroAtorActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAtor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LimparTelaCadastroAtor;
    private javax.swing.JButton SalvarAtor;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JComboBox<String> jComboBoxNacionalidade;
    private javax.swing.JLabel jLabelNacionalidade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCadastroAtor;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
