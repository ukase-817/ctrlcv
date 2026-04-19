import java.util.Scanner;
class Circle{
    private double r ;
    public Circle() {
    }//无参构造器
    public Circle(double r) {
        this.r = r;
    }//有参构造器
    public void setR(double r){
        this.r = r;
    }
    public double getR() {
        return r;
    }
    public double area() {
        return Math.PI * this.r * this.r;
    }
    public double peri() {
        return 2 * Math.PI * this.r ;
    }
    public void printInfo(){
        System.out.println("圆的半径是: " + this.r);
        System.out.println("圆的面积是：" + area());
        System.out.println("圆的周长是：" + peri());
    }
}
public class Exp3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入圆的半径: ");
        double r = sc.nextDouble();
        //无参构造器创建对象
        Circle cir1 = new Circle();
        cir1.setR(r);
        cir1.printInfo();
        //有参构造器创建对象
        Circle cir2 = new Circle(r);
        cir2.printInfo();
        sc.close();
    }
}
