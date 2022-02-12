import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Q13i {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        String txt1 = scan.nextLine();
        String txt2 = scan.nextLine();
        System.out.println(txt1.length() + txt2.length());
        obj.add(txt1);
        obj.add(txt2);
        Collections.sort(obj);
        if(obj.get(0)==txt1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.print(txt1.substring(0,1).toUpperCase() + txt1.substring(1) +" ");
        System.out.println(txt2.substring(0 ,1).toUpperCase() + txt2.substring(1));
    }
}
