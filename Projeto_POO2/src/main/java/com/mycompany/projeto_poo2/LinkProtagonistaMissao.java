/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_poo2;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class LinkProtagonistaMissao extends javax.swing.JFrame {

    /**
     * Creates new form LinkProtagonistaMissao
     */
    public LinkProtagonistaMissao() {
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

        rtTitulo = new javax.swing.JLabel();
        cbxProtagonista = new javax.swing.JComboBox();
        cbxMissao = new javax.swing.JComboBox();
        rtProtagonista = new javax.swing.JLabel();
        rtMissao = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btLimparForm = new javax.swing.JButton();
        btSairForm = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rtTitulo.setText("Associar personagem a uma missão");

        cbxProtagonista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        cbxProtagonista.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbxProtagonistaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        cbxMissao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        cbxMissao.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbxMissaoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbxMissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMissaoActionPerformed(evt);
            }
        });

        rtProtagonista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtProtagonista.setText("Personagem:");

        rtMissao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtMissao.setText("Missão:");

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCadastrar.setText("Entrar na Missão");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btLimparForm.setText("Limpar");
        btLimparForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparFormActionPerformed(evt);
            }
        });

        btSairForm.setText("Sair");
        btSairForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairFormActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btExcluir.setText("Sair da Missão");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btConsultar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btConsultar.setText("Consultar missões do personagem");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(rtTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(rtProtagonista)
                                .addGap(18, 18, 18)
                                .addComponent(cbxProtagonista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(rtMissao)
                                .addGap(18, 18, 18)
                                .addComponent(cbxMissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btExcluir)
                                .addGap(44, 44, 44)))
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btLimparForm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSairForm)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btConsultar)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rtTitulo)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxProtagonista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtProtagonista)
                    .addComponent(rtMissao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btExcluir))
                .addGap(18, 18, 18)
                .addComponent(btConsultar)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimparForm)
                    .addComponent(btSairForm)
                    .addComponent(btVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxProtagonistaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbxProtagonistaAncestorAdded
       ProtagonistaDAO dao = new ProtagonistaDAO();
       List<Protagonista> lista = dao.listaProtagonista();
       cbxProtagonista.removeAllItems();
       for(Protagonista e: lista){
           cbxProtagonista.addItem(e);
       }
    }//GEN-LAST:event_cbxProtagonistaAncestorAdded

    private void cbxMissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMissaoActionPerformed

    }//GEN-LAST:event_cbxMissaoActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
               
        Equipamento equip = new Equipamento(0,false,"","","","");
        Habilidade habil = new Habilidade(0,"","","");
        Protagonista protagonista = new Protagonista(0,0,0,0,"",0,0,0,"",0,"",0,0,"",equip, habil);
        ProtagonistaMissao protmis = new ProtagonistaMissao();
        Missao missao = new Missao(0,"","","");
        
        try {
            protagonista = (Protagonista) cbxProtagonista.getSelectedItem();
            missao = (Missao) cbxMissao.getSelectedItem();
            
            protmis.setProtagonista(protagonista);
            protmis.setMissao(missao);

             if (cbxProtagonista.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Erro: É necessário cadastrar um personagem primeiro.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
            }
             if (cbxMissao.getItemCount() == 0) {
            JOptionPane.showMessageDialog(null, "Erro: É necessário cadastrar uma missao primeiro.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
            }             
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro: Por favor, insira números inteiros válidos.");
            return;
        }catch (IllegalArgumentException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return;
        }
        LinkProtagonistaDAO dao = new LinkProtagonistaDAO();
        dao.inserir(protmis);

    }//GEN-LAST:event_btCadastrarActionPerformed

    private void cbxMissaoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbxMissaoAncestorAdded
       MissaoDAO dao = new MissaoDAO();
       List<Missao> lista = dao.listaMissao();
       cbxMissao.removeAllItems();
       for(Missao e: lista){
           cbxMissao.addItem(e);
       }
    }//GEN-LAST:event_cbxMissaoAncestorAdded

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        voltar();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btLimparFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparFormActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparFormActionPerformed

    private void btSairFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairFormActionPerformed
        sair();
    }//GEN-LAST:event_btSairFormActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        Equipamento equip = new Equipamento(0,false,"","","","");
        Habilidade habil = new Habilidade(0,"","","");        
        Protagonista protagonista = new Protagonista(0,0,0,0,"",0,0,0,"",0,"",0,0,"",equip, habil);
        ProtagonistaMissao protmis = new ProtagonistaMissao();
        Missao missao = new Missao(0,"","","");
        try {
            protagonista = (Protagonista) cbxProtagonista.getSelectedItem();
            missao = (Missao) cbxMissao.getSelectedItem();
            
            protmis.setProtagonista(protagonista);
            protmis.setMissao(missao);
        }catch(Exception e){
          System.out.println(e);
        }
        LinkProtagonistaDAO dao = new LinkProtagonistaDAO();
        dao.excluir(protmis);    
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed

    }//GEN-LAST:event_btConsultarActionPerformed

    public void voltar(){
        FrameJogador frameJogador = new FrameJogador();
        frameJogador.setLocationRelativeTo(frameJogador);
        frameJogador.setVisible(true);
        dispose();
    }
    
    public void limpar(){
        cbxProtagonista.setSelectedItem("Selecione");
        cbxMissao.setSelectedItem("Selecione");        
    }       
     
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
            java.util.logging.Logger.getLogger(LinkProtagonistaMissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LinkProtagonistaMissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LinkProtagonistaMissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LinkProtagonistaMissao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LinkProtagonistaMissao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimparForm;
    private javax.swing.JButton btSairForm;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox cbxMissao;
    private javax.swing.JComboBox cbxProtagonista;
    private javax.swing.JLabel rtMissao;
    private javax.swing.JLabel rtProtagonista;
    private javax.swing.JLabel rtTitulo;
    // End of variables declaration//GEN-END:variables
}
