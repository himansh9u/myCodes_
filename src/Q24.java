import java.util.Scanner;
import java.util.ArrayList;
public class Q24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        scan.nextLine();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        for(int x =0; x <num1; x++){
            int num2 = scan.nextInt();
            ArrayList<Integer> row = new ArrayList<Integer>();
            for(int y = 0; y <num2; y++) {;
                row.add(scan.nextInt());
            }
            matrix.add(row);
        }
        int num3 = scan.nextInt();
        for(int a = 0; a < num3;a++){
            int i = scan.nextInt();
            int j = scan.nextInt();
            try{
                System.out.println(matrix.get(i-1).get(j-1));
            }
            catch (Exception E){
                System.out.println("ERROR!");
            }
        }
    }
}