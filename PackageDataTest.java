public class PackageDataTest {
    public static void main(String[] args) {
        PackageData packageData = new PackageData();

        // gera saida da representação String de packageData
        System.out.printf("After Instantiation: %n%s%n",packageData);

        //muda os dados de acesso de pacote no objeto packgeData
        packageData.number = 77;
        packageData.string = "GoodBye";

        //gera saída da representação String de packageData
        System.out.printf("%nAfter changing values: %n%s%n",packageData);
        }
}

class PackageData{
    int number;//variavel de instancia de acesso de pacote
    String string; //variavel de instancia de acesso de pacote

    //constructor
    public PackageData(){
        number = 0;
        string = "Hello";
    }

    @Override
    public String toString(){
        return String.format("number: %d; string: %s",number,string);

    }
}
