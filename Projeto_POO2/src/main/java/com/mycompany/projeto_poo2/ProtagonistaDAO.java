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

public class ProtagonistaDAO {
        String url = "jdbc:mysql://localhost:3306/rpg";
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String senha = "direito";
        Connection conn = null;
        PreparedStatement ps = null;
        
    
    //manipulações SQL
        
    public List<Protagonista> listaProtagonista(){
     try{
        conn = DriverManager.getConnection(url,user,senha);
        Equipamento equip = new Equipamento(0,false,"","","","");
        Habilidade habil = new Habilidade(0,"","","");
        List<Protagonista> lista = new ArrayList<>();
        String sql = "select * from protagonista";
        ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            
            Protagonista obj = new Protagonista(0,0,0,0,"",0,0,0,"",0,"",0,0,"",equip, habil);
            
            obj.setId_Protagonista(rs.getInt("idprotagonista"));
            obj.setNome(rs.getString("nome"));
            obj.setPontoVida(rs.getInt("pontovida"));
            obj.setPontoMana(rs.getInt("pontomana"));
            obj.setNivel(rs.getInt("nivel"));
            obj.setRaca(rs.getString("raca"));
            obj.setClasse(rs.getString("classe"));
            obj.setExperiencia(rs.getInt("experiencia"));
            obj.setForca(rs.getInt("forca"));
            obj.setDestreza(rs.getInt("destreza"));
            obj.setInteligencia(rs.getInt("inteligencia"));
            obj.setCarisma(rs.getInt("carisma"));
            obj.setEfeito(rs.getString("efeito"));
            obj.setDinheiro(rs.getInt("dinheiro"));
            obj.setEquipamento(equip);
            obj.setHabilidade(habil);
            
            lista.add(obj);               
        }
        return lista;
     }catch(Exception ex){
              System.out.println(ex);
        }       
            return null;
    }        
        
    public void inserir(Protagonista protagonista){
        boolean sucesso = false;
        try{
            Class.forName(driver);
        }catch(Exception ex){
              System.out.println(ex);
        }
        
        try{
            conn = DriverManager.getConnection(url,user,senha);
            String checkSql = "SELECT COUNT(*) FROM protagonista WHERE nome = ?";
                try (PreparedStatement checkStatement = conn.prepareStatement(checkSql)) {
                checkStatement.setString(1, protagonista.getNome());
                    try (ResultSet resultSet = checkStatement.executeQuery()) {
                        if (resultSet.next() && resultSet.getInt(1) > 0) {
                        JOptionPane.showMessageDialog(null, "Erro: Já existe um personagem com esse nome.");
                        } else {            
                            String sql1 = "INSERT INTO protagonista(nome,pontovida,pontomana,nivel,raca,classe,experiencia"
                                    + ",forca,destreza,inteligencia,carisma,efeito,dinheiro,habilidade_idHabilidade,equipamento_idequipamento) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
                            ps = conn.prepareStatement(sql1);
                            ps.setString(1,protagonista.getNome());
                            ps.setString(2,Integer.toString(protagonista.getPontoVida()));
                            ps.setString(3,Integer.toString(protagonista.getPontoMana()));
                            ps.setString(4,Integer.toString(protagonista.getNivel()));
                            ps.setString(5,protagonista.getRaca());
                            ps.setString(6,protagonista.getClasse());
                            ps.setString(7,Integer.toString(protagonista.getExperiencia()));
                            ps.setString(8,Integer.toString(protagonista.getForca()));
                            ps.setString(9,Integer.toString(protagonista.getDestreza()));
                            ps.setString(10,Integer.toString(protagonista.getInteligencia()));
                            ps.setString(11,Integer.toString(protagonista.getCarisma()));
                            ps.setString(12,protagonista.getEfeito());
                            ps.setString(13,Integer.toString(protagonista.getDinheiro()));
                            ps.setInt(14,protagonista.getHabilidade().getId_Habilidade());
                            ps.setInt(15, protagonista.getEquipamento().getId_Equipamento());
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
                    "Cadastro de Personagem",
                    JOptionPane.INFORMATION_MESSAGE
                );
         }       
        }catch (SQLException e) {
            e.printStackTrace();
            }
    }
    public void excluir(String nome){
        boolean sucesso = false;
        String sql = "DELETE FROM protagonista WHERE nome = ?";
            try{
                conn = DriverManager.getConnection(url,user,senha);
                ps = conn.prepareStatement(sql);
                String checkSql = "SELECT COUNT(*) FROM protagonista WHERE nome = ?";
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
                            JOptionPane.showMessageDialog(null, "Erro: Este personagem não existe.");
                        }
                    }
                }catch (SQLIntegrityConstraintViolationException e) {
                JOptionPane.showMessageDialog(null, "Erro: Não é possível excluir o personagem pois ele está em uma missão.");
                 }
            }                   
            catch (SQLException e) {
                e.printStackTrace();
            }
                if (sucesso) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Exclusão realizada com sucesso!",
                        "Exclusão de Personagem",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                } 
        }

    public Protagonista consultar(String nome) {
        boolean sucesso = false;        
        String sql = "SELECT * FROM protagonista WHERE nome = ?";
        Protagonista protag = null;      
        Equipamento equip = new Equipamento(0,false,"","","","");
        Habilidade habil = new Habilidade(0,"","","");
        try (Connection conn = DriverManager.getConnection(url,user,senha);
             PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, nome);
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()){
                    protag = new Protagonista(0,0,0,0,"",0,0,0,"",0,"",0,0,"",equip,habil);   
                    protag.setId_Protagonista(rs.getInt("idprotagonista"));                
                    protag.setNome(rs.getString("nome"));
                    protag.setPontoVida(rs.getInt("pontovida"));
                    protag.setPontoMana(rs.getInt("pontomana"));
                    protag.setNivel(rs.getInt("nivel"));
                    protag.setRaca(rs.getString("raca"));
                    protag.setClasse(rs.getString("classe"));
                    protag.setExperiencia(rs.getInt("experiencia"));
                    protag.setForca(rs.getInt("forca"));
                    protag.setDestreza(rs.getInt("destreza"));
                    protag.setInteligencia(rs.getInt("inteligencia"));                    
                    protag.setCarisma(rs.getInt("carisma"));
                    protag.setEfeito(rs.getString("efeito"));
                    protag.setDinheiro(rs.getInt("dinheiro")); 
                    int equipamentoId = rs.getInt("equipamento_idequipamento");
                    int habilidadeId = rs.getInt("habilidade_idHabilidade");
                    EquipamentoDAO dao = new EquipamentoDAO();
                    Equipamento equipamento = dao.obterEquipamentoPorId(equipamentoId);
                    HabilidadeDAO dao1 = new HabilidadeDAO();
                    Habilidade habilidade = dao1.obterHabilidadePorId(habilidadeId);                      
                    protag.setEquipamento(equipamento);                
                    protag.setHabilidade(habilidade);                  
                    sucesso = true;  
                }
            }catch (SQLException e) {
            e.printStackTrace();
            }
                if (sucesso) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Verifique as informações!",
                        "Consulta de Personagem",
                        JOptionPane.INFORMATION_MESSAGE
                    );
                }         
        return protag;
    }

    public void atualizar(Protagonista protag) {
        String query = "UPDATE protagonista SET pontovida = ?, pontomana = ?, raca = ? , classe = ?, forca = ?, destreza = ?"
                + ",inteligencia = ?, carisma = ?, efeito = ?, dinheiro = ?, habilidade_idHabilidade = ?, equipamento_idequipamento = ?  WHERE nome = ?";

        try (Connection connection = DriverManager.getConnection(url,user,senha);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            
            preparedStatement.setInt(1, protag.getPontoVida());
            preparedStatement.setInt(2, protag.getPontoMana());
            preparedStatement.setString(3, protag.getRaca());
            preparedStatement.setString(4, protag.getClasse());
            preparedStatement.setInt(5, protag.getForca());
            preparedStatement.setInt(6, protag.getDestreza()); 
            preparedStatement.setInt(7, protag.getInteligencia()); 
            preparedStatement.setInt(8, protag.getCarisma()); 
            preparedStatement.setString(9, protag.getEfeito()); 
            preparedStatement.setInt(10, protag.getDinheiro());
            preparedStatement.setInt(11, protag.getHabilidade().getId_Habilidade());            
            preparedStatement.setInt(12, protag.getEquipamento().getId_Equipamento());
            preparedStatement.setString(13, protag.getNome());            
            preparedStatement.executeUpdate();     

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void atualizarExperienciaENivel(Protagonista protagonista) {
        String query = "UPDATE protagonista SET experiencia = ?, nivel = ? WHERE nome = ?";

        try (Connection connection = DriverManager.getConnection(url,user,senha);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, protagonista.getExperiencia());
            preparedStatement.setInt(2, protagonista.getNivel());
            preparedStatement.setString(3, protagonista.getNome());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }    
}
