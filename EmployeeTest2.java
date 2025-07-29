public class EmployeeTest2 {
    public static void main(String[] args) {
            //mostra que a contagem é o 0 antes  de criar Employees
        System.out.printf("Employees before instantiation: %d%n",Employee3.getCount());

        //cria dois Employees; a contagem deve ser 2
        Employee3 e1 = new Employee3("Susan","baker");
        Employee3 e2 = new Employee3("Bob","Blue");

        //mostra que a contagem é 2 depois de criar dois Employees

        System.out.printf("%nEmployees after instantiation: %n");
        System.out.printf("via e1.getCount(): %d%n",e1.getCount());
        System.out.printf("via e2.getCount(): %d%n",e2.getCount());
        System.out.printf("via Employee.getCount(): %d%n",Employee3.getCount());

        //obtem nomes dos Employees
        System.out.printf("%nEmployee 1 : %s %s%nEmployee 2: %s %s%n",e1.getFirstName(),e1.getLastName(),
                e2.getFirstName(),e2.getLastName());
    }
}
