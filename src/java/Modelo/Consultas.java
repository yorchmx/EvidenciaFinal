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
            if(getConexion() != null)getConexion().close();
            if (ps != null) ps.close();
            if (rs !=null) rs.close();
        } catch (SQLException e) {
            System.err.println("ERROR "+ e);
        }
        }
        
        
        return false; 
    }
    //Checar si el usuario existe en la base de datos
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
                if(getConexion() != null)getConexion().close();
                if(ps != null) ps.close();
                if(rs != null) rs.close();
            } catch (SQLException e) {
                System.err.println("ERROR "+ e);
            }
            }
            return false;
        }
        //Seleccionar el Nombre Completo
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
        catch (SQLException e) {
            System.err.println("ERROR "+ e);
        }finally{
                try {
                    if(getConexion() != null) getConexion().close();
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
                pss = getConexion().prepareStatement(query);
                pss.setString(1, usuario);
                rs = pss.executeQuery();
            if(rs.next()){
                altura = rs.getFloat("estatura");
                return altura;
                }
            }
           catch (SQLException e) {
               System.err.println("ERROR "+ e);
            }finally{
                try {
                    if(getConexion() != null) getConexion().close();
                    if(pss !=null) pss.close();
                } catch (SQLException e) {
                    System.err.println("ERROR "+ e);
                }
                }
                    return null;
                }
            public float edadUser(String usuario) {
                PreparedStatement pss = null;
                ResultSet rs = null;
                float edad;
                
                try {
                    String query = "slect edad from usuarios where nUsuario = ?;";
                    pss = getConexion().prepareStatement(query);
                    pss.setString(1, usuario);
                    rs = pss.executeQuery();
                    if(rs.next()){
                        edad = rs.getFloat("edad");
                        return edad;
                    }
                }
                catch (SQLException e) {
                    System.err.println("ERROR "+ e);
                }finally{
                    try {
                        if(getConexion() != null) getConexion().close();
                        if(pss !=null) pss.close();
                    } catch (SQLException e) {
                        System.err.println("ERROR "+ e);
                    }
                    }
                        return null;
                    }
                public  float sexoUser(String usuario) {
                    PreparedStatement pss = null;
                    ResultSet rs = null;
                    int sexo;
                    
                    try {
                        String query = "select sexo from usuarios where nUsuario = ?";
                        pss = getConexion().prepareStatement(query);
                        pss.setString(1, usuario);
                        rs = pss.executeQuery();
                        if(rs.next()){
                            sexo = rs.getInt("sexo");
                            return sexo;
                        }
                    }    
                    catch (SQLException e) {
                        System.err.println("ERROR "+ e);
                    }finally{
                        try {
                            if(getConexion() != null) getConexion().close();
                            if(pss !=null) pss.close();
                        } catch (SQLException e) {
                            System.err.println("ERROR "+ e);
                        }
                        }
                            return null;
                        }

    private Object getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private PreparedStatement setString(int i, String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}        
