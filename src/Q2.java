import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you number: ");
        int num = input.nextInt();
        int a = num % 2;
        switch (a){
            case 0:
                if (num >= 6 && num <=20){
                    System.out.println("Weird");
                }
                if (num >= 2 && num <= 5){
                    System.out.println("Not Weird");
                }
                if( num > 20){
                    System.out.println("Not Weird");
                }
                break;
            case 1:
                System.out.println("Weird");
                break;
        }
    }
}
