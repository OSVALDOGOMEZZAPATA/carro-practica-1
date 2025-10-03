package practica1;

public class carroejecutar{
    public static void main(String[] args) {
        Carro carro = new Carro("nissan",2022, 5,"Azul");

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Año: " + carro.getAño());
        System.out.println("Color: " + carro.getColor());
        System.out.println("Puertas: " + carro.getPuertas());
    }
    
}
