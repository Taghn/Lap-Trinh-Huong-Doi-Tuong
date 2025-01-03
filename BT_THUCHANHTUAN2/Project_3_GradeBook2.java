public class Project_3_GradeBook2 {
    private String courseName;
    private int[][] grades;

    //khoi tao 
    public Project_3_GradeBook2(String courseName, int[][]grades) {
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
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());

        //bieu dien duoi dang chart
        outputBarChart();
    
    }

    //tim gia tri nho nhat
    //pp: lay gia tri dau tien khoi tao la nho nhat sau do so sanh tu dau den cuoi 
    //phan tu be hon se dc update, neu ko se tiep tuc so sanh

    public int getMinimum(){
        int lowGrade = grades[0][0];
        for(int[] studentGrades: grades){
            for(int grade: studentGrades){
                if(grade<lowGrade){
                    lowGrade=grade;
                }
            }
        }
        return lowGrade;

    }

    public int getMaximum(){
        int highGrade = grades[0][0];
        for(int[] studentGrades: grades){
            for(int grade: studentGrades){
                if(grade>highGrade){
                    highGrade=grade;
                }
            }
        }
        return highGrade;

    }

    //tinh gia tri trung binh
    public double getAverage(int[] setOfGrades){
        //tinh tong 
        int total=0;
        for (int grade: setOfGrades){
            total += grade;
        }

        //tinh va tra ve gia tri trung binh 
        return (double) total / grades.length;
    }

    //hien thi gia tri tung sinh vien 
    public void outputGrades(){
        System.out.printf("The grades are:%n%n");
        System.out.print("     ");
        for(int test = 0; test < grades[0].length; test++){
            System.out.printf("Kiem tra %d ",test + 1);
        }
        //chen them cot trung binh
        System.out.println("Average");
        for(int student = 0; student<grades.length; student++){
            //cot, ten sinh vien
            System.out.printf("Student %2d",student + 1);

            //in diem tuong ung
            for(int test:grades[student]){
                //output student's grades
                System.out.printf("%12d",test);
            }

            //sau do la diem trung binh 
            double average = getAverage(grades[student]);
            System.out.printf("   %9.2f%n",average);
        }
    }

    public void outputBarChart(){
        System.out.println("Pho diem:");

        //tao 11 mang dem 
        int[] frequency = new int[11];

        //tinh toan tan so trong khoang
        for(int[] studentGrades: grades) {
            for(int grade: studentGrades)
            {
                ++frequency[grade / 10];
            }
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
