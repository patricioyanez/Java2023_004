import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Pez pez = new Pez();
        Ave ave = new Ave();
        
        System.out.println("Animal  : " + animal.mover());
        System.out.println("Pez     : " + pez.mover());
        System.out.println("Ave     : " + ave.mover());
        
        Animal pececito = new Pez();
        Animal pollo = new Ave();
        
        // Pez pez1 = new Animal(); error. No es subclase
        
        ArrayList<Animal> zoo = new ArrayList<Animal>();
        zoo.add(ave);
        zoo.add(pez);
        zoo.add(pececito);
        zoo.add(pollo);
        zoo.add(new Animal());
        
        System.out.println("\n\n");
        System.out.println("*** Ver mover de animal ***");
        for (Animal animal1 : zoo) {
            System.out.println(animal1.mover());
        }
        
        System.out.println("\n\n");
        System.out.println("*** Cantidad de peces y aves ***");
        int peces = 0;
        for (Animal animal1 : zoo) {
            if(animal1 instanceof Ave)
                System.out.println("Es una ave");
            
            if(animal1.getClass() == Pez.class)
                peces++;
        }
        
        System.out.println("Cantidad de peces: " + peces);
    }
}
