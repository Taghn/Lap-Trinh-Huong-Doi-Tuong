public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee3 employee = new BasePlusCommissionEmployee3("Nguyen","Huu Thang","125-125-0125",5000, .04,300);
        
        System.out.println("Thong tin nhan vien nhu sau: ");
       System.out.printf("%n%s %s%n", "Ho nhan vien: ",employee.getFirstName());
       System.out.printf("%n%s %s%n", "Ten nhan vien: ",employee.getLastName());
       System.out.printf("%n%s %s%n", "So bi mat nhan vien: ",employee.getSecurityNumber());
       System.out.printf("%s %.2f%n", "Doanh thu theo tuan la: ",employee.getGrossSales());
       System.out.printf("%s %.2f%n", "Ty le hoa hong la: ",employee.getCommissionRate());
       System.out.printf("%s %.2f%n", "Luong cung la: ",employee.getBaseSalary());
       System.out.printf("%s %.2f%n", "Doanh thu la: ",employee.earnings());

       employee.setBaseSalary(100);
       System.out.printf("%n%s:%n%n%s%n","Cap nhat thong tin hien thi qua toString()",employee.toString());
    }
}
