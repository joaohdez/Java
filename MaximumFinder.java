import java.util.Scanner;
public class MaximumFinder {
    public static void main(String args[]){

        //cria Scanner para entrada a partir de janela de comando.
        Scanner input = new Scanner(System.in);
        //Solicita e insere 3 valores  de ponto flutuante

        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble();//le o primeiro double
        double number2 = input.nextDouble();//le o segundo double
        double number3 = input.nextDouble();//le o terceiro double


        double result = maximum(number1,number2,number3);

        //exibe o valor máximo
        System.out.println("Maximum is  :"+result);

    }


    public static double maximum(double x, double y, double z)
    {
        double maximumValue = x; //supoe-se que x é o maior valor inicial
        if(y > maximumValue)
            maximumValue=y;
        if (z > maximumValue)
            maximumValue = z;

        return maximumValue;
    }

}
