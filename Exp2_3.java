import java.util.Scanner;
import java.util.Arrays;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class Exp2_3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("输入5个整数：");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        PrintWriter writer = new PrintWriter("myfile.txt");

        for (int num : numbers) {
            System.out.print(num + " ");
            writer.print(num + " ");
        }

        writer.close();
        scanner.close();
    }   
    
}