import java.util.Date;
import java.time.LocalDate;

public class Exp3_1 {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today.toString());
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getYear());

    }
    
}
