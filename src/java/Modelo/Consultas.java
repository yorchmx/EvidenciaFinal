package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Consultas extends Conexion{

    public boolean auth(String usuario, String contraseña) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String query = "select * from usuarios where nUsuario = ? and pUsuario = ?";
            ps = getConexion().prepareStatement(query);
            ps = setString(1, usuario);
            ps = setString(2, contraseña);
            rs = ps.executeQuery();
            
            if(rs.absolute(1))return true;
            
        } 
        catch (SQLException e) {
            System.err.println("ERROR "+ e);
        }finally{
        try {
            if(getConexion()) !=null)getConexion().close();
            if (ps != null) ps.close();
            if (rs !=null) rs.close();
        } catch (SQLException e) {
            System.err.println("ERROR "+ e);
        }
        }
        
        
        return false;
    }
    //Checar si el uuario existe en la base de datos
    public boolean checkUser(String usuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try {
            String query = "select * from usuarios where nUsuario = ?";
            ps = getConexion().prepareStatement(query);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            
            if(rs.absolute(1))return  true;
            
            
        } catch (SQLException e) {
            System.err.println("ERROR "+ e);
        }finally{
            try {
                if(getConexion() !=null)getConexion().close();
                if(ps != null) ps.close();
                if(rs != null) rs.close();
            } catch (Exception e) {
                System.err.println("ERROR "+ e);
            }
            }
            return false;
        }
        
        public String NombreCompleto(String usuario){
        PreparedStatement pss = null;
        ResultSet rs = null;
        String idUs;
        
            try {
                String query = "select nombre_Completo from usuarios where nUsuario = ?;";
                pss = getConexion().prepareStatement(query);
                pss.setString(1, usuario);
                rs = pss.executeQuery();
            if(rs.next()){
                idUs = rs.getString("nombre_Completo");
                return idUs;
            }    
        }    
        catch (Exception e) {
            System.err.println("ERROR "+ e);
        }finally{
                try {
                    if(getConexion() !=null) getConexion().close();
                    if(pss !=null) pss.close();
                } catch (SQLException ex) {
                    System.err.println("ERROR "+ ex);
                }
                }
                    return null;
                }
        public float alturaUser(String usuario) {
            PreparedStatement pss = null;
            ResultSet rs = null;
            float altura;
            
            try {
                String query = "select estatura from usuarios where nUsuario = ?;";
                pss = getConexion().prepareStament(query);
                pss.setString(1, usuario);
                rs = pass.executeQuery();
            if(rs.next()){
                altura = rs.getFloat("estatura");
                return altura;
                }
            }
           catch (Exception e) {
               System.err.println("ERROR "+ e);
            }finally{
                try {
                    if(getConexion() !=null) getConexion().close();
                } catch (Exception e) {
                }
            }
        }
                 
}
