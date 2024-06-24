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
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLIntegrityConstraintViolationException;

public class HabilidadeDAO {
        String url = "jdbc:mysql://localhost:3306/rpg";
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String senha = "direito";
    
        Connection conn = null;
        PreparedStatement ps = null;
        
    public List<Habilidade> listaHabilidade(){
     try{
        conn = DriverManager.getConnection(url,user,senha);
        List<Habilidade> lista = new ArrayList<>();
        String sql = "select * from habilidade";
        ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            
            Habilidade obj = new Habilidade(0,"","","");
            
            obj.setId_Habilidade(rs.getInt("idHabilidade"));
            obj.setNome(rs.getString("nome"));
            obj.setDescricao(rs.getString("descricao"));
            obj.setEfeito(rs.getString("efeito"));
            
            lista.add(obj);               
        }
        return lista;
     }catch(Exception ex){
              System.out.println(ex);
        }       
            return null;
    }    
    
    //manipulações SQL
    public void inserir(Habilidade habil){
            boolean sucesso = false;
        try{
            Class.forName(driver);
        }catch(Exception ex){
              System.out.println(ex);
        }
        
        try{
            conn = DriverManager.getConnection(url,user,senha);
            String checkSql = "SELECT COUNT(*) FROM habilidade WHERE nome = ?";
                try (PreparedStatement checkStatement = conn.prepareStatement(checkSql)) {
                checkStatement.setString(1, habil.getNome());
                    try (ResultSet resultSet = checkStatement.executeQuery()) {
                        if (resultSet.next() && resultSet.getInt(1) > 0) {
                        JOptionPane.showMessageDialog(null, "Erro: Já existe uma habilidade com esse nome.");
                        } else {
                            String sql1 = "INSERT INTO habilidade(nome,descricao,efeito) VALUES(?,?,?);";
                            ps = conn.prepareStatement(sql1);
                            ps.setString(1,habil.getNome());
                            ps.setString(2,habil.getDescricao());
                            ps.setString(3,habil.getEfeito());
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
                    "Cadastro de Habilidade",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        }catch (SQLException e) {
            e.printStackTrace();
            }
    }
    
    public void excluir(String nome){
        boolean sucesso = false;
        String sql = "DELETE FROM habilidade WHERE nome = ?";
        try{
            conn = DriverManager.getConnection(url,user,senha);
            ps = conn.prepareStatement(sql);
            String checkSql = "SELECT COUNT(*) FROM habilidade WHERE nome = ?";
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
                        JOptionPane.showMessageDialog(null, "Erro: Esta habilidade não existe.");
                    }
                }
            }catch (SQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(null, "Erro: Não é possível excluir a habilidade"
                        + " porque está associado a um personagem.");
             }
        }                   
        catch (SQLException e) {
            e.printStackTrace();
            }
             if (sucesso) {
                JOptionPane.showMessageDialog(
                    null,
                    "Exclusão realizada com sucesso!",
                    "Exclusão de Habilidade",
                    JOptionPane.INFORMATION_MESSAGE
                );
        }        
    }

    public Habilidade consultar(String nome) {
        boolean sucesso = false;        
        String sql = "SELECT * FROM habilidade WHERE nome = ?";
        Habilidade habil = null;     
        try (Connection conn = DriverManager.getConnection(url,user,senha);
             PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, nome);
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()){
                    habil = new Habilidade(0,"","","");   
                    habil.setId_Habilidade(rs.getInt("idhabilidade"));
                    habil.setNome(rs.getString("nome"));
                    habil.setDescricao(rs.getString("descricao"));
                    habil.setEfeito(rs.getString("efeito"));
                    sucesso = true;                    
                }
            }catch (SQLException e) {
            e.printStackTrace();
            }
                if (sucesso) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Verifique as informações!",
                        "Consulta da Habilidade",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }         
        return habil;
    }
    public Habilidade obterHabilidadePorId(int idhabilidade) {
        Habilidade habilidade = null;
        String query = "SELECT * FROM habilidade WHERE idhabilidade = ?";

        try (Connection connection = DriverManager.getConnection(url,user,senha);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, idhabilidade);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                habilidade = new Habilidade(0,"","","");
                habilidade.setId_Habilidade(rs.getInt("idhabilidade"));
                habilidade.setNome(rs.getString("nome"));
                habilidade.setDescricao(rs.getString("descricao"));
                habilidade.setEfeito(rs.getString("efeito"));                
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return habilidade;
    }
    public void atualizar(Habilidade habil) {
        String query = "UPDATE habilidade SET descricao = ?, efeito = ? WHERE nome = ?";

        try (Connection connection = DriverManager.getConnection(url,user,senha);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            
            preparedStatement.setString(1, habil.getDescricao());
            preparedStatement.setString(2, habil.getEfeito());
            preparedStatement.setString(3, habil.getNome());

            preparedStatement.executeUpdate();     

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }    
}
