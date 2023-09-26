import java.util.ArrayList;

public class Empresa {
    // continuar con el ejercicio de la ppt
    // 2.1.1 
    //ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    private ArrayList<Empleado> empleados;
    
    public Empresa()
    {
        empleados = new ArrayList<Empleado>();
    }
    public boolean agregarEmpleado(Empleado empleado)
    {
        // verificar que el rut no este repetido
        return empleados.add(empleado);
    }
    
    public boolean buscarEmpleado(String rut)
    {
        for (Empleado empleado : empleados) {
            if(empleado.getRut().equals(rut))
                return true;
        }
        return false;
    }
    public void listarEmpleado()
    {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.imprimir());
        }
    }
    
    public boolean eliminarEmpleado(String rut)
    {
        for (Empleado empleado : empleados) {
            if(empleado.getRut().equals(rut))
                return empleados.remove(empleado);
        }
        return false;
    }
}
