
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
        
        System.out.println("****** substring  *******");
        System.out.println("Fernanda".substring(4));
        System.out.println("Fernanda".substring(1,5));
        
        System.out.println("*** Index of ******");
        System.out.println("abcd efg".indexOf(" "));
        
        System.out.println("*** replace ******");
        System.out.println(texto.replace("HOLA", "Chao"));
        
        
        //Ejercicios:
        // Mostrar el primer nombre de las siguientes personas
        // Juan Carlos
        // Fernanda Maria
        // Ana Maria
        
        String aux = "Fernanda Maria";
        System.out.println(aux.substring(0, aux.indexOf(" ")));
    }
}
