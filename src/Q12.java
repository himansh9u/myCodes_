import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Locale;
public class Q12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double num = scan.nextDouble();
        Locale indiaLocale = new Locale("en" ,"IN");
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: " + us.format(num));
        System.out.println("India: " + india.format(num));
        System.out.println("China: " + china.format(num));
        System.out.println("France: " + france.format(num));
    }
}