package tema.pkg2.listas;

/*
 * @author carlo
 */
public class Tema2Listas {

    public static void main(String[] args) {
        // CREAMOS UNA LISTA DE EMPLEADOS 
        List<Employee> employeeList = new List<>();

        // VERIFICASMOS SI LA LISTA ESTÁ VACÍA 
        if (employeeList.isEmpty())
            System.out.println("La Lista está vacía");

        // AGREMAMOS ALGUNOS EMPLEADOS AL EJEMPLO 
        employeeList.insertAtEnd(new Employee("David Gonzalez ", 101, "Manager", 50000));
        employeeList.insertAtEnd(new Employee("Tony Gallardo ", 102, "Developer", 60000));
        employeeList.insertAtEnd(new Employee("Eduardo Lopez ", 103, "Designer", 55000));

        // IMPRIMIMOS LA LISTA DE EMPLEADOS 
        employeeList.print();

        //SE PRUEBAN LAS FUNCIONES CREADAS PARA LA LISTA
        System.out.println("¿Existe un empleado con ID 102? " + employeeList.isExist(new Employee("", 102, "", 0)));
        System.out.println("Posicion del empleado con ID 103: " + employeeList.getPositionByData(new Employee("", 103, "", 0)));
        System.out.println("Datos en la posicion 1: " + employeeList.getDataByPosition(1));
    
        //ELIMINAMOS ALGUNOS EMPLEADOS 
      employeeList.removeFirstPosition();
        System.out.println("\nLista despuEs de eliminar el primer empleado:");
        employeeList.print();
        
           employeeList.removeByData(new Employee("", 102, "", 0));
        System.out.println("\nLista despues de eliminar el empleado con ID 102:");
        employeeList.print();
    
    }
}
