package Colaboracion;

public class Principal {
    public static void main(String[] args) {
        
        Cancion cancion1 = new Cancion();
        cancion1.setNombre("Llueve sobre la ciudad");
        cancion1.setArtista("Los Bunkers");
        cancion1.setAlbum("Vida de Perros");
        cancion1.setGenero("rock");
        cancion1.setDuracion(360);
        
        System.out.println("**** Canción ****");
        System.out.println(cancion1.imprimir());
        
        Streaming spotify = new Streaming();
        spotify.setCancion(cancion1);
        spotify.setSegundosReproducidos(60);
        
        System.out.println("**** Streaming ****");
        System.out.println(spotify.imprimir());
        cancion1.setNombre("Quién fuera");
        System.out.println("\nCanción Actual:");
        System.out.println(spotify.getCancion().getNombre() );
        
        
    }
}
