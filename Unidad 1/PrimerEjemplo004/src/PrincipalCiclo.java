
public class PrincipalCiclo {
    public static void main(String[] args) {
        int numero = 0;
        
        while(numero < 10)
        {
            numero++; // ++numero  // numero += 1 // numero = numero + 1
            System.out.println("While: " + numero);
        }
        
        int y = 0;
        int x = 0;
        
        System.out.println("y++  : " + y++); // 0 
        System.out.println("++x  : " + ++x); // 1
        System.out.println("y _ x: " + y + "_" + x);
        
//        for(;;);
        for(int i = 1; i <= 10; ++i)
        {
            System.out.println("i: " + i);
        }
        
        int z = 0;
        for(;z < 10;)
        {
            System.out.println("z:" + z++);
        }
        
        System.out.println("z out: " + z);
        
        z = 0;
        for(;z < 10;)
        {
            System.out.println("z:" + ++z);
        }
        
        System.out.println("z out: " + z);

    }
}
