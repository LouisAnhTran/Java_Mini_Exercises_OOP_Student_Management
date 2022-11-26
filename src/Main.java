import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student stu1 = new Student();
        stu1.inputStudentInfo(sc);
        stu1.calAverageScore();
        stu1.calLevel();
        stu1.printStudentInformation();

        Student stu2 = new Student();
        stu2.inputStudentInfo(sc);
        stu2.calAverageScore();
        stu2.calLevel();
        stu2.printStudentInformation();

    }
}