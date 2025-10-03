package practica1

public class carro{
    
    private String modelo;
    private int año;
    private int puertas;
    private String color;

    public carro(String modelo,int año,int puertas,String color){
        this.modelo = modelo;
        this.año = año;
        this.puertas = puertas;
        this.color = color;
    }

    public int getAño(){
        return año;
    }

    public string getcolor(){
        return color;
    }
    public String getModelo() {
        return modelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

}  