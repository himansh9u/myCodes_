import java.math.BigInteger;
import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger num = scan.nextBigInteger();
        if(num.isProbablePrime(1)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}

