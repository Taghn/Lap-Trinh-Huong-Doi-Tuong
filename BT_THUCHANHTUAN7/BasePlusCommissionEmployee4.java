public class BasePlusCommissionEmployee4 extends CommissionEmployee4{
    private double baseSalary;

    public BasePlusCommissionEmployee4(String firstName, String lastName, String socialSecurityNumber,double grossSales, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if(baseSalary< 0.0){
            throw new IllegalArgumentException("Luong cung phai >= 0.0");
        }
        this.baseSalary=baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Luong cung phai >= 0.0");
        }
        this.baseSalary=baseSalary;
    }
    public double getBaseSalary(){
        return baseSalary;
    }

    @Override

    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    @Override

    public String toString(){
        return String.format("%s %s; %s: $%,.2f", 
        "base-salaried",super.toString(),
        "base salary", getBaseSalary());
    }
}
