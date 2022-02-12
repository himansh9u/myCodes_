import java.util.Scanner;
public class Q7 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            for (int i = 0; i < t; i++) {
                try {
                    long a = scan.nextLong();
                    System.out.println(a + " can be fitted in:");
                    if (-128 <= a && a <= 127) {
                        System.out.println("* byte");
                    }
                    if (-32768 <= a && a <= 32767) {
                        System.out.println("* short");
                    }
                    if (-2147483648 <= a && a <= 2147483647) {
                        System.out.println("* int");
                        System.out.println("* long");
                    }
                    else {
                        System.out.println("* long");
                    }
                }
                catch (Exception e){
                    System.out.println(scan.next()+ "Can't be fitted anywhere.");
                }
            }
        }
    }
