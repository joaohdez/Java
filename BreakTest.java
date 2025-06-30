public class BreakTest {

    public  static void main(String args[]){
        int count; //variavel de controle também utilizada depois que o loop termina.

        for (count =1; count <=10; count++)
        {
            if(count==5)
                break; // termina o for se a contagem for 5
            System.out.printf("%d",count);
        }
        System.out.printf("%nBroke out of loop at count = %d%n",count);
    }
}
