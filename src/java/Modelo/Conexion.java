/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.DriverManager;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;   
import java.sql.SQLException;

/**
 *
 * @author Memo
 */
public class Conexion
{
    public static final String USERNAME = "user";
    public static final String PASSWORD = "Abrelata$7";
    public static final String HOST = "192.168.64.2";
    public static final String PORT = "3306";
    public static final String DATABASE = "IMC";
    public static final String CLASSNAME = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://"+ HOST +":"+PORT+"/"+DATABASE;
    
     public java.sql.Connection con;
     
        public Conexion() {
            
            try {
                Class.forName(CLASSNAME);
                 con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Error");
            }
    }      
        
}

