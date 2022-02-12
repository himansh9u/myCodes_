import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        int[] myArray = new int[cases];
        for(int x = 0; x < cases ;x++){
            int num1 = scan.nextInt();
            myArray[x] = num1;
        }
        for(int y = 0; y < myArray.length ;y++){
            System.out.println(myArray[y]);
        }
    }
}

