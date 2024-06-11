package com.mycompany.projeto_poo2;

import javax.swing.JOptionPane;

public class FormsProtagonistaJogador extends javax.swing.JFrame {
    public FormsProtagonistaJogador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cxRaca = new javax.swing.JTextField();
        rtAtributos = new javax.swing.JLabel();
        rtCarisma = new javax.swing.JLabel();
        cxCarisma = new javax.swing.JTextField();
        rtDestreza = new javax.swing.JLabel();
        cxDestreza = new javax.swing.JTextField();
        rtForca = new javax.swing.JLabel();
        cxForca = new javax.swing.JTextField();
        rtClasse = new javax.swing.JLabel();
        rtInteligencia = new javax.swing.JLabel();
        cxClasse = new javax.swing.JTextField();
        cxInteligencia = new javax.swing.JTextField();
        cxEfeito = new javax.swing.JTextField();
        rtDinheiro = new javax.swing.JLabel();
        btCadPersonagem = new javax.swing.JButton();
        cxDinheiro = new javax.swing.JTextField();
        rtExperiencia = new javax.swing.JLabel();
        rtTitulo = new javax.swing.JLabel();
        cxExperiencia = new javax.swing.JTextField();
        btLimparForm = new javax.swing.JButton();
        rtSubtitulo = new javax.swing.JLabel();
        btSairForm = new javax.swing.JButton();
        rtEfeito = new javax.swing.JLabel();
        rtNivel = new javax.swing.JLabel();
        rtCaracteristicas = new javax.swing.JLabel();
        cxNivel = new javax.swing.JTextField();
        rtNome = new javax.swing.JLabel();
        rtPntMana = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxPntMana = new javax.swing.JTextField();
        rtRaca = new javax.swing.JLabel();
        rtPntVida = new javax.swing.JLabel();
        cxPntVida = new javax.swing.JTextField();
        btConsultarPersonagem = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rtAtributos.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        rtAtributos.setText("Atributos:");

        rtCarisma.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtCarisma.setText("Carisma:");

