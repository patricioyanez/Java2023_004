
public class Principal {

    public static void main(String[] args) {
        Saludable manzana =  new Saludable();
        
        manzana.setCalorias(100);
        manzana.setCodigo(15000);
        manzana.setEsOrigenNatural(true);
        manzana.setGrasa(0);
        manzana.setNombre("MANZANA");
        manzana.setPrecio(500);
        manzana.setSodio(1);
        
        System.out.println(manzana.imprimir());
        // Ejercicio 2: crear la super clase animal y 2 subclases
        // gato y perro. Definir 3 atributos en común y 1 especifico
        // para cada subclase. Crear 1 perro y 2 gatos, mostrar sus datos.
        
        // Leer las ppt 2.1.1 y 2.2.1
        
        System.out.println("\n\n=== Sobre Escritura ===");
        System.out.println(manzana.tipoComida());
        System.out.println(manzana.toString());
        
        System.out.println("==== Sobre Carga ====");
        String comoCocinar1 = "";
        String comoCocinar2 = "";
        String comoCocinar3 = "";
        
        
        comoCocinar1 = manzana.cocinar();
        comoCocinar2 = manzana.cocinar(21);
        comoCocinar3 = manzana.cocinar(8, "Freir");
        
        System.out.println(comoCocinar1);
        System.out.println(comoCocinar2);
        System.out.println(comoCocinar3);
        
    }

    
}
