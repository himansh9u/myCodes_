import java.util.regex.*;
import java.util.Scanner;
public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<n; i++){
            String Username = sc.nextLine();
            Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9_]{7,29}");
            Matcher m = p.matcher(Username);
            if(m.find()&&m.group().equals(Username)){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }
    }
}

