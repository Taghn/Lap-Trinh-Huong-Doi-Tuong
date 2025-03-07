public class CommissionEmployee2 extends Object{
    private final String firstName;
    private final String lastName;
    private final String SecurityNumber;
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee2(String firstName, String lastName, String SecurityNumber, double grossSales, double commissionRate){
        if(grossSales<0.0){
            throw new IllegalArgumentException("Doanh so phai >=0.0");
        }
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Ty le hoa hong > 0.0 va < 1.0");
        }
        this.firstName=firstName;
        this.lastName=lastName;
        this.SecurityNumber=SecurityNumber;
        this.grossSales=grossSales;
        this.commissionRate=commissionRate;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSecurityNumber(){
        return SecurityNumber;
    }

    public void setGrossSales(double grossSales){
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Doanh so phai >= 0.0");
        }
        this.grossSales=grossSales;
    }

    public double getGrossSales(){
        return grossSales;
    }

    public void setCommissionRate(double commissionRate){
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Ty le hoa hong > 0.0 va < 1.0");
        }
        this.commissionRate=commissionRate;
    }

    public double getCommissionRate(){
        return commissionRate;
    }
    public double earnings(){
        return commissionRate * grossSales;
    }

    @Override
    public String toString(){
        return String.format("%s:%s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
        "commission employee", firstName, lastName,
        "social security number",SecurityNumber,
        "gross sales",grossSales,
        "commission rate", commissionRate);
    }
}
