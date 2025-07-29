public class ParentOne {
    private String name;
    private int age;

    public ParentOne(String tName,int tAge){
        name = tName;
        age  = tAge;
    }
}

public Child extends ParentOne{
    public Child(){
        super("Jhon",42);
    }
}
