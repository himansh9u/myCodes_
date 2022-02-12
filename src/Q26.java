import java.util.Scanner;
import java.util.ArrayList;
public class Q26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        int num1 = scan.nextInt();
        for (int x = 0; x < num1; x++) {
            list1.add(scan.nextInt());
        }
        int num2 = scan.nextInt();
        for (int y = 0; y < num2; y++) {
            String txt1 = scan.next();
            if (txt1.equals("Insert")) {
                int num3 = scan.nextInt();
                int num4 = scan.nextInt();
                list1.add(num3, num4);
            } else {
                int num5 = scan.nextInt();
                list1.remove(num5);
            }
        }
        for (int a = 0; a < list1.size(); a++) {
            System.out.print(list1.get(a) + " ");
        }
    }
}