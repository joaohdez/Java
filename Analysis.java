import java.util.Scanner;

public class Analysis {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        //inicializando as variáveis nas declarações
        int passes=0;
        int failures=0;
        int studentCounter = 1;

        //processa 10 alunos utilizando o loop controlado por contador
        while(studentCounter <=10){
            //solicita o usuário uma entrada e obtém valor fornecido pelo usuário
            System.out.print("Enter result (1=pass, 2=fail)");
            int result = input.nextInt();

            //if else está aninhado na intrução while
            if(result==1)
                passes=passes+1;
            else
                failures = failures+1;

            //incrementa studentCounter até o loop terminar
            studentCounter=studentCounter+1;
        }

        //fase de término, prepara e exibe os resultados
        System.out.printf("Passed: %d%nFailed: %d%n",passes,failures);

        //determina se mais de 8 alunos foram aprovados
        if(passes >8 )
            System.out.println("Bonus to instructor!");


    }
}
