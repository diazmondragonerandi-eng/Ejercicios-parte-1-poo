package Poo;

public class Semaforo {
    String color;

    public Semaforo(String color) {
        this.color = color;
    }
    public void CambiarRojo(){
        this.color = "rojo";
    }
    public void CambiarAmarillo(){
        this.color = "amarillo";
    }
    public void CambiarVerde(){
        this.color = "verde";
    }
    public void mostrar (){
        System.out.println("El semáforo está en color: " + this.color);
    }

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo("rojo");
        semaforo.mostrar();
        semaforo.CambiarVerde();
        semaforo.mostrar();
        semaforo.CambiarAmarillo();
        semaforo.mostrar();
    }
}