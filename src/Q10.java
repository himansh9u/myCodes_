import java.util.Scanner;
public class Q10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Integer x = scan.nextInt();
        if(x < 100 || x > -100) {
            String txt = x.toString();
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
    }
}