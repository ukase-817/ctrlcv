import java.util.Random;
public class Homework12 {
    public static void main(String[] args) {
        final int STUDENTS = 25;
        int A = 0, B = 0,C = 0, D = 0, F = 0;
        Random random = new Random();
        for (int i = 1; i <=STUDENTS; i++) {
            int score = random.nextInt(51) + 50; 
            if (score >= 90) {
                A++;
            } else if (score >= 80) {
                B++;
            } else if (score >= 70) {
                C++;
            } else if (score >= 60) {
                D++;
            } else {
                F++;
            }
        }
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
        System.out.println("F: " + F);
    }

}