public class Project_3_GradeBook2Test {
    public static void main(String[] args) {
        int[][] gradesArray = { {87,96,70},{68,87,90},{94,100,90},{100,81,82},{83,65,85},{78,87,65},{85,75,83},{91,94,100},{76,72,84},{87,93,73}};
        Project_3_GradeBook2 myBook2Test = new Project_3_GradeBook2("Lap trinh huong doi tuong",gradesArray);
        System.out.printf("Bang diem cho mon hoc%n%s%n%n",myBook2Test.getCourseName());
        myBook2Test.processGrades();
    }
}
