import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Q16 {
    public static void main(String[] args) {
        ArrayList<Character> list1 = new ArrayList<Character>();
        ArrayList<Character> list2 = new ArrayList<Character>();
        Scanner scan = new Scanner(System.in);
        String txt1 = scan.nextLine();
        String txt2 = scan.nextLine();
        txt1 = txt1.toLowerCase();
        txt2 = txt2.toLowerCase();
        for(int i = 0; i < txt1.length();i++) {
            list1.add(txt1.charAt(i));
        }
        for(int j = 0; j < txt2.length();j++) {
            list2.add(txt2.charAt(j));
        }
        Collections.sort(list1);
        Collections.sort(list2);
        if(list1.equals(list2)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}