/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_poo2;

/**
 *
 * @author Fernando
 */
public class FramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
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

        textoPrincipal = new javax.swing.JLabel();
        botaoJogador = new javax.swing.JButton();
        botaoMestre = new javax.swing.JButton();
        textoOpcao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textoPrincipal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textoPrincipal.setText("Bem-vindo ao assistente de RPG!");

        botaoJogador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoJogador.setText("Jogador");
        botaoJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoJogadorActionPerformed(evt);
            }
        });

        botaoMestre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botaoMestre.setText("Mestre");
        botaoMestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMestreActionPerformed(evt);
            }
        });

        textoOpcao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoOpcao.setText("Por favor, escolha uma opção:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoOpcao)
                .addGap(168, 168, 168))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoJogador)
                        .addGap(207, 207, 207)
                        .addComponent(botaoMestre))
                    .addComponent(textoPrincipal))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoPrincipal)
                .addGap(75, 75, 75)
                .addComponent(textoOpcao)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoJogador)
                    .addComponent(botaoMestre))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoJogadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoJogadorActionPerformed

    private void botaoMestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMestreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoMestreActionPerformed

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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoJogador;
    private javax.swing.JButton botaoMestre;
    private javax.swing.JLabel textoOpcao;
    private javax.swing.JLabel textoPrincipal;
    // End of variables declaration//GEN-END:variables
}
