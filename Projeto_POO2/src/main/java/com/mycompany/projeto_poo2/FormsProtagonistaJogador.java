package com.mycompany.projeto_poo2;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        cbxEquipamento = new javax.swing.JComboBox();
        rtEquipamento = new javax.swing.JLabel();
        rtHabilidade = new javax.swing.JLabel();
        cbxHabilidade = new javax.swing.JComboBox();
        btAlterar = new javax.swing.JButton();

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

        cbxEquipamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        cbxEquipamento.setToolTipText("");
        cbxEquipamento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbxEquipamentoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbxEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEquipamentoActionPerformed(evt);
            }
        });

        rtEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtEquipamento.setText("Equipamento:");

        rtHabilidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rtHabilidade.setText("Habilidade:");

        cbxHabilidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));
        cbxHabilidade.setToolTipText("");
        cbxHabilidade.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cbxHabilidadeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cbxHabilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxHabilidadeActionPerformed(evt);
            }
        });

        btAlterar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
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
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(76, 76, 76)
                                            .addComponent(btCadPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(36, 36, 36)
                                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(29, 29, 29)
                                            .addComponent(btConsultarPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(rtEquipamento)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(cbxEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(22, 22, 22)
                                                    .addComponent(cxDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(rtExperiencia)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(cxExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(rtEfeito)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(cxEfeito, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(rtHabilidade)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(cbxHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(156, 156, 156))))))))
                        .addGap(0, 5, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtEquipamento)
                    .addComponent(rtHabilidade)
                    .addComponent(cbxHabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultarPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        
        Equipamento equip = new Equipamento(0,false,"","","","");
        Habilidade habil = new Habilidade(0,"","","");
        Protagonista protagonista = new Protagonista(0,0,0,0,"",0,0,0,"",0,"",0,0,"",equip, habil);

        try {
            String t1 = cxNome.getText();
            String t2 = cxPntVida.getText();
            String t3 = cxPntMana.getText();
            String t4 = cxNivel.getText();
            String t5 = cxRaca.getText();
            String t6 = cxClasse.getText();
            String t7 = cxExperiencia.getText();
            String t8 = cxForca.getText();
            String t9 = cxDestreza.getText();
            String t10 = cxInteligencia.getText();
            String t11 = cxCarisma.getText();
            String t12 = cxEfeito.getText();
            String t13 = cxDinheiro.getText();
            equip = (Equipamento) cbxEquipamento.getSelectedItem();
            habil = (Habilidade) cbxHabilidade.getSelectedItem();
  
            if (t4.isEmpty() || t3.isEmpty() || t2.isEmpty() || t11.isEmpty() || 
            t9.isEmpty() || t8.isEmpty() ||t10.isEmpty() ||t13.isEmpty() ||
            t7.isEmpty()) {
                throw new IllegalArgumentException("Os campos numéricos não podem estar vazios.");
            }
            
            protagonista.setNome(t1);
            protagonista.setPontoVida(Integer.parseInt(t2));
            protagonista.setPontoMana(Integer.parseInt(t3));
            protagonista.setNivel(Integer.parseInt(t4));
            protagonista.setRaca(t5);
            protagonista.setClasse(t6);
            protagonista.setExperiencia(Integer.parseInt(t7));
            protagonista.setForca(Integer.parseInt(t8));
            protagonista.setDestreza(Integer.parseInt(t9));
            protagonista.setInteligencia(Integer.parseInt(t10));
            protagonista.setCarisma(Integer.parseInt(t11));
            protagonista.setEfeito(t12);
            protagonista.setDinheiro(Integer.parseInt(t13));
            protagonista.setEquipamento(equip);
            protagonista.setHabilidade(habil);

            if(t6.isEmpty() || t12.isEmpty() || t1.isEmpty() || t5.isEmpty()){
                throw new NullPointerException("Um ou mais campos estão vazios.");
            }
             if (cbxEquipamento.getItemCount() == 0) {
            // ComboBox está vazia, exibe mensagem de erro ao usuário
            JOptionPane.showMessageDialog(null, "Erro: É necessário cadastrar um equipamento primeiro.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
            }
             if (cbxHabilidade.getItemCount() == 0) {
            // ComboBox está vazia, exibe mensagem de erro ao usuário
            JOptionPane.showMessageDialog(null, "Erro: É necessário cadastrar uma habilidade primeiro.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
            }             
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Erro: Por favor, insira números inteiros válidos.");
            return;
        }catch (IllegalArgumentException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
            return;
        }
        
        ProtagonistaDAO dao = new ProtagonistaDAO();
        dao.inserir(protagonista);
    }//GEN-LAST:event_btCadPersonagemActionPerformed

    private void cxPntManaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPntManaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPntManaActionPerformed

    private void cxPntVidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPntVidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPntVidaActionPerformed

    private void btConsultarPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarPersonagemActionPerformed
        String nome = cxNome.getText();       
        ProtagonistaDAO dao = new ProtagonistaDAO();
        Protagonista protag = dao.consultar(nome);
        if (protag != null){
            cxRaca.setText(protag.getRaca());
            cxClasse.setText(protag.getClasse());
            cxNivel.setText(Integer.toString(protag.getNivel()));
            cxPntMana.setText(Integer.toString(protag.getPontoMana()));
            cxPntVida.setText(Integer.toString(protag.getPontoVida()));
            cxCarisma.setText(Integer.toString(protag.getCarisma()));
            cxDestreza.setText(Integer.toString(protag.getDestreza()));
            cxForca.setText(Integer.toString(protag.getForca()));
            cxInteligencia.setText(Integer.toString(protag.getInteligencia()));
            cxDinheiro.setText(Integer.toString(protag.getDinheiro()));
            cxExperiencia.setText(Integer.toString(protag.getExperiencia()));
            cxEfeito.setText(protag.getEfeito());            
            cbxEquipamento.setSelectedItem(protag.getEquipamento());
            cbxHabilidade.setSelectedItem(protag.getHabilidade());          
        } else {
            JOptionPane.showMessageDialog(null,"Personagem não encontrado", "Aviso", JOptionPane.WARNING_MESSAGE);
            cxRaca.setText("");
            cxNome.setText("");
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
            cbxEquipamento.setSelectedIndex(-1);
            cbxHabilidade.setSelectedIndex(-1);
           }          // TODO add your handling code here:
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

    private void cbxEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEquipamentoActionPerformed

    }//GEN-LAST:event_cbxEquipamentoActionPerformed

    private void cbxEquipamentoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbxEquipamentoAncestorAdded
       EquipamentoDAO dao = new EquipamentoDAO();
       List<Equipamento> lista = dao.listaEquipamento();
       cbxEquipamento.removeAllItems();
       for(Equipamento e: lista){
           cbxEquipamento.addItem(e);
       }
    }//GEN-LAST:event_cbxEquipamentoAncestorAdded

    private void cbxHabilidadeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cbxHabilidadeAncestorAdded
       HabilidadeDAO dao = new HabilidadeDAO();
       List<Habilidade> lista = dao.listaHabilidade();
       cbxHabilidade.removeAllItems();
       for(Habilidade e: lista){
           cbxHabilidade.addItem(e);
       }
    }//GEN-LAST:event_cbxHabilidadeAncestorAdded

    private void cbxHabilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHabilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxHabilidadeActionPerformed
    ProtagonistaDAO dao = new ProtagonistaDAO();
    private Protagonista protag;
    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        if (protag == null) {
            String nome = cxNome.getText();
            protag = dao.consultar(nome);

            if (protag != null) {
                cxRaca.setText(protag.getRaca());
                cxClasse.setText(protag.getClasse());
                cxNivel.setText(Integer.toString(protag.getNivel()));
                cxPntMana.setText(Integer.toString(protag.getPontoMana()));
                cxPntVida.setText(Integer.toString(protag.getPontoVida()));
                cxCarisma.setText(Integer.toString(protag.getCarisma()));
                cxDestreza.setText(Integer.toString(protag.getDestreza()));
                cxForca.setText(Integer.toString(protag.getForca()));
                cxInteligencia.setText(Integer.toString(protag.getInteligencia()));
                cxDinheiro.setText(Integer.toString(protag.getDinheiro()));
                cxExperiencia.setText(Integer.toString(protag.getExperiencia()));                
                cxEfeito.setText(protag.getEfeito());
                cbxEquipamento.setSelectedItem(protag.getEquipamento());
                cbxHabilidade.setSelectedItem(protag.getHabilidade()); 
            } else {
                JOptionPane.showMessageDialog(null, "Personagem não encontrado", "Aviso", JOptionPane.WARNING_MESSAGE);
                limpar();
            }
            
        }else {
                    boolean nomeAlterado = !protag.getNome().equals(cxNome.getText());
                    boolean nivelAlterado = protag.getNivel() != Integer.parseInt(cxNivel.getText());
                    boolean experienciaAlterada = protag.getExperiencia() != Integer.parseInt(cxExperiencia.getText());
                    if (nomeAlterado || nivelAlterado || experienciaAlterada) {
                        StringBuilder mensagem = new StringBuilder("Os seguintes campos não podem ser alterados:\n");
                        if (nomeAlterado) {
                            mensagem.append("Nome\n");
                            cxNome.setText(protag.getNome()); // Reseta o nome para o original
                        }
                        if (nivelAlterado) {
                            mensagem.append("Nível\n");
                            JOptionPane.showMessageDialog(null,"A atualização de nível deve ser feita no Calcular Nível pelo Mestre");
                            cxNivel.setText(Integer.toString(protag.getNivel())); // Reseta o nível para o original
                        }
                        if (experienciaAlterada) {
                            mensagem.append("Experiência\n");
                            JOptionPane.showMessageDialog(null,"A atualização de experiência deve ser feita no Calcular Nível pelo Mestre");                            
                            cxExperiencia.setText(Integer.toString(protag.getExperiencia())); // Reseta a experiência para o original
                        }
                        JOptionPane.showMessageDialog(null, mensagem.toString(), "Aviso", JOptionPane.WARNING_MESSAGE);
                    }else {
                        protag.setRaca(cxRaca.getText());
                        protag.setClasse(cxClasse.getText());
                        protag.setPontoMana(Integer.parseInt(cxPntMana.getText()));
                        protag.setPontoVida(Integer.parseInt(cxPntVida.getText()));
                        protag.setCarisma(Integer.parseInt(cxCarisma.getText()));
                        protag.setDestreza(Integer.parseInt(cxDestreza.getText()));
                        protag.setForca(Integer.parseInt(cxForca.getText()));
                        protag.setInteligencia(Integer.parseInt(cxInteligencia.getText()));
                        protag.setDinheiro(Integer.parseInt(cxDinheiro.getText()));
                        protag.setEfeito(cxEfeito.getText());                        
                        protag.setEquipamento((Equipamento) cbxEquipamento.getSelectedItem());
                        protag.setHabilidade((Habilidade) cbxHabilidade.getSelectedItem());
                        dao.atualizar(protag);
                        JOptionPane.showMessageDialog(null, "Equipamento atualizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        resetForm();
                }
        }         // TODO add your handling code here:
    }//GEN-LAST:event_btAlterarActionPerformed

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
    
    private void resetForm() {
        protag = null;
        cxNome.setText("");
        cxNivel.setText("");
        cxExperiencia.setText("");        
        limpar();
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
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadPersonagem;
    private javax.swing.JButton btConsultarPersonagem;
    private javax.swing.JButton btLimparForm;
    private javax.swing.JButton btSairForm;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox cbxEquipamento;
    private javax.swing.JComboBox cbxHabilidade;
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
    private javax.swing.JLabel rtEquipamento;
    private javax.swing.JLabel rtExperiencia;
    private javax.swing.JLabel rtForca;
    private javax.swing.JLabel rtHabilidade;
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
