import java.awt.*;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private float scoreMath;
    private float scorePhysics;
    private float scoreChemistry;
    private float averageScore;
    private String level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(float scoreMath) {
        this.scoreMath = scoreMath;
    }

    public float getScorePhysics() {
        return scorePhysics;
    }

    public void setScorePhysics(float scorePhysics) {
        this.scorePhysics = scorePhysics;
    }

    public float getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(float scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public String getLevel() {
        return level;
    }

    public Student(String name, int age, float scoreMath, float scorePhysics, float scoreChemistry) {
        this.name = name;
        this.age = age;
        this.scoreMath = scoreMath;
        this.scorePhysics = scorePhysics;
        this.scoreChemistry = scoreChemistry;
    }

    public Student(){

    }

    public void inputStudentInfo(Scanner sc) {
        System.out.println("======== Input student information =======");
        System.out.print("Input name: ");
        this.name = sc.nextLine();

        System.out.print("Input age: ");
        this.age = Integer.parseInt(sc.nextLine());

        System.out.print("Input math score: ");
        this.scoreMath = Float.parseFloat(sc.nextLine());

        System.out.print("Input physics score: ");
        this.scorePhysics = Float.parseFloat(sc.nextLine());

        System.out.print("Input chemistry score: ");
        this.scoreChemistry = Float.parseFloat(sc.nextLine());

    }

    public void calAverageScore() {
        this.averageScore = (this.scoreMath + this.scoreChemistry + this.scorePhysics) / 3;
    }

    public void calLevel() {
        if (this.averageScore >= 9) {
            this.level = "Excellent";
        } else if (this.averageScore >= 8) {
            this.level = "Good";
        } else if (this.averageScore >= 7) {
            this.level = "Satisfactory";
        } else if (this.averageScore >= 6) {
            this.level = "Average Performance";
        } else if (this.averageScore >= 5) {
            this.level = "Need more effort";
        } else {
            this.level = "Fail";
        }
    }

    public void printStudentInformation() {
        System.out.print("| Name " + this.name);
        System.out.print(" | Age " + this.age);
        System.out.print(" | Math score " + this.scoreMath);
        System.out.print(" | Physics score " + this.scorePhysics);
        System.out.print(" | Chemistry score " + this.scoreChemistry);
        System.out.print(" | Average Score " + this.averageScore);
        System.out.print(" | Level " + this.level);
        System.out.println();
    }


}





