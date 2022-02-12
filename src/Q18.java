import java.util.Scanner;
import java.util.regex.Pattern;
public class Q18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        scan.nextLine();
        for(int x = 0; x < cases ;x++){
            String txt = scan.nextLine();
            try{
                Pattern pattern = Pattern.compile(txt);
                System.out.println("Valid");
            }
            catch (Exception e){
                System.out.println("Invalid");
            }
        }
    }
}


