import java.util.Scanner;
class Student{
    private String name;
    private int averageScore;
    public Student(String name, int averageScore) {
        this.name = name;
        this.averageScore = averageScore;
    }
    public String getletterGrade(){
        if(averageScore >= 90)
            return "A";
        else if(averageScore >= 80)
        return "B";
     else if(averageScore >= 70)
        return "C";
     else if(averageScore >= 60)
        return "D";
     else 
        return "F";
    
}
    public String getName() {
        return name;
    }
}

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("学生人数: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 1; i <= numStudents; i++) {
            System.out.print("学生姓名: ");
            String name = scanner.nextLine();
            System.out.print("平均成绩: ");
            int averageScore = scanner.nextInt();
            scanner.nextLine(); 
            Student stu = new Student(name, averageScore);
            System.out.println("学生" + stu.getName() + "的等级是: " + stu.getletterGrade());
        }
        scanner.close();  
    }
    
}
