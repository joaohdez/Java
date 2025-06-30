public class InitArray {
    public static void main(String args[])
    {
        //declara a variavel e o inicializa com um objeto array
        int[] array ={32,27,64,18,95,14,90,70,60,37};

        System.out.printf("%s%8s%n","index","Value");//titulos da coluna

        //gera saída do valor de cada elemento do array
        for (int counter=0; counter < array.length; counter++)
             System.out.printf("%5d%8d%n",counter,array[counter]);
    }
}