        cxCarisma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCarismaActionPerformed(evt);
            }
        });

        rtDestreza.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtDestreza.setText("Destreza:");

        rtForca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtForca.setText("Força:");

        rtClasse.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtClasse.setText("Classe:");

        rtInteligencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtInteligencia.setText("Inteligência:");

        cxEfeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEfeitoActionPerformed(evt);
            }
        });

        rtDinheiro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtDinheiro.setText("Dinheiro:");

        btCadPersonagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCadPersonagem.setText("Cadastrar");
        btCadPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadPersonagemActionPerformed(evt);
            }
        });

        rtExperiencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtExperiencia.setText("Experiência:");

        rtTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rtTitulo.setText("Personagem");

        btLimparForm.setText("Limpar");
        btLimparForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparFormActionPerformed(evt);
            }
        });

        rtSubtitulo.setText("(consultas por nome do personagem)");

        btSairForm.setText("Sair");
        btSairForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairFormActionPerformed(evt);
            }
        });

        rtEfeito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtEfeito.setText("Buff/Debuff:");

        rtNivel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtNivel.setText("Nível:");

        rtCaracteristicas.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        rtCaracteristicas.setText("Características:");

        rtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtNome.setText("Nome:");

        rtPntMana.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtPntMana.setText("Pontos de mana:");

        cxPntMana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPntManaActionPerformed(evt);
            }
        });

        rtRaca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtRaca.setText("Raça:");

        rtPntVida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtPntVida.setText("Pontos de vida:");

        cxPntVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxPntVidaActionPerformed(evt);
            }
        });

        btConsultarPersonagem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btConsultarPersonagem.setText("Consultar");
        btConsultarPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarPersonagemActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(rtAtributos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(cxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rtPntMana)
                                .addGap(18, 18, 18)
                                .addComponent(cxPntMana, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(rtPntVida)
                                .addGap(18, 18, 18)
                                .addComponent(cxPntVida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rtCarisma)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cxCarisma, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rtDestreza)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxDestreza, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(rtForca)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxForca, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(rtInteligencia)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxInteligencia, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rtDinheiro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rtExperiencia)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cxExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rtEfeito)
                                    .addGap(18, 18, 18)
                                    .addComponent(cxEfeito, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(223, 223, 223)
                                    .addComponent(btCadPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(btConsultarPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rtNivel)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(rtCaracteristicas)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rtSubtitulo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rtNome)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83)
                                        .addComponent(rtRaca)
                                        .addGap(18, 18, 18)
                                        .addComponent(cxRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rtClasse)
                                .addGap(18, 18, 18)
                                .addComponent(cxClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(rtTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimparForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSairForm)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rtCaracteristicas)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtRaca)
                    .addComponent(cxRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtClasse)
                    .addComponent(cxClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtNivel)
                    .addComponent(cxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtPntMana)
                    .addComponent(cxPntMana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtPntVida)
                    .addComponent(cxPntVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rtAtributos)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rtCarisma)
                    .addComponent(cxCarisma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtDestreza)
                    .addComponent(cxDestreza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtForca)
                    .addComponent(cxForca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtInteligencia)
                    .addComponent(cxInteligencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rtEfeito)
                        .addComponent(cxEfeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rtDinheiro)
                        .addComponent(cxDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rtExperiencia)
                        .addComponent(cxExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultarPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimparForm)
                    .addComponent(btSairForm)
                    .addComponent(btVoltar))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxCarismaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCarismaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCarismaActionPerformed

    private void cxEfeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEfeitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxEfeitoActionPerformed

    private void btCadPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadPersonagemActionPerformed
        
        int nivel = 0, pntmana = 0, pntvida = 0, carisma = 0, destreza = 0, forca = 0, inteligencia = 0, dinheiro = 0, experiencia = 0;
        String classe = "", efeito = "", nome = "", raca = "";
        try {
            String carismaS = cxCarisma.getText();
            String destrezaS = cxDestreza.getText();
            String dinheiroS = cxDinheiro.getText();
            String experienciaS = cxExperiencia.getText();
            String forcaS = cxForca.getText();
            String inteligenciaS = cxInteligencia.getText();
            String nivelS = cxNivel.getText();
            String pntmanaS = cxPntMana.getText();
            String pntvidaS = cxPntVida.getText();
            
            if (nivelS.isEmpty() || pntmanaS.isEmpty() || pntvidaS.isEmpty() || carismaS.isEmpty() || 
                destrezaS.isEmpty() || forcaS.isEmpty() ||inteligenciaS.isEmpty() || dinheiroS.isEmpty() ||
                experienciaS.isEmpty()) {
                throw new IllegalArgumentException("Os campos numéricos não podem estar vazios.");
            }
            nivel = Integer.parseInt(nivelS.trim());
            pntmana = Integer.parseInt(pntmanaS.trim());
            pntvida = Integer.parseInt(pntvidaS.trim());
            carisma = Integer.parseInt(carismaS.trim());
            forca = Integer.parseInt(forcaS.trim());
            inteligencia = Integer.parseInt(inteligenciaS.trim());
            dinheiro = Integer.parseInt(dinheiroS.trim());
            experiencia = Integer.parseInt(experienciaS.trim());
            
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro: Por favor, insira números inteiros válidos.");
        }catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        }
        
        try {
            classe = cxClasse.getText();
            efeito = cxEfeito.getText();
            nome = cxNome.getText();
            raca = cxRaca.getText();
            
            if(classe.isEmpty() || efeito.isEmpty() || nome.isEmpty() || raca.isEmpty()){
                throw new NullPointerException("Um ou mais campos estão vazios.");
            }
        }catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        }
        
        Protagonista p = new Protagonista(carisma, destreza, dinheiro, efeito, experiencia, forca, 
                inteligencia, classe, nivel, nome, pntmana, pntvida, raca);
        p.cadastrarProtagonista();
        
    }//GEN-LAST:event_btCadPersonagemActionPerformed

    private void cxPntManaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPntManaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPntManaActionPerformed

    private void cxPntVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPntVidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPntVidaActionPerformed

    private void btConsultarPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarPersonagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btConsultarPersonagemActionPerformed

    private void btSairFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairFormActionPerformed
        sair();
    }//GEN-LAST:event_btSairFormActionPerformed

    private void btLimparFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparFormActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparFormActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        voltar();
    }//GEN-LAST:event_btVoltarActionPerformed

    /**
     * @param args the command line arguments
     */

    public void voltar(){
        FrameJogador frameJogador = new FrameJogador();
        frameJogador.setLocationRelativeTo(frameJogador);
        frameJogador.setVisible(true);
        dispose();
    }
    
    public void limpar(){
        cxNome.setText("");
        cxRaca.setText("");
        cxClasse.setText("");
        cxNivel.setText("");   
        cxPntMana.setText("");
        cxPntVida.setText("");
        cxCarisma.setText("");
        cxDestreza.setText("");
        cxForca.setText("");
        cxInteligencia.setText("");
        cxDinheiro.setText("");
        cxExperiencia.setText("");
        cxEfeito.setText("");
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
            java.util.logging.Logger.getLogger(FormsProtagonistaJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormsProtagonistaJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormsProtagonistaJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormsProtagonistaJogador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormsProtagonistaJogador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadPersonagem;
    private javax.swing.JButton btConsultarPersonagem;
    private javax.swing.JButton btLimparForm;
    private javax.swing.JButton btSairForm;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField cxCarisma;
    private javax.swing.JTextField cxClasse;
    private javax.swing.JTextField cxDestreza;
    private javax.swing.JTextField cxDinheiro;
    private javax.swing.JTextField cxEfeito;
    private javax.swing.JTextField cxExperiencia;
    private javax.swing.JTextField cxForca;
    private javax.swing.JTextField cxInteligencia;
    private javax.swing.JTextField cxNivel;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPntMana;
    private javax.swing.JTextField cxPntVida;
    private javax.swing.JTextField cxRaca;
    private javax.swing.JLabel rtAtributos;
    private javax.swing.JLabel rtCaracteristicas;
    private javax.swing.JLabel rtCarisma;
    private javax.swing.JLabel rtClasse;
    private javax.swing.JLabel rtDestreza;
    private javax.swing.JLabel rtDinheiro;
    private javax.swing.JLabel rtEfeito;
    private javax.swing.JLabel rtExperiencia;
    private javax.swing.JLabel rtForca;
    private javax.swing.JLabel rtInteligencia;
    private javax.swing.JLabel rtNivel;
    private javax.swing.JLabel rtNome;
    private javax.swing.JLabel rtPntMana;
    private javax.swing.JLabel rtPntVida;
    private javax.swing.JLabel rtRaca;
    private javax.swing.JLabel rtSubtitulo;
    private javax.swing.JLabel rtTitulo;
    // End of variables declaration//GEN-END:variables
}
