import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[6][6];
        for(int i =0; i < 6;i++){
            for(int j = 0; j < 6; j++){
                matrix[i][j]  = scan.nextInt();
            }
        }
        int sum = 0;
        int b = -1000;
        for(int i =0; i < 4;i++) {
            for (int j = 0; j < 4; j++) {
                sum = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2] + matrix[i+1][j+1]
                        + matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];
                int a = sum;
                if(a>b){
                    b=a;
                }
                else{
                    continue;
                }
            }
        }
        System.out.println(b);
    }
}