package Modelo;


public class IMC {
    private float peso;
    private float altura;
    private float IMC;
    
    public IMC(String peso, float altura) {
        this.setPeso(Float.parseFloat(peso));
        this.SetAltura(altura);
    }
    
    public void calculoIMC(){
        this.setIMC(this.getPeso()/(this.getAltura()*this.getAltura()));
    }
    
    public float getPeso(){
        return peso;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public float getAltura(){
        return altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
    
}
