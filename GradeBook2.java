public class GradeBook2 {
    private String courseName; // nome do curso que este livro de nota representa
    private int [][]grades;

    //construtor de dois argumentos inicializa courseName e array de notas
    public GradeBook2(String courseName,int[][]grades){
        this.courseName = courseName;
        this.grades = grades;
    }

    //metodo para configurar o nome do curso
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    //metodo para recuperar o nome do curso
    public String getCourseName(){
        return courseName;
    }

    //realiza varias operações nos dados

    public void processGrades(){
        //gera saída de array de notas

        outputGrades();
        //chama os métodos getMinimum e getMaximum
        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade in the grade book is",getMinimum(),
                "Highest grade in the grade book is",getMaximum());
        //gera saida de grafico de distribuição de notas de todas as notas em todos os testes
        outputBarChart();
    }

    //localiza nota mínima
    public int getMinimum(){
        //supõe que o primeiro elemento do array de notas é o maior
        int lowGrade = grades[0][0];


        //faz um loop pelas linhas do array de notas
        for(int[]studentGrades:grades)
        {
            //faz um loop pelas colunas da linha atual
            for(int grade: studentGrades)
            {
                //se a nota for menor que lowGrade, atribui a nota a lowGrade
                if(grade < lowGrade)
                    lowGrade=grade;
            }
        }

        return lowGrade;
    }

    //localiza a nota máxima

    public int getMaximum(){
        int higthGrade =grades[0][0];

        //faz um loop pelas linhas do array de notas
        for(int []studentGrades: grades){

            //faz um loop pelas colunas da linha atual
            for(int grade: studentGrades) {
                // se nota for maior que higthGrade, atribui esta nota higthGrade
                if(grade > higthGrade)
                    higthGrade=grade;
            }
        }
        return higthGrade;
    }

    //determina a média do conjunto particular de notas
    public double getAverage(int[]setOfGrades){
      int total = 0;
      //soma as notas de um aluno
        for(int grade:setOfGrades)
            total+=grade;
        //retorna a média das notas
        return (double) total / setOfGrades.length;
    }

    //gera saída do gráfico de barras para exibir distribuição total de notas
    public void outputBarChart(){

        System.out.println("Overall grade distribution:");

        //armazena frequencia de notas em cada intervalo de 10 notas

        int[]frequency = new int[11];

        //para cada nota em gradeBook, incrementa a frequencia apropriada
        for(int[] studentGrades: grades){
            for(int grade:studentGrades)
                ++frequency[grade/10];
        }

        // para cada frequencia de nota, imprime barra no gráfico
        for(int count=0;count < frequency.length; count++){
            //gera saída do rotulo de barra("00-09",....,"90-99","100: ")

            if(count==10)
                System.out.printf("%5d: ",100);
            else
                System.out.printf("%02d-%02d: ",count*10, count *10 +9);

            //imprime a barra de asteriscos
            for(int stars=0; stars <frequency[count];stars++)
                System.out.println("*");
            System.out.println();
        }
    }

    public void outputGrades(){
    System.out.printf("The Grades are: %n%n");
    System.out.println("                                    ");//alinha  titulos da coluna

        //cria um titulo de  coluna  para cada um dos testes
        for(int test = 0; test <grades[0].length; test++)
            System.out.printf("Test %d  ",test+1);

        System.out.println("Average");//titulo da coluna de média do aluno

        //cria linhas/colunas que representam notas de um array
        for(int student=0;student < grades.length; student++)
        {
            System.out.printf("Student %2d", student+1);

            for(int test: grades[student])//gera saida de notas de aluno
                System.out.printf("%8d",test);

            //chama metodo getAverage para calcular a media do aluno
            //passa linha de notas com o argumento para getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n",average);

        }
    }


}
