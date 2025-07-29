public class TestadoraEnum {

    public static void comparaEnum(OpcoesMenu opcao){
        if(opcao.equals(OpcoesMenu.SALVAR)){
            System.out.println("Foi selecionada uma opção para Salvar");
        } else if (opcao.equals(OpcoesMenu.ABRIR)) {
            System.out.println("Foi Selecionada uma opção para Abrir");
            
        } else if (opcao.equals(OpcoesMenu.FECHAR)) {
            System.out.println("Foi selecionada uma opçã454545o para Fechar");

        }
    }

    public static void main(String[] args) {
       comparaEnum(OpcoesMenu.FECHAR);
    }
}
