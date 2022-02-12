import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String txt1 = scan.nextLine();
            String[] list1 = txt1.split("\\.");
            String ans = "true";
            if (list1.length == 4) {
                for (int i = 0; i < list1.length; i++) {
                    try {
                        int num1 = Integer.parseInt(list1[i]);
                        if (num1 <= 255 && list1[i].length()<=3) {
                            continue;
                        } else {
                            ans = "false";
                            break;
                        }
                    } catch (Exception e) {
                        ans = "false";
                    }
                }
            }
            else {
                ans = "false";
            }
            System.out.println(ans);
        }
    }
}