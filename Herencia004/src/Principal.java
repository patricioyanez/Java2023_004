
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
    }

    
}
