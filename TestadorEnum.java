public class TestadorEnum {
    public static void escolheOpcao(OpcoesMenu opcao){
        if(opcao.equals(OpcoesMenu.SALVAR)){
            System.out.println("Salvando o Arquivo!");

            } else if (opcao.equals(OpcoesMenu.ABRIR)) {
            System.out.println("Abrindo o Arquivo!");
        }
    }

    public static void main(String[] args) {
        escolheOpcao(OpcoesMenu.FECHAR);
    }
}
