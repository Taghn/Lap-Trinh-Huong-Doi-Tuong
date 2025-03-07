public class PolymorphismTest {
    public static void main(String[] args) {
        CommissionEmployee4 commissionEmployee = new CommissionEmployee4("Nguyen","Huu","222-22-2222",10000, .06);
        BasePlusCommissionEmployee4 basePlusCommissionEmployee = new BasePlusCommissionEmployee4("Nguyen", "Huu", "333-33-3333", 5000, .04, 300);
        System.out.printf("%s %s:%n%n%s%n%n",
        "Call CommissionEmployee's toString with superclass reference",
        "to superclass object",commissionEmployee.toString());
        System.out.printf("%s %s:%n%n%s%n%n",
        "Call BasePlusCommissionEmployee's toString with superclass",
        "reference to superclass object",basePlusCommissionEmployee.toString());
        CommissionEmployee4 commissionEmployee2 = basePlusCommissionEmployee;
        System.out.printf("%s %s:%n%n%s%n","Call BasePlusCommissionEmployee's toString with superclass",
        "reference to superclass object",commissionEmployee.toString());
    }
}