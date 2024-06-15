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

public class ProtagonistaDAO {
        String url = "jdbc:mysql://localhost:3306/rpg";
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String senha = "Nerdscraft2";
    
    //manipulações SQL
    public void inserir(Protagonista protagonista)
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
            ps.setInt(15, protagonista.getEquipamento().getId());
            ps.execute();
            ps.close();
            conn.close();
     
        }catch(Exception ex){
              System.out.println(ex);
        }
        
    }
}
