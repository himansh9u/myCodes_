import java.util.Scanner;
public class Q23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        int[] arr = new int[num];
        int sum = 0;
        int count = 0;
        for(int x =0; x <num; x++){
            arr[x] = scan.nextInt();
        }
        for(int y = 0; y<num; y++){
            for(int z = y; z< num; z++){
                sum = sum + arr[z];
                if(sum<0){
                    count++;
                }
            }
            sum =0;
        }
        System.out.println(count);
    }
}