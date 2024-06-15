package com.mycompany.projeto_poo2;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexaoBD {
    public void fazerConexao(){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://localhost:3306/rpg";
        String driver = "com.mysql.cj.jdbc.Driver";
        String user = "root";
        String senha = "Nerdscraft2";
        try{
            JOptionPane.showMessageDialog(null,"Tentando conectar o BD...");
            conn = DriverManager.getConnection(url,user,senha);
            JOptionPane.showMessageDialog(null,"BD conectado com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Falha no carregamento!");
        }
    }
}
