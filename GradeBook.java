public class GradeBook {

    private String courseName;//nome do curso que essa GradeBook representa
    private int[]grades;//array de notas de aluno

    //construtor

    public GradeBook(String courseName,int[]grades)
    {
        this.courseName = courseName;
        this.grades = grades;
    }

    //metodo para configurar o nome do curso
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    //metodo para recuperar o nome nome do curso
    public String getCourseName(){
        return courseName;
    }

    //realiza varias operacoes nos dados
    public void processGrades(){
        //chama metodo getAverage para calcular a nota media
        System.out.printf("%nClass average is %.2f%n",getAverage());

        //chama os metodos getMinimum e getMaximum
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",
                getMinimum(),getMaximum());

        //chama outputBarChat para imprimir grafico de distribuicao de nota
        outputBarChat();
    }

    public int getMinimum()
    {
        int lowGrade = grades[0]; //supoe que grade[0] e menor nota

        for(int grade:grades)
        {
            //se nota for mais baixa que lowGrade, atribui essa nota a lowgrade
            if(grade < lowGrade)
                lowGrade = grade; //nova nota mais baixa
        }
        return lowGrade;
    }

    //localiza nota maxima

    public int getMaximum(){
        int highGrade = grades[0]; //supoe que a nota maior é grade[0]
        for(int grade: grades)
        {
            if(grade > highGrade)
                highGrade=grade; //nota mais alta
        }
        return highGrade;
    }

    //determina media para o teste
    public double getAverage(){
        int total=0;
        //soma as notas de um aluno
        for(int grade:grades)
            total+=grade;

        return (double) total/grades.length;
    }

    //gera saida do grafico de barras exibindo distribuição de notas
    public void outputBarChat(){
        System.out.println("Grade distribution:");

        //armazena frequencia de notas em cada intervalo de 10 notas
        int[] frequency = new int[11];

        //para cada nota, incrementa a frequencia apropriada
        for(int grade: grades)
            ++frequency[grade / 10];

        for(int count=0; count < frequency.length; count++)
        {
            //gera saída do rótulo de barra("00-09: ",...,"90-99: ","100: ")
            if(count==10)
                System.out.printf("%5d: ",100);
            else
                System.out.printf("%02d-%02d: ",count * 10, count * 10 + 9);
            //imprime a barra de asteriscos
            for(int stars=0; stars <frequency[count]; stars++)
                System.out.print("*");
            System.out.println();

        }

    }

    public void outputGrades()
    {
        System.out.printf("Then Grandes are: %n%n");

        //gera saída da nota de cada aluno
        for(int student=0; student < grades.length;student++)
            System.out.printf("Student %2d: %3d%n",student+1,grades[student]);

    }



}
