import java.util.Scanner;

public class LetterGrades  {
    public static void main(String args[]){
        int total=0;//soma das notas
        int gradeCounter=0;
        int aCount=0;
        int bCount=0;
        int cCount=0;
        int dCount=0;
        int fCount=0;

        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n    %s%n   %s%n",
                "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input",
                "On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z the press Enter");

        //faz loop até o usuário inserir o indicador de fim de arquivo
        while(input.hasNext())
        {
            int grade = input.nextInt();
            total+=grade; //adiciona nota a total
            ++gradeCounter;

            //incrementa o contador de letras de nota adequado
            switch (grade/10)
            {
                case 9:
                case 10:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
                    break;

            }



        }
         //exibe o relatório de nota
        System.out.printf("%nGrade Report: %n");
        //se um usuário não inseriu pelo menos uma nota
        if (gradeCounter!=0)
        {
            //calcula a média de todas as notas inseridas
            double average = (double) total/gradeCounter;

            //gera saída de resumo de resultados
            System.out.printf("Total of the %d grades entered is %d%n",gradeCounter,total);
            System.out.printf("Class average is %.2f%n",average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Number of students who received each grade:",
                    "A: ",aCount,
                    "B  ",bCount,
                    "C  ",cCount,
                    "D  ",dCount,
                    "F  ",fCount);
        }
        else
            System.out.printf("No grades were entered");
    }
}
