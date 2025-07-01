//this utilizando implicita e explicitamente para referência a membros de um objeto

public class ThisTest {
    public static void main(String[] args) {

        SimpleTime time  = new SimpleTime(15,30,19);
        System.out.println(time.buildString());
    }
}//fim da classe ThisTest

class SimpleTime
{
    private int hour; //00-23
    private int minute; //00-59
    private int secound;//00-59

    //se o construtor utilizar nomes de parametros identicos
    // a nomes de variaveis de instancia a referencia this sera
    //exigida para distinguir entre os nomes

    public SimpleTime(int hour,int minute,int secound)
    {
        this.hour = hour; //configura a hora do objeto this
        this.minute = minute; // configura o minuto do objeto this
        this.secound = secound; //configura o segundo do bjeto this

    }
    //utilizam "this" explicito e implicito para chaamr toUniversalString

    public String buildString()
    {
        return String.format("%24s: %s%n24%s: %s",
                "this.toUniversalString()",this.toUniversalString(),
                "toUniversalString()",toUniversalString());
    }
//converte em String no formato de data/hora universal (HH:MM:SS)
    public String toUniversalString()
    {
        //this nao e requerido aqui para aacessar as variaveis de instancia,
        //porque o metodo não tem variaveis locais como os mesmos
        //nomes das das variaveis de instancia

        return String.format("%02d:%02d:%02d",this.hour,this.minute,this.secound);
    }

}
