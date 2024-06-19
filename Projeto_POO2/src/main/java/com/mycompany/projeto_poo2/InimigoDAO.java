/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_poo2;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLIntegrityConstraintViolationException;

public class InimigoDAO {
        String url = "jdbc:mysql://localhost:3306/rpg";
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String senha = "Nerdscraft2";
        Connection conn = null;
        PreparedStatement ps = null;
    
    //manipulações SQL
    public void inserir(Inimigo inimigo)
    {
        boolean sucesso = false;
        
        try{
            Class.forName(driver);
        }catch(Exception ex){
              System.out.println(ex);
        }
        
        try{
            conn = DriverManager.getConnection(url,user,senha);
            String checkSql = "SELECT COUNT(*) FROM inimigo WHERE nome = ?";
                try (PreparedStatement checkStatement = conn.prepareStatement(checkSql)) {
                checkStatement.setString(1, inimigo.getNome());
                    try (ResultSet resultSet = checkStatement.executeQuery()) {
                        if (resultSet.next() && resultSet.getInt(1) > 0) {
                        JOptionPane.showMessageDialog(null, "Erro: Já existe um inimigo com esse nome.");
                        } else {
                            String sql1 = "INSERT INTO inimigo(nome,pontovida,pontomana,nivel,raca,classe,chefe,experiencia_dropada,fraqueza"
                                    + ",equipamento_idequipamento,habilidade_idHabilidade) VALUES(?,?,?,?,?,?,?,?,?,?,?);";
                            ps = conn.prepareStatement(sql1);
                            ps.setString(1,inimigo.getNome());
                            ps.setString(2,Integer.toString(inimigo.getPontoVida()));
                            ps.setString(3,Integer.toString(inimigo.getPontoMana()));
                            ps.setString(4,Integer.toString(inimigo.getNivel()));
                            ps.setString(5,inimigo.getRaca());
                            ps.setString(6,inimigo.getClasse());
                            ps.setString(7,Boolean.toString(inimigo.isChefe()));
                            ps.setString(8,Integer.toString(inimigo.getExperienciaDrop()));
                            ps.setString(9,inimigo.getFraqueza());
                            ps.setInt(10, inimigo.getEquipamento().getId_Equipamento());            
                            ps.setInt(11,inimigo.getHabilidade().getId_Habilidade());
                            ps.execute();
                            sucesso = true;
                            ps.close();
                            conn.close();
                        }
                    }
                }
            if (sucesso) {
                JOptionPane.showMessageDialog(
                    null,
                    "Cadastro realizado com sucesso!",
                    "Cadastro de Inimigo",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }        
        }catch (SQLException e) {
            e.printStackTrace();
            }
    }
    
    public void excluir(String nome){
        boolean sucesso = false;
        String sql = "DELETE FROM inimigo WHERE nome = ?";
            try{
                conn = DriverManager.getConnection(url,user,senha);
                ps = conn.prepareStatement(sql);
                String checkSql = "SELECT COUNT(*) FROM inimigo WHERE nome = ?";
                try (PreparedStatement checkStatement = conn.prepareStatement(checkSql)) {
                    checkStatement.setString(1, nome);
                    try (ResultSet resultSet = checkStatement.executeQuery()) {
                        if (resultSet.next() && resultSet.getInt(1) > 0) {
                            ps.setString(1, nome);
                            ps.executeUpdate();
                            sucesso = true;
                            ps.close();
                            conn.close();
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro: Este inimigo não existe.");
                        }
                    }
                }
            }                   
            catch (SQLException e) {
                e.printStackTrace();
            }
                if (sucesso) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Exclusão realizada com sucesso!",
                        "Exclusão do Inimigo",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                } 
        }    
}
