
package com.mycompany.projeto_poo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
         
public class ConexaoBD {

    static Connection conn = null;
    static String url = "jdbc:mysql://localhost:3306/rpg";
    static String driver = "com.mysql.cj.jdbc.Driver";
    static String user = "root";
    static String senha = "Nerdscraft2";
    
    public static void main(String[] args){
        try{
            System.out.println("Carregando o driver...");
            Class.forName(driver);
            System.out.println("Driver carregado com sucesso!");
        }catch(Exception e){
            System.out.println("Falha no carregamento!");
        }
        
        try{
            System.out.println("Tentando conectar o BD...");
            conn = DriverManager.getConnection(url,user,senha);
            System.out.println("BD conectado com sucesso!");
        }catch(Exception e){
            System.out.println("Falha no carregamento!");
        }
    }
}
