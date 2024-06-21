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

public class EquipamentoDAO {
        String url = "jdbc:mysql://localhost:3306/rpg";
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String senha = "Nerdscraft2";
    
        Connection conn = null;
        PreparedStatement ps = null;
        
    public List<Equipamento> listaEquipamento(){
     try{
        conn = DriverManager.getConnection(url,user,senha);
        List<Equipamento> lista = new ArrayList<>();
        String sql = "select * from equipamento";
        ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            
            Equipamento obj = new Equipamento(0,false,"","","","");
            
            obj.setId_Equipamento(rs.getInt("idequipamento"));
            obj.setNome(rs.getString("nome"));
            obj.setTipo(rs.getString("tipo"));
            obj.setEfeito(rs.getString("efeito"));
            obj.setConsumivel(rs.getBoolean("consumivel"));
            obj.setRaridade(rs.getString("raridade"));
            
            lista.add(obj);               
        }
        return lista;
     }catch(Exception ex){
              System.out.println(ex);
        }       
            return null;
    }    
    
    //manipulações SQL
    public void inserir(Equipamento equip){
        boolean sucesso = false;
        try{
            Class.forName(driver);
        }catch(Exception ex){
              System.out.println(ex);
        }
        
        try{
            conn = DriverManager.getConnection(url,user,senha);
            String checkSql = "SELECT COUNT(*) FROM equipamento WHERE nome = ?";
                try (PreparedStatement checkStatement = conn.prepareStatement(checkSql)) {
                checkStatement.setString(1, equip.getNome());
                    try (ResultSet resultSet = checkStatement.executeQuery()) {
                        if (resultSet.next() && resultSet.getInt(1) > 0) {
                        JOptionPane.showMessageDialog(null, "Erro: Já existe um equipamento com esse nome.");
                        } else {
                            String sql1 = "INSERT INTO equipamento(nome,tipo,efeito,consumivel,raridade) VALUES(?,?,?,?,?);";
                            ps = conn.prepareStatement(sql1);
                            ps.setString(1,equip.getNome());
                            ps.setString(2,equip.getTipo());
                            ps.setString(3,equip.getEfeito());
                            ps.setString(4,Boolean.toString(equip.isConsumivel()));
                            ps.setString(5,equip.getRaridade());
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
                    "Cadastro de Equipamento",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        }catch (SQLException e) {
            e.printStackTrace();
            }
    }

    public void excluir(String nome){
        boolean sucesso = false;
        String sql = "DELETE FROM equipamento WHERE nome = ?";
            try{
                conn = DriverManager.getConnection(url,user,senha);
                ps = conn.prepareStatement(sql);
                String checkSql = "SELECT COUNT(*) FROM equipamento WHERE nome = ?";
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
                            JOptionPane.showMessageDialog(null, "Erro: Este equipamento não existe.");
                        }
                    }
                }catch (SQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(null, "Erro: Não é possível excluir o equipamento porque está associado a um personagem.");
                 }
            }                   
            catch (SQLException e) {
                e.printStackTrace();
            }
                if (sucesso) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Exclusão realizada com sucesso!",
                        "Exclusão do Equipamento",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                } 
        }

    public Equipamento consultar(String nome) {
        boolean sucesso = false;        
        String sql = "SELECT * FROM equipamento WHERE nome = ?";
        Equipamento equip = null;     
        try (Connection conn = DriverManager.getConnection(url,user,senha);
             PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, nome);
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()){
                    equip = new Equipamento(0,false,"","","","");   
                    equip.setId_Equipamento(rs.getInt("idequipamento"));
                    equip.setNome(rs.getString("nome"));
                    equip.setTipo(rs.getString("tipo"));
                    equip.setEfeito(rs.getString("efeito"));
                    equip.setConsumivel(rs.getBoolean("consumivel"));
                    equip.setRaridade(rs.getString("raridade"));
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
        return equip;
    }    
    
}
