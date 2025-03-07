public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Nguyen", "Huu","111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("nguyen","huu","222-22-2222", 16.75,40);
        CommissionEmployee4 commissionEmployee = new CommissionEmployee4("Nguyen", "Duc", "333-33-3333", 10000,.06);
        BasePlusCommissionEmployee4 basePlusCommissionEmployee = new BasePlusCommissionEmployee4("Nguyen", "Toan", "444-44-4444", 5000,.04,300);
        System.out.println("Nhan vien se dc xu ly doc lap: ");
        System.out.printf("%n%s%n%s: $%.2f%n%n",salariedEmployee,"earned",salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",hourlyEmployee,"earned",hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",commissionEmployee,"earned",commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n",basePlusCommissionEmployee,"earned",basePlusCommissionEmployee.earnings());

        Employee[] employees = new Employee[4];
        employees[0]=salariedEmployee;
        employees[1]=hourlyEmployee;
        employees[2]=commissionEmployee;
        employees[3]=basePlusCommissionEmployee;

        System.out.println("--------------------------");
        System.out.println("Nhan vien se duoc xu ly da hinh Polymorphism:");
        for(Employee currentEmployee: employees){
            System.out.println(currentEmployee);
            if(currentEmployee instanceof BasePlusCommissionEmployee4){
                BasePlusCommissionEmployee4 employee = (BasePlusCommissionEmployee4) currentEmployee;
                employee.setBaseSalary(1.10*employee.getBaseSalary());
                System.out.printf("Nhan vien duoc thuong voi 10%% la: $%,.2f%n",employee.getBaseSalary());
            }
            System.out.printf("Thu nhap: $%,.2f%n%n", currentEmployee.earnings());
        }
        for(int j = 0; j<employees.length;j++){
            System.out.printf("Nhan vien %d thuoc dang %s%n",j,employees[j].getClass().getName());
        }

    }
}
