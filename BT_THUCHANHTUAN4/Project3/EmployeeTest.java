public class EmployeeTest {
    public static void main(String[] args) {
        System.out.printf("So luong employee truoc khi thiet lap: %d%n",Employee.getCount());

        date birth1= new date(1,2,2005);
        date hire1 = new date(12, 12, 2005);
        Employee e1=new Employee("Nguyen","Van A",birth1,hire1);
        System.out.println();

        date birth2= new date(3,21,2005);
        date hire2 = new date(5, 25, 2015);
        Employee e2=new Employee("Nguyen","Van B",birth2,hire2);
        System.out.println();
        
        System.out.println(e1);
        System.out.println(e2);

        System.out.printf("So luong employee sau khi thiet lap: %d%n",Employee.getCount());
    }
}
