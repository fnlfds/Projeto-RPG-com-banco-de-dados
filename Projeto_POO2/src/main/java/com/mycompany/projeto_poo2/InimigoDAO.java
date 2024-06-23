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

public class InimigoDAO {
        String url = "jdbc:mysql://localhost:3306/rpg";
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String senha = "utfpr";
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

    public Inimigo consultar(String nome) {
        boolean sucesso = false;        
        String sql = "SELECT * FROM inimigo WHERE nome = ?";
        Inimigo inimigo = null;      
        Equipamento equip = new Equipamento(0,false,"","","","");
        Habilidade habil = new Habilidade(0,"","","");
        try (Connection conn = DriverManager.getConnection(url,user,senha);
             PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, nome);
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()){
                    inimigo = new Inimigo(0,false,0,"","",0,"",0,0,"",equip,habil);   
                    inimigo.setId_Inimigo(rs.getInt("idinimigo"));
                    inimigo.setChefe(rs.getBoolean("chefe"));                    
                    inimigo.setNome(rs.getString("nome"));
                    inimigo.setPontoVida(rs.getInt("pontovida"));
                    inimigo.setPontoMana(rs.getInt("pontomana"));
                    inimigo.setNivel(rs.getInt("nivel"));
                    inimigo.setRaca(rs.getString("raca"));
                    inimigo.setClasse(rs.getString("classe"));
                    inimigo.setExperienciaDrop(rs.getInt("experiencia_dropada"));
                    inimigo.setFraqueza(rs.getString("fraqueza"));
                    int equipamentoId = rs.getInt("equipamento_idequipamento");
                    int habilidadeId = rs.getInt("habilidade_idHabilidade");
                    EquipamentoDAO dao = new EquipamentoDAO();
                    Equipamento equipamento = dao.obterEquipamentoPorId(equipamentoId);
                    HabilidadeDAO dao1 = new HabilidadeDAO();
                    Habilidade habilidade = dao1.obterHabilidadePorId(habilidadeId);                    
                    inimigo.setEquipamento(equipamento);
                    inimigo.setHabilidade(habilidade);                     
                    sucesso = true;  
                }
            }catch (SQLException e) {
            e.printStackTrace();
            }
                if (sucesso) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Verifique as informações!",
                        "Consulta de Inimigo",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }         
        return inimigo;
    }
 
    public void atualizar(Inimigo inimigo) {
        String query = "UPDATE inimigo SET pontovida = ?, pontomana = ?, nivel = ?, raca = ? , classe = ?, chefe = ?, experiencia_dropada = ?, fraqueza = ?"
                + ",equipamento_idequipamento = ?, habilidade_idHabilidade = ? WHERE nome = ?";

        try (Connection connection = DriverManager.getConnection(url,user,senha);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            
            preparedStatement.setInt(1, inimigo.getPontoVida());
            preparedStatement.setInt(2, inimigo.getPontoMana());
            preparedStatement.setInt(3, inimigo.getNivel());
            preparedStatement.setString(4, inimigo.getRaca());
            preparedStatement.setString(5, inimigo.getClasse());
            preparedStatement.setBoolean(6, inimigo.isChefe());
            preparedStatement.setInt(7, inimigo.getExperienciaDrop());
            preparedStatement.setString(8, inimigo.getFraqueza());           
            preparedStatement.setInt(9, inimigo.getEquipamento().getId_Equipamento());
            preparedStatement.setInt(10, inimigo.getHabilidade().getId_Habilidade());
            preparedStatement.setString(11, inimigo.getNome());            
            preparedStatement.executeUpdate();     

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }      
}
