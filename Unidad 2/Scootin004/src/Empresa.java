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
    // Ejercicio 1:
    // crear un metodo que permita devolver a un empleado
    // según el rut recibido
    public Empleado buscarEmpleadoPorRut(String rut)
    {
        for (Empleado empleado : empleados) {
            if(empleado.getRut().equals(rut))
                return empleado;
        }
        return null;
    }
    
    // Ejercicio 2:
    // listar los empleados filtrando por puesto
    
}
