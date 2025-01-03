public class Project_2_GradeBookTest {
    public static void main(String[] args) {
        int[] gradesArray={87,68,94,100,83,78,85,91,76,87};
        Project_2_GradeBook myGradeBook = new Project_2_GradeBook("Lap trinh huong doi tuong",gradesArray);
        System.out.printf("Bang diem cho mon hoc%n%s%n%n",myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}
