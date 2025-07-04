public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    //construtor para inicializar nome, data de nascimento e data de contratação

    public Employee(String firstName,String lastName,Date birthDate,Date hireDate)
    {
      this.firstName = firstName;
      this.lastName  = lastName;
      this.birthDate = birthDate;
      this.hireDate  = hireDate;
    }

    //converte Employee em formato de String
    @Override
    public String toString()
    {
        return String.format("%s, %s Hired: %s Birthday: %s",lastName
        ,firstName,hireDate,birthDate);
    }
}
