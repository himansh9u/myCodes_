import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt1 = scan.nextLine();
        String txt = txt1.trim();
        String[] arrofstr = txt.split("[,.!@?_' ]+");
        if(txt.length()==0){
            System.out.println("0");
        }
        else {
            System.out.println(arrofstr.length);
        }
        for(String w : arrofstr){
            System.out.println(w);
        }
    }
}