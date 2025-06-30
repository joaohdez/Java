import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class ClassAverage {

    public static void  main(String args[]){

        Scanner input =new Scanner(System.in);
        int total=0;
        int gradeCounter=0;
        System.out.print("Enter grade or -1 to quit");
        int grade = input.nextInt();

        //fase de processamento
        //solicita entrada e lê a nota do usuário

        //faz um loop até ler o valor sentinela inserido pelo usuário
        while(grade!=-1)
        {
            total=total+grade; //adiciona grade a total
            gradeCounter=gradeCounter+1;//incrementa counter
            System.out.print("Enter grade or -1 to quit: ");
            grade=input.nextInt();
        }

        //fase término
        //se o usuário inseriu pelo menos uma nota
        if(gradeCounter !=0)
        {
          //usa número de ponto decima para calcular média das notas
          double average = (double) total/gradeCounter;

          //exibe total e a média  com dois dígitos de precisão
            System.out.printf("%nTotal of the %d grades entered is %d%n",
                    gradeCounter,total);
            System.out.printf("Class average is %.2f%n",average);
        }else{
            //nenhuma nota foi inserida, assim gera a saída de mensagem apropriada
            System.out.println("No grades where entered");
        }

    }
}
