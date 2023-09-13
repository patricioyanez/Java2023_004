
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
        
    }
}
