import java.security.SecureRandom;

public class RollDiet {
    public static void main(String args[]){
        SecureRandom randomNumbers = new SecureRandom();
        int [] frequency =  new int[7]; //array de contadores de frequência

        //lança o dado 6.000.000 vezes, usa o valor do dado como índice de frequencia

        for(int roll=1; roll <=6000000; roll++)
            ++frequency[1+randomNumbers.nextInt(6)];

        System.out.printf("%s%10s%n","Face","Frequency");

        //gera saida do valor de cada elemento do array
        for(int face=1; face < frequency.length;face++)
            System.out.printf("%4d%10d%n",face,frequency[face]);
    }
}
