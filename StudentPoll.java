public class StudentPoll {
    public static void main(String args[]){
        //array de respostas dos alunos (mais tipicamente, inserido em tempo de execução)

        int [] responses = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};

        int [] frequency =  new int [6]; // array de contadores de frequencia

        //para cada resposta, seleciona elemento de respostas e utiliza esse valor
        //como indice de frequencia para determinar elemento a incrementar

        for(int answer = 0; answer < responses.length; answer++)
        {
            try{
                ++frequency[responses[answer]];
            }catch (ArrayIndexOutOfBoundsException e )
            {
                System.out.println(e); //invoca o metodo toString
                System.out.printf("  responses[%d] = %d%n%n",answer,responses[answer]);
            }
        }

    }
}
