/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_poo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class LinkProtagonistaDAO {
   
String url = "jdbc:mysql://localhost:3306/rpg";
    String driver = "com.mysql.cj.jdbc.Driver";
    String user = "root";
    String senha = "Nerdscraft2";
    
    Connection conn = null;
    PreparedStatement ps = null;

    public boolean relacaoExiste(ProtagonistaMissao protmis) throws SQLException {
        String query = "SELECT COUNT(*) FROM diario_de_missoes WHERE protagonista_idprotagonista = ? AND missao_idmissao = ?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, protmis.getProtagonista_idprotagonista());
            ps.setInt(2, protmis.getMissao_idmissao());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        }
        return false;
    }
    
        public void inserir(ProtagonistaMissao protmis){
            
            boolean sucesso = false;
        try{
            Class.forName(driver);
        }catch(Exception ex){
              System.out.println(ex);
        }
        
        try{
            conn = DriverManager.getConnection(url,user,senha);
                if (!relacaoExiste(protmis)){
                            String sql1 = "INSERT INTO diario_de_missoes(protagonista_idprotagonista,missao_idmissao) VALUES(?,?);";
                            ps = conn.prepareStatement(sql1);
                            ps.setInt(1,protmis.getProtagonista().getId_Protagonista());
                            ps.setInt(2,protmis.getMissao().getId_Missao());
                            ps.execute();
                            sucesso = true;
                            ps.close();
                            conn.close();
                }/*else{
                    throw new SQLIntegrityConstraintViolationException("Personagem já esta nessa missão.");
                }*/
             if (sucesso) {
            JOptionPane.showMessageDialog(
                    null,
                    "Cadastro realizado com sucesso!",
                    "Cadastro de Habilidade",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        }catch (SQLIntegrityConstraintViolationException e){ 
          JOptionPane.showMessageDialog(null, "Personagem já esta nessa missão.", "Erro", JOptionPane.ERROR_MESSAGE);
        }catch (SQLException e) {
            e.printStackTrace();
            }
    }
        
    public boolean estaNaMissao(ProtagonistaMissao protmis) throws SQLException {
        String query = "SELECT COUNT(*) FROM diario_de_missoes WHERE protagonista_idprotagonista = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, protmis.getProtagonista_idprotagonista());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        }
        return false;
    }
    
    public List<Missao> listarMissoesPersonagem(ProtagonistaMissao protmis) throws SQLException {
        List<Missao> missoes = new ArrayList<>();
        String query = "SELECT m.id_missao, m.nome, m.objetivo, m.recompensa FROM missao m " +
                       "JOIN diario_de_missoes dm ON m.id_missao = dm.missao_idmiessao " +
                       "WHERE dm.protagonista_idprotagonista = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, protmis.getProtagonista_idprotagonista());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Missao missao = new Missao(rs.getInt("id"), rs.getString("nome"), rs.getString("objetivo"), rs.getString("recompensa"));
                missoes.add(missao);
            }
        }
        return missoes;
    }
    public void excluir(ProtagonistaMissao protmis) throws SQLException {
        String query = "DELETE FROM diario_de_missoes WHERE protagonista_idprotagonista = ? AND missao_idmissao = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, protmis.getProtagonista_idprotagonista());
            stmt.setInt(2, protmis.getMissao_idmissao());
            stmt.executeUpdate();
        }
    }    
}
