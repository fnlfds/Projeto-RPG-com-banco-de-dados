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
            
            obj.setId(rs.getInt("idequipamento"));
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
    public void inserir(Equipamento equip)
    {
        try{
            Class.forName(driver);
        }catch(Exception ex){
              System.out.println(ex);
        }
        
        try{
            conn = DriverManager.getConnection(url,user,senha);
            String sql1 = "INSERT INTO equipamento(nome,tipo,efeito,consumivel,raridade) VALUES(?,?,?,?,?);";
            ps = conn.prepareStatement(sql1);
            ps.setString(1,equip.getNome());
            ps.setString(2,equip.getTipo());
            ps.setString(3,equip.getEfeito());
            ps.setString(4,Boolean.toString(equip.isConsumivel()));
            ps.setString(5,equip.getRaridade());
            ps.execute();
            ps.close();
            conn.close();
     
        }catch(Exception ex){
              System.out.println(ex);
        }
        
    }
}
