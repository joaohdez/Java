public class Parent {

    public String name;
    public int age;

    public Parent(){} //necessary because we call super() without arguments

    public Parent(String tName,int tAge){
        name = tName;
        age  = tAge;
    }
}

class Child extends Parent{
    public Child(){
        //compiler implicity calls super() here
        name = "Jhon";
        age = 42;
    }
}
