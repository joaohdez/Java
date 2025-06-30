public class Increment {
    public static void main(String args[]){
        //demonstra o operador de pós-incremento
        int c=5;

        System.out.printf("c Before postincrement: %d%n",c);//imprime 5
        System.out.printf("   postincrementing c: %d%n",c++);//imprime 5
        System.out.printf(" c after posincrement: %d%n",c);//imprime 6


        System.out.println();

        //demonstra o operador de pré-incremento
        c=5;
        System.out.printf(" c before preincrement: %d%n",c);//imprime 5
        System.out.printf(" c  preincrementing: %d%n",++c);//imprime 6
        System.out.printf(" c after preincrement: %d%n",c);//imprime 6
    }
}
