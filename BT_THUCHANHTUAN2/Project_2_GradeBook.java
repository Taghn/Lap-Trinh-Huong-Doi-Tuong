public class Project_2_GradeBook {
    private String courseName;
    private int[] grades;

    //khoi tao 
    public Project_2_GradeBook(String courseName, int[]grades) {
        this.courseName = courseName;
        this.grades = grades;
    }
    
    //set ten mon hoc
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    //lay thon tin mon hoc
    public String getCourseName(){
        return courseName;
    }

    public void processGrades(){
        outputGrades();
        System.out.printf("%nClass average is %.2f%n", getAverage());
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());

        //bieu dien duoi dang chart
        outputBarChart();
    
    }

    //tim gia tri nho nhat
    //pp: lay gia tri dau tien khoi tao la nho nhat sau do so sanh tu dau den cuoi 
    //phan tu be hon se dc update, neu ko se tiep tuc so sanh

    public int getMinimum(){
        int lowGrade = grades[0];
        for(int grade: grades){
            if(grade<lowGrade){
                lowGrade=grade;
            }
        }
        return lowGrade;

    }

    public int getMaximum(){
        int highGrade = grades[0];
        for(int grade: grades){
            if(grade>highGrade){
                highGrade=grade;
            }
        }
        return highGrade;

    }

    //tinh gia tri trung binh
    public double getAverage(){
        //tinh tong 
        int total=0;
        for (int grade: grades){
            total += grade;
        }

        //tinh va tra ve gia tri trung binh 
        return (double) total / grades.length;
    }

    //hien thi gia tri tung sinh vien 
    public void outputGrades(){
        System.out.printf("The grades are:%n%n");
        for(int student = 0; student < grades.length; student++){
            System.out.printf("Student %2d: %3d%n",student + 1, grades[student]);
        }
    }

    public void outputBarChart(){
        System.out.println("Pho diem:");

        //tao 11 mang dem 
        int[] frequency = new int[11];

        //tinh toan tan so trong khoang
        for(int grade: grades)
        {
            ++frequency[grade / 10];
        }

        //bieu dien chart
        //bieu dien range; luu y range = 100 dac biet chi co 100 thoi 
        for(int count = 0; count < frequency.length; count++){
            if(count==10){
                System.out.printf("%5d:",100);
            }
            else
            {
                //bat dau x0-x9
                System.out.printf("%02d-%02d: ",count * 10, count * 10 + 9);
            
            }

            //trong luc hien range thi chung ta hien tan so luon. 1 tan so la 1*
            for(int stars=0;stars<frequency[count];stars++){
                System.out.print("*");
            }
            //moi range chung ta phai xuong dong
            System.out.println();
        }
    }
}
