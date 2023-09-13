//https://stackoverflow.com/questions/18480633/java-util-date-format-conversion-yyyy-mm-dd-to-mm-dd-yyyy

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Trabajador trabajador1 = new Trabajador();
        Trabajador trabajador2 = new Trabajador();

        // solicitar los datos al usuario
        System.out.println("**** Ingreso de Trabajador ****");
        System.out.print("Rut       :");
        trabajador1.setRut(leer.next());
        System.out.print("Dígito    :");
        trabajador1.setDv(leer.next());
        System.out.print("Nombre    :");
        trabajador1.setNombre(leer.next());
        
        System.out.println("**** Ingreso 2do Trabajador ****");
        System.out.print("Rut       :");
        trabajador2.setRut(leer.next());
        System.out.print("Dígito    :");
        trabajador2.setDv(leer.next());
        System.out.print("Nombre    :");
        trabajador2.setNombre(leer.next());
        
        System.out.println(trabajador1.imprimir());
        System.out.println(trabajador2.imprimir());
        
    }
}
