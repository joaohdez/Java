public class Employee1 {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    //constructor para inicializar nome, data de nascimento e data de contratação
    public Employee1(String firstName,String lastName, Date birthDate,Date hireDate){
        this.firstName = firstName;
        this.lastName  = lastName;
        this.birthDate = birthDate;
        this.hireDate  = hireDate;

    }

    //converte Employee em formato de String
    public String toString()
    {
        return String.format("%s,%s Hired: %s BirthDay: %s",lastName,firstName,hireDate,birthDate);
    }

}
