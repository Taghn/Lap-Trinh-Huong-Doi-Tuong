public class Employee {
    private String firstName;
    private String lastName;
    private date birthDate;
    private date hireDate;
    private static int count=0;

    public Employee(String firstNam, String lastName, date birthDate, date hirDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        ++count;
    }

    public String toString(){
        return String.format("%s,%s Hire: %s Birthday: %s", lastName,firstName,hireDate,birthDate);
    }
    public static int getCount(){
        return count;
    }
}
