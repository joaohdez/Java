public class User {
    private String firstName;
    private String lastName;


    public User(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return firstName + " " +lastName;
    }

    public static void main(String[] args){
        User user = new User("Jhon","Doe");
        System.out.println(user.toString());
    }
}
