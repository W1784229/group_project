/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author W1758597 Rabiul Alam
 */

import java.sql.*;
public class connectDB {
    
    public static Connection getConnection(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:company.db";
            Connection con = DriverManager.getConnection(url);
            return con;
        }catch(Exception e){
            return null;
        }
        
}
    
    
    
    
}
