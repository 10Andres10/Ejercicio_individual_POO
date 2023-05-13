package modelo;

public class Coordenada {

        //----------------------
        // Atributos
        //----------------------
        private double x,y;
        
        //----------------------
        // Metodos
        //----------------------
        public double calcularDistancia (Coordenada c){

            double distancia = Math.sqrt(Math.pow((this.x - c.x),2) + Math.pow((this.y - c.y),2) );
            return distancia;

        }

        // Constructor
        public Coordenada(){
        }

        public Coordenada(double x, double y){

            this.x = x;
            this.y = y;
            
        }

        public String toString(){
            
            return "Coordenada ("+ x + " , " + y +")";

        }       

        

        // Getters y Setters

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

}
