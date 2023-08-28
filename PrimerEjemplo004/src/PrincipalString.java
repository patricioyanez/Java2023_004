
public class PrincipalString {
    public static void main(String[] args) {
        String nombre = "ana";
        nombre = "Juan";
        
        System.out.println("length: " + nombre.length());
        
        if(nombre == "Juan")
            System.out.println("ES igual");
        else
            System.out.println("No es igual");
        
        if(nombre.equals("Juan"))
            System.out.println("ES igual");
        else
            System.out.println("No es igual");
        String texto = "        HOLA mundo       ";
        System.out.println("TRIM:" + texto);
        System.out.println("TRIM:" + texto.trim());
        
        System.out.println("Mayúscula : " + texto.toUpperCase());
        System.out.println("Minúscula : " + texto.toLowerCase());
    }
}
