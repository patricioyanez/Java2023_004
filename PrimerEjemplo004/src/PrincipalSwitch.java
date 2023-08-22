
import java.util.Scanner;

public class PrincipalSwitch {
    public static void main(String[] args) {
        System.out.println("Sentencia Switch");
        Scanner leerTeclado = new Scanner(System.in);
        System.out.println("Ingrese grado de la media");
        int grado = leerTeclado.nextInt();
        switch(grado)
        {
            case 1:
                System.out.println("1ro medio");
                break;
            case 2:
                System.out.println("2do medio");
                break;
            case 3:
                System.out.println("3ro medio");
                break;
            case 4:
                System.out.println("4to medio");
                break;
            default:
                System.out.println("Valor no es válido");            
        }
        
    }
}
