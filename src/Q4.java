import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1 = sc.next();
            int x=sc.nextInt();
            int a = s1.length();
            int b = 15 - a;
            System.out.print(s1);
            for(int j = 0; j < b; j++){
                System.out.print(" ");
            }
            String str = String.format("%03d", x);
            System.out.println(str);
        }
        System.out.println("================================");

    }
}
