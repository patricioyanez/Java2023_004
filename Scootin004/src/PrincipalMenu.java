import java.util.Scanner;

public class PrincipalMenu {
                    //Ejercicio 3
        // Crear un menu con la opciones:
        // - Ingresar empleado, buscar si existe, 
        // - Listar todo, 
        // - Listar por puesto (seleccionar que puesto), 
        // - Eliminar por rut y salir.
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Empresa empresa = new Empresa();
        String opcion = "";
        while(!opcion.equals("5"))
        {
            System.out.println("* * * M E N Ú * * *");
            System.out.println("1.- Ingresar empleado");
            System.out.println("2.- Listar empleados");
            System.out.println("3.- Listar Ejecutivos");
            System.out.println("4.- Eliminar por rut");
            System.out.println("5.- Salir");
            opcion = leer.next();
            
            if(opcion.indexOf("12345")<0)
                System.out.println("Opción no válida");
            else if(opcion.equals("1"))
            {
                
            }
        }
    }
}
