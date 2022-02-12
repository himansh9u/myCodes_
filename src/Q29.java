import java.util.*;
import java.util.regex.*;

public class Q29{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            Pattern p = Pattern.compile("<[^</]+>[^>/]+</[^</]+>");
            Matcher m = p.matcher(line);
            int b = 0;
            while (m.find()) {
                b = 1;
                String x = m.group();
                String[] arr1 = x.split(">|<|/");
                if (arr1[1].equals(arr1[arr1.length - 1])) {
                    System.out.println(arr1[2]);
                }
                else {
                    System.out.println(m.group());
                    System.out.println("Nonen");
                }
            }
            if(b == 0){
                System.out.println("None");
            }
            testCases--;
        }
    }
}

