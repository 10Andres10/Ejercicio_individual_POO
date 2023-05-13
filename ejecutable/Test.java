package ejecutable;

import modelo.Coordenada;

// import modelo.Coordenada;

public class Test{
    public static void main(String[] args) {

        // Coordenada miCoordenada = new Coordenada();
        
        Coordenada c1 = new Coordenada();
        Coordenada c2 = new Coordenada(1.3, 5.3);
        Coordenada c3 = c1;
        Coordenada c4 = c2;

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
        System.out.println("c4: " + c4);


        System.out.println("\n----------------------\n");
        System.out.println(c1.equals(c2)  ? " c1 y c2 Son iguales" : " c1 y c2  son diferentes");
        System.out.println(  c1.equals(c3)  ? " c1 y c3  Son iguales" : " c1 y c3  son diferentes");
        
        System.out.println("\n----------------------\n");
        System.out.println("Calcular distacia de c1 a c2:  " + "\nLa distancia  es: " + c1.calcularDistancia(c2));
        System.out.println("Calcular distacia de c4 y c2: " + "\nLa distancia  es: " + c4.calcularDistancia(c2));

    }
}