import java.util.Scanner;
public class Q15{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt = scan.nextLine();
        int l = txt.length();
        String answer = "Yes";
        for (int i = 0; i < l / 2; i++) {
            if (txt.charAt(i) == txt.charAt(l - i - 1)) {
                continue;
            }
            else{
                answer="No";
                break;
            }
        }
        System.out.println(answer);
    }
}


