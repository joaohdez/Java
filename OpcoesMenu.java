public enum OpcoesMenu {
    SALVAR(1),IMRIMIR(2),ABRIR(3),VISUALIZAR(4),FECHAR(5);

    private final int valor;

    OpcoesMenu(int valorOpcao){
        valor = valorOpcao;
    }

    public int getValor(){
        return valor;
    }

}
