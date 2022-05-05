/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


import javax.swing.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 *
 * @author W1758597 Rabiul Alam
 */
public class createDB {
    
     public static void main(String[] args) {


        new Connect();

    }

}


class Connect{

    private String urlSQLite;
    private Driver driverSQLite;
    private Connection con;

    public Connect() {

        urlSQLite = "jdbc:sqlite:company.db";


        try {
            driverSQLite = new org.sqlite.JDBC();
            DriverManager.registerDriver(driverSQLite);
            System.out.println("Driver for SQLite downloaded");
        } catch (Exception e) {
            System.out.println("problem with connection to SQLite: " + e.getMessage());
        }

        try {

            con = DriverManager.getConnection(urlSQLite);
            System.out.println("connection to sQLite is done.");

        } catch (SQLException e) {
            System.out.println("Problem with connection to SQLite: " + e.getMessage());
        }

        try {
            if (!con.isClosed()) {
                con.close();
                System.out.println("connection to sqlite is closed");
            }
        } catch (SQLException e) {
            System.out.println("problem with close connection of SQLite");
        }

    }
    
}
