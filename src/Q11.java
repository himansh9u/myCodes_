import java.time.LocalDate;
import java.util.Scanner;

public class Q11{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int month = scan.nextInt();
        int day = scan.nextInt();
        int year = scan.nextInt();
        LocalDate d = LocalDate.of(year ,month ,day);
        System.out.println(d.getDayOfWeek());
    }
}