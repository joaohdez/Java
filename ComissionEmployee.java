
public class ComissionEmployee extends Object {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    //construtor

    public ComissionEmployee(String firstName,String lastName,String socialSecurityNumber,double grossSales,double commissionRate){
        //se grossSales é inválido, lança uma exceção
        if(grossSales <0.0)
            throw new IllegalArgumentException("Gross Sales must be >=0.0");

        //se comissionRate é inválid, lança uma exceção
        if(commissionRate <=0.0 || commissionRate >=1.0)
            throw new IllegalArgumentException("Commission rate must be > 0.0 and <1.0");

        this.firstName = firstName;
        this.lastName  = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0)
            throw new IllegalArgumentException("Gross sales must be >=0.0");
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0.0 || commissionRate >=1.0)
            throw new IllegalArgumentException("Commission rate must be >0.0 and < 1.0");

        this.commissionRate = commissionRate;
    }

    //calcula os lucros
    public double earnings(){
        return commissionRate * grossSales;
    }
    //retorna a representação String do objeto CommissionEmployee
    @Override //indica que este metodo substitui um metodo da superclasse
    public String toString()
    {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee",firstName,lastName,
                "social security number",socialSecurityNumber,
                "gross sale",grossSales,
                "commission rate",commissionRate);
    }

}
