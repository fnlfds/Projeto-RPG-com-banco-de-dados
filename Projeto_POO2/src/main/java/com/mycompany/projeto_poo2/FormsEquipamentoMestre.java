/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_poo2;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class FormsEquipamentoMestre extends javax.swing.JFrame {

    /**
     * Creates new form FormsEquipamento
     */
    public FormsEquipamentoMestre() {
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

        cbRaridade = new javax.swing.JComboBox<>();
        rtConsumivel = new javax.swing.JLabel();
        checkConsumivel = new javax.swing.JCheckBox();
        btCadEquipamento = new javax.swing.JButton();
        btAltEquipamento = new javax.swing.JButton();
        btConsEquipamento = new javax.swing.JButton();
        btExcEquipamento = new javax.swing.JButton();
        btLimparForm = new javax.swing.JButton();
        btSairForm = new javax.swing.JButton();
        rtTitulo = new javax.swing.JLabel();
        rtSubtitulo = new javax.swing.JLabel();
        rtNome = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        rtTipo = new javax.swing.JLabel();
        cxTipo = new javax.swing.JTextField();
        rtEfeito = new javax.swing.JLabel();
        cxEfeito = new javax.swing.JTextField();
        rtRaridade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbRaridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comum", "Incomum", "Raro", "Épico", "Lendário" }));
        cbRaridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRaridadeActionPerformed(evt);
            }
        });

        rtConsumivel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtConsumivel.setText("Consumível");

        checkConsumivel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btCadEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCadEquipamento.setText("Cadastrar");
        btCadEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadEquipamentoActionPerformed(evt);
            }
        });

        btAltEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btAltEquipamento.setText("Alterar");

        btConsEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btConsEquipamento.setText("Consultar");

        btExcEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btExcEquipamento.setText("Excluir");

        btLimparForm.setText("Limpar");

        btSairForm.setText("Sair");
        btSairForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairFormActionPerformed(evt);
            }
        });

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rtTitulo.setText("Equipamento");

        rtSubtitulo.setText("(consultas, alterações e exclusões por nome do equipamento)");

        rtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtNome.setText("Nome:");

        rtTipo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtTipo.setText("Tipo:");

        rtEfeito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtEfeito.setText("Efeito:");

        cxEfeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEfeitoActionPerformed(evt);
            }
        });

        rtRaridade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtRaridade.setText("Raridade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btCadEquipamento)
                        .addGap(18, 18, 18)
                        .addComponent(btAltEquipamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimparForm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSairForm))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(226, 226, 226)
                                        .addComponent(rtRaridade))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(203, 203, 203)
                                        .addComponent(btConsEquipamento)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbRaridade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btExcEquipamento)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rtEfeito)
                                        .addGap(18, 18, 18)
                                        .addComponent(cxEfeito))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rtNome)
                                        .addGap(18, 18, 18)
                                        .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(rtTipo)
                                .addGap(18, 18, 18)
                                .addComponent(cxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rtConsumivel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkConsumivel)))
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(rtTitulo))
                    .addComponent(rtSubtitulo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtSubtitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkConsumivel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rtNome)
                        .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rtTipo)
                        .addComponent(cxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rtConsumivel)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtEfeito)
                    .addComponent(cxEfeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtRaridade)
                    .addComponent(cbRaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadEquipamento)
                    .addComponent(btAltEquipamento)
                    .addComponent(btConsEquipamento)
                    .addComponent(btExcEquipamento)
                    .addComponent(btLimparForm)
                    .addComponent(btSairForm))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbRaridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRaridadeActionPerformed
        String selectedItem = (String) cbRaridade.getSelectedItem();
        JOptionPane.showMessageDialog(this, "Selected Item: " + selectedItem);
    }//GEN-LAST:event_cbRaridadeActionPerformed

    private void btCadEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadEquipamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCadEquipamentoActionPerformed

    private void cxEfeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEfeitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxEfeitoActionPerformed

    private void btSairFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairFormActionPerformed
        sair();
    }//GEN-LAST:event_btSairFormActionPerformed

    /**
     * @param args the command line arguments
     */
    
        public void sair(){
            int respSair = JOptionPane.showConfirmDialog(
                        null,
                        "Deseja sair?",
                        "Saida",
                        JOptionPane.YES_NO_OPTION
                );
        if(respSair == 0){
            //System.exit(0);
            dispose();
        }
    }
        
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
            java.util.logging.Logger.getLogger(FormsEquipamentoMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormsEquipamentoMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormsEquipamentoMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormsEquipamentoMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormsEquipamentoMestre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAltEquipamento;
    private javax.swing.JButton btCadEquipamento;
    private javax.swing.JButton btConsEquipamento;
    private javax.swing.JButton btExcEquipamento;
    private javax.swing.JButton btLimparForm;
    private javax.swing.JButton btSairForm;
    private javax.swing.JComboBox<String> cbRaridade;
    private javax.swing.JCheckBox checkConsumivel;
    private javax.swing.JTextField cxEfeito;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxTipo;
    private javax.swing.JLabel rtConsumivel;
    private javax.swing.JLabel rtEfeito;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtRaridade;
    private javax.swing.JLabel rtSubtitulo;
    private javax.swing.JLabel rtTipo;
    private javax.swing.JLabel rtTitulo;
    // End of variables declaration//GEN-END:variables
}
