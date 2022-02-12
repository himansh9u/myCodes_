import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while(scan.hasNext()) {
            String txt = scan.nextLine();
            System.out.println(i + " " + txt);
            i++;
        }
    }
}
