import java.util.Scanner;
public class Lab11 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n , a ,b ;
        System.out.print("输入n的值：");
        n = scanner.nextInt();
        scanner.nextLine();
        for (a = 1; a <= n; a++) {
            for (b = 1; b <= n; b++) {
                System.out.print("*");
                }
            System.out.println();    
            }
            scanner.close();
        }  
}
