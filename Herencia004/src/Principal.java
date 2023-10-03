
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
    }

    
}
