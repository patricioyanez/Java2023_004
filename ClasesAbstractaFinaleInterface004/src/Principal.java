
public class Principal {
    public static void main(String[] args) {
        String nombre = "Juan";
        
        Mamifero perro = new Mamifero();
        System.out.println(perro.comer());
        
        // Animal animalito = new Animal(); // error. es clase abstracta
        
        
        EjemploInterface ei = new EjemploInterface();
        
        ei.guardar();
        ei.eliminar();
        
        double totalPago = 1000 * IOperaciones.IVA;
        System.out.println("Total: " + totalPago);
        
    }
}
