import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {

      //cria um novo ArrayList de strings com uma capacidade inicial de 10
        ArrayList<String> itens = new ArrayList<>();

        itens.add("red"); //anexa um item a lista
        itens.add(0,"yelloy");//insere "yellow na posição 0"

        //cabecalho

        System.out.print("Display list contents with counter-controlled loop:");

        //exibe as cores na lista
        for(int i=0;i< itens.size(); i++)
            System.out.printf(" %s",itens.get(i));

        //exibe as cores usando for aprimorada no metodo display

        display(itens,"%nDisplay list contents with enhanced for statement:");

        itens.add("green"); //adiciona "green ao fim da lista"
        itens.add("yellow");//adiciona yelloy ao fim da lista
        display(itens,"List with two new elements:");

        itens.remove("yellow");//remove o primeiro yellow
        display(itens,"Remove first instance of Yellow");

        itens.remove(1); //remove o indice 1
        display(itens,"Remove second list element (green):");

        //verifica se o valor esta na List
        System.out.printf("\"red\" is %sin the list%n",
                 itens.contains("red") ? "": "not ");

        //exibe o numero de elementos na List
        System.out.printf("Size: %s%n",itens.size());
    }

    //exibe elementos do ArrayList no console

    public static void display(ArrayList<String> itens,String header){

        System.out.printf(header);//exibe o cabecalho

        //exibe cada elemento de itens

        for(String item:itens)
            System.out.printf(" %s",item);

        System.out.println();
    }


}//fim da classe ArrayListCollection
