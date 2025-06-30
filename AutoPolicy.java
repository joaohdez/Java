
//classe que representa uma apólice de segura de automóvel
public class AutoPolicy {
    private int accountNumber; //número da conta da apólice
    private String makeAndModel; //carro com o qual a apólice é aplicada
    private String state; //abreviatura do estado com duas letras


    //constructor
    public AutoPolicy(int accountNumber, String makeAndModel,String state){
        this.accountNumber = accountNumber;
        this.makeAndModel  =makeAndModel;
        this.state = state;

    }

    //define o accountNumber
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    //retorna o accountNUmber
    public int getAccountNumber(){
        return accountNumber;
    }

    //configura o makeAndModel
    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    //retorna o makeAndModel
    public String getMakeAndModel(){
        return makeAndModel;
    }

    //define o estado
    public void setState(String state){
        this.state = state;
    }

    //retorna o estado
    public String getState(){
        return state;
    }

    public boolean isNoFaultState(){
        boolean noFaultState;

        switch (getState())
        {
            case "MA" : case "NJ" : case "NY" : case "PA":
                noFaultState  =true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }

}//fim da classe AutoPolicy
