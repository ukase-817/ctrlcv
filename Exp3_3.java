import java.util.Arrays;

class Course implements Comparable<Course>{
    String num ; 
    String name ;
    double credit ;
    public Course() {
    }//无参构造器
    public Course(String num , String name , Double credit){
        this.num = num ;
        this.name = name ;
        this.credit = credit ;
    }
    public void setNum(String num) {
        this.num = num;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCredit(Double credit) {
        this.credit = credit;
    }
    public String getNum(){
        return num ; 
    }
    public String getName() {
        return name;
    }
    public Double getCredit() {
        return credit;
    }
    @Override
    public String toString(){
        return "课程编号: " + this.num + " 课程名称: " + this.name + " 课程学分: " + this.credit ;
    } 
    @Override
    public int compareTo(Course c) {
        return Double.compare(this.credit, c.credit);
    }
}
public class Exp3_3 {
    public static void main(String[] args) {
        Course[] courses = new Course[3];
        courses[0] = new Course("KC1001", "高级语言程序设计", 5.0);
        courses[1] = new Course("KC1002", "面向对象程序设计", 4.0);
        courses[2] = new Course("KC1003", "Python程序设计", 2.5);
        Arrays.sort(courses);
        for (Course c : courses) {
            System.out.println(c);
        }
    }
}
