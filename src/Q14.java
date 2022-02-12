import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Q14 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        String txt1 = scan.next();
        int num1 = scan.nextInt();
        for (int i = 0; i <= txt1.length() - num1; i++) {
            int x = i + num1;
            String s1 = txt1.substring(i, x);
            list.add(s1);
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
    }
}