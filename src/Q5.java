import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0 ;i < t ;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j = 1; j <= n; j++) {
                double c = Math.pow(2, j) - 1;
                double d = b*c;
                double e = d + a;
                int f = (int) e;
                System.out.print(f);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}