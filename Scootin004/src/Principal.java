
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
        
        
    }
}
