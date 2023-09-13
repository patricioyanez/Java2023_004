
import java.util.Scanner;


public class PrincipalIf {
    public static void main(String[] args) {
        System.out.println("Sentencia IF");
        
        if(1 == 1)
            System.out.println("1 es igual a 1");
        
        if( 2==2)
        {
            System.out.println("1ra linea");
            System.out.println("2da linea");
            System.out.println("x lineas...");
        }
        
        if( 3 > 10) // sout + tab
        {
            System.out.println("3 es mayor que 10");
        }
        else
        {
            System.out.println("3 no es mayor que 10");
        }
        
        int numero = 5;
        if(numero < 10)
        {
            System.out.println("Tiene unidades");
        }
        else if(numero < 100)
        {
            System.out.println("Tiene decenas");
        }
        else if(numero < 1000)
        {
            System.out.println("Tiene centenas");
        }
        else
        {
            System.out.println("El número es muy grande");
        }
        
        // AND / OR --> && / ||
        int edad = 25;
        // Ejercicio: solicitar la edad al usuario y
        // mostrar a que generación pertenece
        
        System.out.print("Ingrese su edad:");
        Scanner leerTeclado = new Scanner(System.in);
        edad = leerTeclado.nextInt();
        
        if(edad > 11 && edad <= 23)
            System.out.println("Generación z");
        else if(edad > 23 && edad < 43)
            System.out.println("Generación millennials");
        else if(edad >= 43 && edad < 60)
            System.out.println("Generación x");
        else
            System.out.println("Generación baby Boomer");
        
    }
}
