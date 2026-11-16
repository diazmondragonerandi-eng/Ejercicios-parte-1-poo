package Poo;

public class Reproductor {
    String song;
    boolean reproduciendo;

    public Reproductor(String song) {
        this.song = song;
        this.reproduciendo=  true;
    }
    public void pause(){
        this.song = null;
        this.reproduciendo = false;
    }    

    public void mostrar (){
        if (this.reproduciendo){
            System.out.println("Reproduciendo: " + this.song);
        } else {
            System.out.println("No hay canción reproduciéndose.");
        }
    }
    public static void main(String[] args) {
        Reproductor reproductor = new Reproductor("body");
        reproductor.mostrar();
        reproductor.pause();
        reproductor.mostrar();
    }
    
}
