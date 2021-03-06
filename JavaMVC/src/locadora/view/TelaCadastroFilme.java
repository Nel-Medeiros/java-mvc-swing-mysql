/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.view;

import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import locadora.controller.FilmeController;

/**
 *
 * @author Nel
 */
public class TelaCadastroFilme extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroFilme
     */
    public TelaCadastroFilme() {
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

        jLabelCadastroFilme = new javax.swing.JLabel();
        jPanelCadstroFilme = new javax.swing.JPanel();
        jLabelTituloFilme = new javax.swing.JLabel();
        jTextFieldTituloFilme = new javax.swing.JTextField();
        jLabelGenero = new javax.swing.JLabel();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jLabelSinopse = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSinopse = new javax.swing.JTextArea();
        jLabelDuracao = new javax.swing.JLabel();
        jSpinnerDuracao = new javax.swing.JSpinner();
        jLabelMinutos = new javax.swing.JLabel();
        SalvarFilme = new javax.swing.JButton();
        LimparTelaCadastroFilme = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vídeo Locadora Nostalgia");
        setResizable(false);

        jLabelCadastroFilme.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelCadastroFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon.png"))); // NOI18N
        jLabelCadastroFilme.setText("Cadastro de Filme");

        jPanelCadstroFilme.setBackground(new java.awt.Color(102, 102, 102));
        jPanelCadstroFilme.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelTituloFilme.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelTituloFilme.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloFilme.setText("Título:");
        jLabelTituloFilme.setToolTipText("");

        jTextFieldTituloFilme.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextFieldTituloFilme.setToolTipText("Informe o título do filme.");

        jLabelGenero.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelGenero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGenero.setText("Gênero:");

        jComboBoxGenero.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um gênero", "Ação", "Romance", "Ficção Científica", "Comédia", "Terror", "Drama", "Documentário", "Infantil", "Adulto" }));
        jComboBoxGenero.setToolTipText("Selecione o gênero do filme.");

        jLabelSinopse.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelSinopse.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSinopse.setText("Sinopse:");
        jLabelSinopse.setToolTipText("");

        jTextAreaSinopse.setColumns(20);
        jTextAreaSinopse.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextAreaSinopse.setRows(5);
        jTextAreaSinopse.setToolTipText("Descreva a sinopse do filme.");
        jScrollPane1.setViewportView(jTextAreaSinopse);

        jLabelDuracao.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabelDuracao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDuracao.setText("Duração:");

        jSpinnerDuracao.setModel(new javax.swing.SpinnerNumberModel(20, 20, 400, 10));

        jLabelMinutos.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jLabelMinutos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinutos.setText("minutos");

        SalvarFilme.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        SalvarFilme.setText("Salvar");
        SalvarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarFilmeActionPerformed(evt);
            }
        });

        LimparTelaCadastroFilme.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        LimparTelaCadastroFilme.setText("Limpar");
        LimparTelaCadastroFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparTelaCadastroFilmeActionPerformed(evt);
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

        javax.swing.GroupLayout jPanelCadstroFilmeLayout = new javax.swing.GroupLayout(jPanelCadstroFilme);
        jPanelCadstroFilme.setLayout(jPanelCadstroFilmeLayout);
        jPanelCadstroFilmeLayout.setHorizontalGroup(
            jPanelCadstroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadstroFilmeLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelCadstroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTituloFilme)
                    .addComponent(jLabelGenero)
                    .addComponent(jLabelSinopse)
                    .addComponent(jLabelDuracao))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadstroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadstroFilmeLayout.createSequentialGroup()
                        .addComponent(SalvarFilme)
                        .addGap(18, 18, 18)
                        .addComponent(LimparTelaCadastroFilme)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConsultar))
                    .addGroup(jPanelCadstroFilmeLayout.createSequentialGroup()
                        .addComponent(jSpinnerDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMinutos))
                    .addGroup(jPanelCadstroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldTituloFilme)
                        .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanelCadstroFilmeLayout.setVerticalGroup(
            jPanelCadstroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadstroFilmeLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanelCadstroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTituloFilme)
                    .addComponent(jTextFieldTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadstroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGenero)
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadstroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSinopse)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelCadstroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDuracao)
                    .addComponent(jLabelMinutos))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadstroFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalvarFilme)
                    .addComponent(LimparTelaCadastroFilme)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonConsultar))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(jLabelCadastroFilme))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelCadstroFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabelCadastroFilme)
                .addGap(18, 18, 18)
                .addComponent(jPanelCadstroFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    TelaPrincipal telaPrincipal = new TelaPrincipal();
    
    
    private void SalvarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarFilmeActionPerformed
        // TODO add your handling code here:
        int duração = Integer.parseInt(jSpinnerDuracao.getValue().toString());
        String genero = jComboBoxGenero.getSelectedItem().toString();
        boolean sucesso;
        
        try{
            FilmeController filmeController = new FilmeController();
            sucesso = filmeController.cadastrarFilme(jTextFieldTituloFilme.getText(), 
                    genero, jTextAreaSinopse.getText(), duração);
            if(sucesso == true){
               JOptionPane.showMessageDialog(null, "O filme foi cadastrado com sucesso.");
               this.LimparTelaCadastroFilmeActionPerformed(evt);
            }else {
                JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente.");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error:" + ex);
        }
    }//GEN-LAST:event_SalvarFilmeActionPerformed

    private void LimparTelaCadastroFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparTelaCadastroFilmeActionPerformed
        // TODO add your handling code here:
        jTextFieldTituloFilme.setText("");
        jComboBoxGenero.setSelectedIndex(0);
        jTextAreaSinopse.setText("");
        jSpinnerDuracao.setModel(new SpinnerNumberModel(20, 20, 300, 10));
    }//GEN-LAST:event_LimparTelaCadastroFilmeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LimparTelaCadastroFilme;
    private javax.swing.JButton SalvarFilme;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JLabel jLabelCadastroFilme;
    private javax.swing.JLabel jLabelDuracao;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelMinutos;
    private javax.swing.JLabel jLabelSinopse;
    private javax.swing.JLabel jLabelTituloFilme;
    private javax.swing.JPanel jPanelCadstroFilme;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerDuracao;
    private javax.swing.JTextArea jTextAreaSinopse;
    private javax.swing.JTextField jTextFieldTituloFilme;
    // End of variables declaration//GEN-END:variables
}
