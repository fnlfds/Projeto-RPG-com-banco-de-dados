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
import java.util.ArrayList;
import java.util.List;

public class MissaoDAO {
        String url = "jdbc:mysql://localhost:3306/rpg";
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String senha = "utfpr";
    
        Connection conn = null;
        PreparedStatement ps = null;
       
    
    //manipulações SQL
        
    public List<Missao> listaMissao(){
     try{
        conn = DriverManager.getConnection(url,user,senha);
        List<Missao> lista = new ArrayList<>();
        String sql = "select * from missao";
        ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            
            Missao obj = new Missao(0,"","","");
            
            obj.setId_Missao(rs.getInt("idmissao"));
            obj.setNome(rs.getString("nome"));
            obj.setObjetivo(rs.getString("objetivo"));
            obj.setRecompensa(rs.getString("recompensa"));
            
            lista.add(obj);               
        }
        return lista;
     }catch(Exception ex){
              System.out.println(ex);
        }       
            return null;
    }        
        
    public void inserir(Missao missao){
        boolean sucesso = false;
        try{
            Class.forName(driver);
        }catch(Exception ex){
              System.out.println(ex);
        }
        
        try{
            conn = DriverManager.getConnection(url,user,senha);
            String checkSql = "SELECT COUNT(*) FROM missao WHERE nome = ?";
                try (PreparedStatement checkStatement = conn.prepareStatement(checkSql)) {
                checkStatement.setString(1, missao.getNome());
                    try (ResultSet resultSet = checkStatement.executeQuery()) {
                        if (resultSet.next() && resultSet.getInt(1) > 0) {
                        JOptionPane.showMessageDialog(null, "Erro: Já existe uma missão com esse nome.");
                        } else {
                            String sql1 = "INSERT INTO missao(nome,objetivo,recompensa) VALUES(?,?,?);";
                            ps = conn.prepareStatement(sql1);
                            ps.setString(1,missao.getNome());
                            ps.setString(2,missao.getObjetivo());
                            ps.setString(3,missao.getRecompensa());
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
                        "Cadastro de Missao",
                        JOptionPane.INFORMATION_MESSAGE
                );
                }       
        }catch (SQLException e) {
            e.printStackTrace();
         }
    }
        
    public void excluir(String nome){
        boolean sucesso = false;
        String sql = "DELETE FROM missao WHERE nome = ?";
            try{
                conn = DriverManager.getConnection(url,user,senha);
                ps = conn.prepareStatement(sql);
                String checkSql = "SELECT COUNT(*) FROM missao WHERE nome = ?";
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
                            JOptionPane.showMessageDialog(null, "Erro: Esta missão não existe.");
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
                        "Exclusão de Missão",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                } 
        }
    
    public Missao consultar(String nome) {
        boolean sucesso = false;        
        String sql = "SELECT * FROM missao WHERE nome = ?";
        Missao missao = null;     
        try (Connection conn = DriverManager.getConnection(url,user,senha);
             PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, nome);
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()){
                    missao = new Missao(0,"","","");   
                    missao.setId_Missao(rs.getInt("idmissao"));
                    missao.setNome(rs.getString("nome"));
                    missao.setObjetivo(rs.getString("objetivo"));
                    missao.setRecompensa(rs.getString("recompensa"));
                    sucesso = true;                    
                }
            }catch (SQLException e) {
            e.printStackTrace();
            }
                if (sucesso) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Verifique as informações!",
                        "Consulta da Missão",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }         
        return missao;
    }    
}
