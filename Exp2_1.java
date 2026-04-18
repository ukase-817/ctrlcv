import java.math.BigInteger;
public class Exp2_1 {
    public static void main(String[] args) {
        final int MAX_PER_CLASS = 40;
        System.out.println(MAX_PER_CLASS);
        float a = 18.888f;
        System.out.println((int)a);
        BigInteger antCount = new BigInteger("12345678901234567890");
        BigInteger multiplier = new BigInteger("123");
        BigInteger result = antCount.multiply(multiplier);
        System.out.println(result);
    } 
}
