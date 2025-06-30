import java.security.SecureRandom;
public class RandomIntegers {
    public static void main(String args[])
    {
        //o objeto randomNumbers produzirá números aleatórios seguros
        SecureRandom randomNUmbers =  new SecureRandom();
        //faz loop 20 vezes

        for(int counter = 1; counter <=20; counter++)
        {
            //seleciona o inteiro aleatório entre 1 e 6
            int face = 1 + randomNUmbers.nextInt(6);
            System.out.printf("%d ",face);

            //se o contador for divisível por 5, indica uma nova linha de saída
           if(counter%5 ==0)
                System.out.println();
        }
    }

}
