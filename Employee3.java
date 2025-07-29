public class Employee3 {
    private static int count=0; //numero de employees criados
    private String firstName;
    private String lastName;

    //inicializa Employee, adiciona 1 a static count e
    //gera a saida de String indicando que o construtor foi chamado
    public Employee3(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName  = lastName;

        ++count; //incrementa a contagem estática dos empregados
        System.out.printf("Employee constructor: %s %s; count = %d%n",firstName,lastName,count);

    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    // metodo statico para obter valor de contagem de estática
    public static int getCount(){
        return count;
    }

}
