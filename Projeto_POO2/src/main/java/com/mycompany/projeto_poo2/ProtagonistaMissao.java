/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_poo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class ProtagonistaMissao {
    
    private Protagonista protagonista;
    private Missao missao;
    private int protagonista_idprotagonista;
    private int missao_idmissao;

    String url = "jdbc:mysql://localhost:3306/rpg";
    String driver = "com.mysql.cj.jdbc.Driver";
    String user = "root";
    String senha = "Nerdscraft2";
    
    Connection conn = null;
    PreparedStatement ps = null;
    
        public void inserir(ProtagonistaMissao protmis){
            
            boolean sucesso = false;
        try{
            Class.forName(driver);
        }catch(Exception ex){
              System.out.println(ex);
        }
        
        try{
            conn = DriverManager.getConnection(url,user,senha);

                            String sql1 = "INSERT INTO diario_de_missoes(protagonista_idprotagonista,missao_idmissao) VALUES(?,?);";
                            ps = conn.prepareStatement(sql1);
                            ps.setInt(1,protmis.getProtagonista().getId_Protagonista());
                            ps.setInt(2,protmis.getMissao().getId_Missao());
                            ps.execute();
                            sucesso = true;
                            ps.close();
                            conn.close();
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
        
    public Protagonista getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(Protagonista protagonista) {
        this.protagonista = protagonista;
    }

    public Missao getMissao() {
        return missao;
    }

    public void setMissao(Missao missao) {
        this.missao = missao;
    }

    public int getProtagonista_idprotagonista() {
        return protagonista_idprotagonista;
    }

    public void setProtagonista_idprotagonista(int protagonista_idprotagonista) {
        this.protagonista_idprotagonista = protagonista_idprotagonista;
    }

    public int getMissao_idmissao() {
        return missao_idmissao;
    }

    public void setMissao_idmissao(int missao_idmissao) {
        this.missao_idmissao = missao_idmissao;
    }

}

