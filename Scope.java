public class Scope {
    //campo acessível para todos os métodos da classe
    private static int x = 1;
    //o metodo main cria e inicializa a variavel x
    //e chama os métodos userLocalVariable e useField

    public static void main(String args[])
    {
        int x = 5; //variável local do metodo sombreia o campo x
        System.out.printf("local x in main is %d%n",x);

        useLocalVariable(); //useLocalVariable tem uma variavel local x
        useField(); //useField utiliza o campo x da classe Scope
        useLocalVariable(); //useLocalVariable reinicializa a variavel local x
        useField(); // o campo x da classe Scope retem seu valor

        System.out.printf("%nlocal x in main is %d%n",x);
    }
    //cria e inicializa a variavel local x durante cada chamada
    public static void useLocalVariable()
    {
        int x  = 25; //inicializa toda vez que useLocalVariable é chamado

        System.out.printf("%nlocal x on entering method useLocalVariable is %d%n",x);
        ++x; //modifica a variavel local x deste metodo

        System.out.printf("local x before exiting method useLocalVariable is %d%n",x);
    }

    //modifica o campo x da classe Scope durante cada chamada
    public static void useField()
    {
        System.out.printf("%nfield x on entering method useField is %d%n",x);
        x *=10;

        System.out.printf("field x before exiting method useField is %d%n",x);
    }
}
