public class TimeTest1
{
    public static void main(String[] args) {

        //cria  e inicializa um objeto Time2
        Time2 time = new Time2();

        //gera saida das representacoes de string da data/hora
        displayTime("After time object is created", time);
        System.out.println();

        //altera a data/hora e gera saida da data/hora atualizada
        time.setTime(13,27,6);
        displayTime("After calling setTime",time);

        System.out.println();

        //tenta definir data/hora com valores invalidos
        try{
            time.setTime(99,99,99);
        }catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n",e.getMessage());
        }

        // exibe a data/hora após uma tentativa de definir valores inválidos
        displayTime("After calling setTime with invalid values", time);
    }

    public static void displayTime(String header,Time2 t){
        System.out.printf("%s%nUniversal time: %s%nStandard time : %s%n",header,t.toUniversalString(),t.toString());
    }
}
