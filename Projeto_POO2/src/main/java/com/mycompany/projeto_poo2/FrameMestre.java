/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_poo2;

/**
 *
 * @author bruno
 */
public class FrameMestre extends javax.swing.JFrame {

    /**
     * Creates new form FrameMestre
     */
    public FrameMestre() {
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

        textoPrincipalMestre = new javax.swing.JLabel();
        textoPersonagem = new javax.swing.JLabel();
        textoEquipamento = new javax.swing.JLabel();
        textoInimigo = new javax.swing.JLabel();
        textoHabilidade = new javax.swing.JLabel();
        textoMissao = new javax.swing.JLabel();
        botaoConsultarPersonagem = new javax.swing.JButton();
        botaoGerenciarEquipamento = new javax.swing.JButton();
        botaoGerenciarInimigo = new javax.swing.JButton();
        botaoGerenciarHabilidade = new javax.swing.JButton();
        botaoGerenciarMissao = new javax.swing.JButton();
        botaoVoltarMestre = new javax.swing.JButton();
        botaoCalcNivel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textoPrincipalMestre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textoPrincipalMestre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoPrincipalMestre.setText("Olá Mestre! Por favor, escolha a opção relativa à sua busca:");
        textoPrincipalMestre.setToolTipText("");
        textoPrincipalMestre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoPersonagem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoPersonagem.setText("Personagem");

        textoEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoEquipamento.setText("Equipamento");

        textoInimigo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoInimigo.setText("Inimigo");

        textoHabilidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoHabilidade.setText("Habilidade");

        textoMissao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoMissao.setText("Missão");

        botaoConsultarPersonagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoConsultarPersonagem.setText("Consultar/\nAlterar/\nExcluir");
        botaoConsultarPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarPersonagemActionPerformed(evt);
            }
        });

        botaoGerenciarEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoGerenciarEquipamento.setText("Gerenciar");
        botaoGerenciarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerenciarEquipamentoActionPerformed(evt);
            }
        });

        botaoGerenciarInimigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoGerenciarInimigo.setText("Gerenciar");
        botaoGerenciarInimigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerenciarInimigoActionPerformed(evt);
            }
        });

        botaoGerenciarHabilidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoGerenciarHabilidade.setText("Gerenciar");
        botaoGerenciarHabilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerenciarHabilidadeActionPerformed(evt);
            }
        });

        botaoGerenciarMissao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoGerenciarMissao.setText("Gerenciar");
        botaoGerenciarMissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerenciarMissaoActionPerformed(evt);
            }
        });

        botaoVoltarMestre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoVoltarMestre.setText("Voltar para a tela principal");
        botaoVoltarMestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarMestreActionPerformed(evt);
            }
        });

        botaoCalcNivel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoCalcNivel.setText("Calcular Nível");
        botaoCalcNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalcNivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textoPrincipalMestre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoVoltarMestre)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoConsultarPersonagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoCalcNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(textoPersonagem)
                                .addGap(36, 36, 36)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botaoGerenciarEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(textoEquipamento)
                                .addGap(9, 9, 9)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(textoInimigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botaoGerenciarHabilidade)
                                .addGap(50, 50, 50)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoGerenciarInimigo)
                            .addComponent(textoHabilidade))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoGerenciarMissao)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(textoMissao)
                                .addGap(20, 20, 20)))
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoPrincipalMestre)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoPersonagem)
                    .addComponent(textoEquipamento)
                    .addComponent(textoInimigo)
                    .addComponent(textoHabilidade)
                    .addComponent(textoMissao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoGerenciarEquipamento)
                    .addComponent(botaoGerenciarInimigo)
                    .addComponent(botaoGerenciarMissao)
                    .addComponent(botaoGerenciarHabilidade)
                    .addComponent(botaoCalcNivel))
                .addGap(18, 18, 18)
                .addComponent(botaoConsultarPersonagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(botaoVoltarMestre)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoGerenciarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerenciarEquipamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoGerenciarEquipamentoActionPerformed

    private void botaoGerenciarInimigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerenciarInimigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoGerenciarInimigoActionPerformed

    private void botaoGerenciarHabilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerenciarHabilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoGerenciarHabilidadeActionPerformed

    private void botaoGerenciarMissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerenciarMissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoGerenciarMissaoActionPerformed

    private void botaoVoltarMestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarMestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoVoltarMestreActionPerformed

    private void botaoCalcNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCalcNivelActionPerformed

    private void botaoConsultarPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarPersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoConsultarPersonagemActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMestre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCalcNivel;
    private javax.swing.JButton botaoConsultarPersonagem;
    private javax.swing.JButton botaoGerenciarEquipamento;
    private javax.swing.JButton botaoGerenciarHabilidade;
    private javax.swing.JButton botaoGerenciarInimigo;
    private javax.swing.JButton botaoGerenciarMissao;
    private javax.swing.JButton botaoVoltarMestre;
    private javax.swing.JLabel textoEquipamento;
    private javax.swing.JLabel textoHabilidade;
    private javax.swing.JLabel textoInimigo;
    private javax.swing.JLabel textoMissao;
    private javax.swing.JLabel textoPersonagem;
    private javax.swing.JLabel textoPrincipalMestre;
    // End of variables declaration//GEN-END:variables
}
