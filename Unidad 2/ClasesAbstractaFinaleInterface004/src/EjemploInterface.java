
public class EjemploInterface implements IOperaciones {

    @Override
    public int guardar() {
        System.out.println("Datos Guardados....");
        return 1;
    }

    @Override
    public boolean eliminar() {
        System.out.println("Datos Eliminados....");
        return true;    
    }

    @Override
    public int modificar() {

        System.out.println("Datos modificados....");
        return 1;
    }
    
}
