
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Ana");
        nombres.add("Luis");
        
        System.out.println(nombres.get(2));
        System.out.println(nombres.get(1));
        System.out.println(nombres.get(0));
        
        System.out.print("Tamaño de la colección: ");
        System.out.println( nombres.size());
        
        nombres.add("Luffy");
        nombres.add("Zoro");
        
        System.out.print("Tamaño de la colección: ");
        System.out.println( nombres.size());
        
        ArrayList<Integer> numeros;
        numeros = new ArrayList<Integer>();
        
        System.out.println("Cantidad elementos: " + numeros.size());
        numeros.add(50);
        numeros.add(70);
        numeros.add(10);
        System.out.println("Cantidad elementos: " + numeros.size());
        
        // recorrer un arraylist
        System.out.println("\nRecorrer una colección");
        for(String nombre: nombres)
        {
            System.out.println("Nombre: " + nombre);
        }
        
        System.out.println("Métodos adicionales para usar con ArrayList");
        
        int indice = nombres.indexOf("sanji");
        if(indice >= 0)
            System.out.println("Existe");
        else
            System.out.println("No existe");
        
        boolean existe = nombres.contains("Nami");
        if(existe)
            System.out.println("Existe Nami");
        else
            System.out.println("No existe Nami");
        
        boolean fueEliminado = nombres.remove("Ana");
        if(fueEliminado)
            System.out.println("Ana Fue eliminada");
        else
            System.out.println("Ana NO Fue eliminada");
        
        String nombreEliminado = nombres.remove(3);
        System.out.println(nombreEliminado + " fue eliminado");
        
        System.out.println("Limpiar la colección");
        System.out.println("Tamaño: " + nombres.size());
        nombres.clear();
        System.out.println("Tamaño: " + nombres.size());
        
        // Descargar ppt
    }
}
