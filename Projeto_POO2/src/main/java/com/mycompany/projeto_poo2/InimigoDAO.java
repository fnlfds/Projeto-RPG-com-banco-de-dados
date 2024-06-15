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

public class InimigoDAO {
        String url = "jdbc:mysql://localhost:3306/rpg";
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String senha = "Nerdscraft2";
    
    //manipulações SQL
    public void inserir(Inimigo inimigo)
    {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            Class.forName(driver);
        }catch(Exception ex){
              System.out.println(ex);
        }
        
        try{
            conn = DriverManager.getConnection(url,user,senha);
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
            ps.setInt(10, inimigo.getEquipamento().getId());            
            ps.setInt(11,inimigo.getHabilidade().getId_Habilidade());

            ps.execute();
            ps.close();
            conn.close();
     
        }catch(Exception ex){
              System.out.println(ex);
        }
        
    }
}
