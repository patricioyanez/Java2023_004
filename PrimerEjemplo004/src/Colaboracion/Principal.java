package Colaboracion;

import java.util.Scanner;

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

        System.out.println("\nCanción Actual:");
        System.out.println(spotify.getCancion().getNombre() );
        System.out.println(spotify.getSegundosReproducidos());
        
        // mostrar artista en reproducción
        System.out.println("\nArtista:");
        System.out.println(spotify.getCancion().getArtista() );
        
        
        // Crear un metodo que permita saber cuantos segundos
        // de la canción falta por reproducir.
        // Mostrar al usuario este valor
        System.out.print("\nSegundos faltantes de reproduccción: ");
        System.out.print(spotify.segundosFaltantes());
        
        // Crear otra canción. 
        // solicitar los datos al usuario.
        // "transmitirla" vía spotify.
        
        Scanner leer = new Scanner(System.in);
        Cancion cancion2 = new Cancion();
        System.out.println("\n\n**** Ingreso de nueva canción *****");
        System.out.print("Ingrese nombre    : ");
        cancion2.setNombre(leer.next());
        System.out.print("Ingrese album     : ");
        cancion2.setAlbum(leer.next());
        System.out.print("Ingrese artista   : ");
        cancion2.setArtista(leer.next());
        System.out.print("Ingrese Genero    : ");
        cancion2.setGenero(leer.next());
        System.out.print("Ingrese Duración  : ");
        cancion2.setDuracion(leer.nextInt());
        
        spotify.setCancion(cancion2);
        spotify.setSegundosReproducidos(30);
        
        System.out.println("**** Streaming ****");
        System.out.println(spotify.imprimir());
        System.out.print("\nSegundos faltantes de reproduccción: ");
        System.out.print(spotify.segundosFaltantes());
        
    }
}
