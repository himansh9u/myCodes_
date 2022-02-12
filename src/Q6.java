import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int x = 1;
        while(x <= 10){
            System.out.println(a + " x " + x + " = " + a*x);
            x++;
        }
    }
}