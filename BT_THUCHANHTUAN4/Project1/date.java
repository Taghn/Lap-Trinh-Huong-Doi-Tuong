public class date{
    private int month; 
    private int day;
    private int year;

    private static final int[] daysPerMonth={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public date(int month, int day, int year){
        if(month<=0 || month>12)
        {
            throw new IllegalArgumentException("Thang("+ month +") Phai la 1-12");
        }
        if(day<=0||(day > daysPerMonth[month] && !(month==2 && day==29)))
        {
            throw new IllegalArgumentException("Ngay("+ day +") Nam ngoai gioi han cho phep thang va nam");
        }
        if(month==2 && day==29 && !(year%400==0||(year%4==0 && year%100!=0)))
        {
            throw new IllegalArgumentException("Day("+ day +") Nam ngoai gioi han cho phep thang va nam");
        }
        this.month=month;
        this.day=day;
        this.year=year;
        System.out.printf("Thiet lap ban dau cho ngay la: %s%n",this);
    }
    public String toString(){
        return String.format("%d/%d/%d",month,day,year);
    }
}