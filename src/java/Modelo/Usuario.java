package Modelo;


public final class Usuario {
    private String usuario;
    private String contraseña;
    private String nombrecompleto;
    private int edad;
    private float estatura;
    private String sexo;
    
    public Usuario(String usuario, String contraseña, String nombrecompleto, String edad, String estatura, String sexo) {
        this.setUsuario(usuario);
        this.setContraseña(contraseña);
        this.setNombrecompleto(nombrecompleto);
        this.setEdad(Integer.parseInt(edad));
        this.setEstatura(Float.parseFloat(estatura));
        this.setSexo(sexo);
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
        
        public String getContraseña() {
            return contraseña;
        }
        
        public  void setContraseña(String contraseña) {
            this.contraseña = contraseña;
        }
        
        public String getNombrecompleto() {
            return nombrecompleto;
        }
        
        public void setNombrecompleto(String nombrecompleto) {
            this.nombrecompleto = nombrecompleto;
        }
        
        public int getEdad() {
            return edad;
        }
        
        public void setEdad(int edad) {
            this.edad = edad;
        }
        
        public float getEstatura() {
            return estatura;
        }
        
        public void setEstatura(float estatura) {
            this.estatura = estatura;
        }
        
        public String getSexo() {
            return sexo;
        }
        
        public void setSexo(String sexo) {
            this.sexo = sexo;
        }
        
}
