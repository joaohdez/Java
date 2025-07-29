import java.util.ArrayList;
public class ArrayListCollection1   {

    public static void main(String[] args){

        //cria um novo arrayList de strings com uma capacidade inicial de 10
        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add(0,"yellow");

        //cabeçalho
        System.out.print("Display list contents with counter-controlled loop");

        //exibe as cores da lista
        for(int i=0;i < items.size();i++)
            System.out.printf(" %s",items.get(i));

        //exibe as cores usando for aprimorada no conteúdo display
        display(items,"%nDisplay list contents with enhanced for statement:");

        items.add("green");
        items.add("yellow");
        display(items,"Remove first instance of yellow:");

        items.remove(1);
        display(items,"Remove secound list element (green)");

        //verifica se um valor está na List
        System.out.printf("\"red\" is %sin the list%n",items.contains("red") ?"":items.size());


    }

    publis static void display(ArrayList<String> items,String header){
        System.out.printf(header);

        for(String item :items)
            System.out.printf(" %s",item);

        System.out.println();

    }
}
