import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of inputs: ");
        int num = input.nextInt();
        int x = 1;
        int b = 0;
        while(x <= num){
            System.out.println("Enter a number: ");
            int num2 = input.nextInt();
            b = b + num2;
            x++;
        }
        System.out.println(b);
    }
}
