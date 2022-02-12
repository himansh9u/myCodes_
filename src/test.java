import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        System.out.println("Enter number : ");
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        String newString = "";
        for(int i = 0; i<num.length(); i++){
            if(Character.getNumericValue(num.charAt(i))==9){
                newString += '0';
            }
            else{
                newString += Character.getNumericValue(num.charAt(i))+1;
            }
        }
        System.out.println(newString);
    }
}