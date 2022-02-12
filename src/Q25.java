import java.util.Scanner;
import java.util.HashMap;
public class Q25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, Integer> contact = new HashMap<String, Integer>();
        int num1 = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < num1; i++){
            String name = scan.nextLine();
            int number = scan.nextInt();
            scan.nextLine();
            contact.put(name, number);
        }
        while(scan.hasNext()) {
            String txt1 = scan.nextLine();
            if (contact.containsKey(txt1)){
                System.out.println(txt1+"="+contact.get(txt1));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
