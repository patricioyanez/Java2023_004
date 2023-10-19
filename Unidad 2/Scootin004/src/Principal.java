
public class Principal {
    public static void main(String[] args) {
        Puesto p1 = new Puesto(1, "Gerente");
        Puesto p2 = new Puesto(2, "Ejecutivo");
        
        Empleado e1 = new Empleado("1-9", "Juan", "M", 10, 50, p1);
        Empleado e2 = new Empleado("2-7", "Ana", "F", 5, 30, p2);
        Empleado e3 = new Empleado("3-4", "Leo", "M", 6, 33, p2);
        
        Empresa scootin = new Empresa();
        scootin.agregarEmpleado(e1);
        scootin.agregarEmpleado(e2);
        scootin.agregarEmpleado(e3);
        
        boolean existe = scootin.buscarEmpleado("2-7");
        
        if(existe)
            System.out.println("El rut estás registrado");
        else
            System.out.println("El rut no está registrado");
        
        
        System.out.println("**** Listado de empleados ****");
        scootin.listarEmpleado();
        
        if(scootin.eliminarEmpleado("1-9"))
            System.out.println("Empleado eliminado");
        else
            System.out.println("Empleado no eliminado");
        
        System.out.println("**** Listado de empleados ****");
        scootin.listarEmpleado();
        
        System.out.println("Buscar a empleado rut: 2-7");
        Empleado aux = scootin.buscarEmpleadoPorRut("2-7");
        if(aux != null)
            System.out.println(aux.imprimir());
        else
            System.out.println("Empleado no encontrado");
        
                //Ejercicio 3
        // Crear un menu con la opciones:
        // - Ingresar empleado, buscar si existe, 
        // - Listar todo, 
        // - Listar por puesto (seleccionar que puesto), 
        // - Eliminar por rut y salir.
    }
}
