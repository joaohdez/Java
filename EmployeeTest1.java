public class EmployeeTest1 {
    public static void main(String[] args) {
        Date birth =  new Date(7,24,1949);
        Date hire  =  new Date(3,12,1988);
        Employee1  employee1 = new Employee1("Joao","Macedo",birth,hire);

        System.out.println(employee1);
    }
}
