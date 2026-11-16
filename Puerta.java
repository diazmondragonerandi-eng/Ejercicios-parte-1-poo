package Poo;

public class Puerta {
    public boolean abierta;

     public Puerta(){
        this.abierta = false;
    }

    public void encender(){
        this.abierta = true;
    }
    public void apagar() {
        this.abierta= false;
    }

    public boolean estaEncendida() {
        return this.abierta;
    }

    public void mostrarEstado() {
        if (this.abierta) {
            System.out.println("La puerta está abierta.");
        } else {
            System.out.println("La puerta está cerrada.");
        }
    }

    public static void main(String[] args) {
        Puerta p = new Puerta();
        p.mostrarEstado(); 
        p.encender();
        p.mostrarEstado(); 
        p.apagar();
        p.mostrarEstado(); 
    }

}
