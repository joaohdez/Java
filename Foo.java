public class Foo {
    private int field1,field2;
    private String field3;

    public Foo(int field1,int field2,String field3){
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    @Override
    public boolean equals(Object obj){
      if(this == obj){
          return true;
      }

      if(obj==null||getClass()!=obj.getClass()){
          return false;
      }

      Foo f = (Foo) obj;
      return field1 == f.field1 &&
             field2 == f.field2 &&
              (field3 == null ? f.field3 == null : field3.equals(f.field3));

    }

    @Override
    public int hashCode(){
        int hash = 1;
        hash = 31 * hash+field1;
        hash = 31 * hash+field2;
        hash = 31 * hash+(field3==null ? 0 :field3.hashCode());
        return hash;
    }
}
