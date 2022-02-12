import java.util.Collections;
import java.util.Scanner;
public class Q13ii {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt1 = scan.nextLine();
        String txt2 = scan.nextLine();
        System.out.println(txt1.length() + txt2.length());
        System.out.println(txt1.compareTo(txt2)>0?"Yes" : "No");
        System.out.print(txt1.substring(0,1).toUpperCase() + txt1.substring(1) +" ");
        System.out.println(txt2.substring(0 ,1).toUpperCase() + txt2.substring(1));
    }
}