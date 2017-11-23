import java.util.Scanner;

public class MathGrade {

    public static void main(String[] args) {
        double quizAvg = 100.0;
        double lowMid = 72.0;
        double highMid1 = 98.0;
        double highMid2 = 99.0;
        double finalExam;
        Scanner scan = new Scanner(System.in);
        System.out.println("Desired Final Grade: ");
        double finalGrade = scan.nextDouble();
        finalExam = finalGrade - (.3 * quizAvg) - (.1 * lowMid) - (.15 * highMid1) - (.15 * highMid2);
        finalExam = finalExam / .3;
        System.out.println("Necessary Final Score: " + finalExam);
    }
}