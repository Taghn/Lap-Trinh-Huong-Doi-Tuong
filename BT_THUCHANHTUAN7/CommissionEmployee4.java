public class CommissionEmployee4 extends Employee{
    protected  double grossSales;
    protected  double commissionRate;

    public CommissionEmployee4(String firstName, String lastName, String SecurityNumber, double grossSales, double commissionRate){
        super(firstName,lastName,SecurityNumber); 
        if(grossSales<0.0){
            throw new IllegalArgumentException("Doanh so phai >= 0.0");
        }
        if(commissionRate<= 0.0|| commissionRate >= 1.0){
            throw new IllegalArgumentException("Ty le hoa hong > 0.0 va < 1.0");
        }
        this.grossSales=grossSales;
        this.commissionRate=commissionRate;
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
    @Override
    public double earnings(){
        return getCommissionRate()*getGrossSales();
    }

    @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", 
        "commission employee",super.toString(),
        "gross sales",getGrossSales(),
        "commission rate", getCommissionRate());
    }

}
