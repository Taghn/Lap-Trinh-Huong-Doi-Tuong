public class CommissionEmployeeTest {
   public static void main(String[] args) {
       CommissionEmployee employee = new CommissionEmployee("Nguyen", "Huu Thang", "012-012-0125", 100000, .05);
       System.out.println("Thong tin nhan vien nhu sau: ");
       System.out.printf("%n%s %s%n", "Ho nhan vien: ",employee.getFirstName());
       System.out.printf("%n%s %s%n", "Ten nhan vien: ",employee.getLastName());
       System.out.printf("%n%s %s%n", "So bi mat nhan vien: ",employee.getSecurityNumber());
       System.out.printf("%s %.2f%n", "Doanh thu theo tuan la: ",employee.getGrossSales());
       System.out.printf("%s %.2f%n", "Ty le hoa hong la: ",employee.getCommissionRate());
       System.out.printf("%s %.2f%n", "Doanh thu la: ",employee.earnings());

       employee.setGrossSales(5000);
       employee.setCommissionRate(.1);

       System.out.printf("%n%s:%n%n%s%n","Hien thi thong tin bang cach su dung toString()",employee);
   }
}
