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

public class HabilidadeDAO {
        String url = "jdbc:mysql://localhost:3306/rpg";
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String senha = "Nerdscraft2";
    
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
    public void inserir(Habilidade habil)
    {
        try{
            Class.forName(driver);
        }catch(Exception ex){
              System.out.println(ex);
        }
        
        try{
            conn = DriverManager.getConnection(url,user,senha);
            String sql1 = "INSERT INTO habilidade(nome,descricao,efeito) VALUES(?,?,?);";
            ps = conn.prepareStatement(sql1);
            ps.setString(1,habil.getNome());
            ps.setString(2,habil.getDescricao());
            ps.setString(3,habil.getEfeito());
            ps.execute();
            ps.close();
            conn.close();
     
        }catch(Exception ex){
              System.out.println(ex);
        }
        
    }
}
