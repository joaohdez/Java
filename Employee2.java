public class Employee2 {

    private static int count = 0;// numero de employees criados
    private String firstName;
    private String lastName;

    //inicializa Employee, adiciona 1 a static count
    // e gera saída de String indicando que o constructor foi chamado
     public Employee2(String firstName,String lastName ){
         this.firstName = firstName;
         this.lastName = lastName;

         ++count;
         System.out.printf("Employee constructor : %s %s; count = %d%n",firstName,lastName,count);
     }

     //obtem o primeiro nome
    public String getFirstName(){
         return firstName;
    }

    public String getLastName(){
         return lastName;
    }

    public static int getCount(){
         return count;
    }
}
