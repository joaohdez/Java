public class Foo1 {
    private int field1, field2;
    private String field3;

    public Foo1(int i, int j, String k){
        field1 = i;
        field2 = j;
        field3 = k;

    }

    public static void main(String[] args){
        Foo1 foo1 = new Foo1(0,0,"bar");
        Foo1 foo2 = new Foo1(0,0,"bar");

        System.out.println(foo1.equals(foo2));
    }


}
