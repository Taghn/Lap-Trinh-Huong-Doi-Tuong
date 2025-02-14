public class EmployeeTest {
    public static void main(String[] args) {
        date sinhnhat= new date(1,2,2005);
        date ngaythue = new date(12, 12, 2005);
        Employee employee=new Employee("Nguyen","Van A", sinhnhat, ngaythue);
        System.out.println(employee);
    }
}
