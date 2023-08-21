
public class Principal {
    public static void main(String args[])
    {// zoom it
        System.out.println("Hola Mundo!!!");
        
        // crea objeto de la clase Pizza
        // instacia de la clase
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza("Napolitana", 
                                    "Mediana", 
                                    "Gruesa", 
                                    8000);
        
        System.out.println("Tamaño Pizza1: " + pizza1.getTamano());
        System.out.println("Tamaño Pizza2: " + pizza2.getTamano());
        
        pizza1.setTamano("Familiar");
        System.out.println("Tamaño Pizza1: " + pizza1.getTamano());
        
        System.out.println("\n****** Pizza 2 ******");
        System.out.println("Nombre      : " + pizza2.getNombre());
        System.out.println("Tamaño      : " + pizza2.getTamano());
        System.out.println("Masa        : " + pizza2.getMasa());
        System.out.println("Precio      : " + pizza2.getPrecio());
        
        
        
    }
}
