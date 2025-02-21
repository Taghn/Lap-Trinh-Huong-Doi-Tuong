public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,double grossSales, double commissionRate, double baseSalary){
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
        return baseSalary + (getCommissionRate()* getGrossSales());
    }

    @Override

    public String toString(){
        return String.format("%s:%s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
        "base_salaried commission employee", getFirstName(), getLastName(),
        "social security number",getSecurityNumber(),
        "gross sales",getGrossSales(),
        "commission rate", getCommissionRate(),
        "base salary", baseSalary);
    }
}
