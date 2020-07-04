package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Conexion {
    private String USERNAME = "root";
    private String PASSWORD = "";
    private String DATABASE = "evidenciafinal";
    private String CLASSNAME = "com.mysql.jdbc.Driver";
    private String URL = "jdbc:mysql://localhost/"+DATABASE;
    private Connection con;
    
    
    public Conexion(){
        try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
            
        }catch(ClassNotFoundException | SQLException e){
            System.err.println("ERROR "+ e);
        }
    }
    
    public Connection getConexion(){
        return con;
    }    
    
}
