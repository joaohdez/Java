import java.security.SecureRandom;

public class Craps {
    //cria um gerador seguro de números aleatórios para o uso no método rollDice
    private static final SecureRandom randomNumbers =  new SecureRandom();

    //tipo enum com construtores que representam o estado do jogo
    private enum Status{CONTINUE,WON,LOST};

    //constantes que representam lançamentos comuns de dados
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;


    public static void main(String args[]){
        int myPoint = 0; // pontos se não ganhar ou perder na 1ª rolagem
        Status gameStatus; //pode conter CONTINUE,WON ou LOST

        int sumOfDice = rollDice(); //primeira rolagem dos dados

        //determina o stado do jogo e a pontuação com base no primeiro lançamento
        switch (sumOfDice)
        {
            case SEVEN: //Ganha com 7 no primeiro lançamento
            case YO_LEVEN: //GANHA COM 11 NO PRIMEIRO LANÇAMENTO
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: //perde com 2 no primeiro lançamento
            case TREY:// perde com 3 no primeiro lançamento
                gameStatus = Status.LOST;
                break;
            default: // não ganhou nem perdeu, portanto registra a pontuação
                gameStatus =  Status.CONTINUE; //jogo não terminou
                System.out.printf("Point is %d%n",myPoint);
                break;
        }

        while(gameStatus==Status.CONTINUE)// nem WON nem LOST
        {
            sumOfDice = rollDice(); //lança os dados novamente

            if(sumOfDice ==myPoint)//vitória por pontuação
                gameStatus = Status.WON;
            else
            if(sumOfDice ==SEVEN) //perde obtendo 7 antes de atingir a pontuação
                gameStatus = Status.LOST;

        }
        //Exibe uma mensagem ganhou ou perdeu
        if(gameStatus == Status.WON)
            System.out.println("Player wins");
        else
            System.out.println("Player loses");
    }

    public static  int rollDice(){
        //seleciona valores aleatórios do dado
        int diel1 = 1 + randomNumbers.nextInt(6);//primeiro lançamento do dado
        int diel2 = 1 + randomNumbers.nextInt(6);//segundo lançamento do dado

        int sum = diel1+diel2; //soma os valores dos dados

        //exibe os resultados desse lançamento
        System.out.printf("Player rolled %d + %d = %d%n",diel1,diel2,sum);
        return sum;
    }

}
