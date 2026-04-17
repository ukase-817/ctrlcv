import java.util.Scanner;
public class Lab12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a , b , c , delta , x1 , x2 ;
        System.out.print("输入a的值：");
        a = scanner.nextDouble(); 
        System.out.print("输入b的值：");
        b = scanner.nextDouble();
        System.out.print("输入c的值：");
        c = scanner.nextDouble();
        delta = b * b - 4 * a * c;
        if (delta > 0){
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0){
            x1 = -b / (2 * a);
            System.out.println("x1 = x2 = " + x1);
        } else {
            System.out.println("没有实根");
        }
        scanner.close();
    }
}
