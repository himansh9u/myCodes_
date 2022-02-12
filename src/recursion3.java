public class recursion3 {
    public static void print(int n, String str){
        if(n==0){
            System.out.print(str.charAt(n));
            return;
        }
        System.out.print(str.charAt(n));
        print(n-1,str);
    }
    public static void main(String[] args) {
        String str = "abcd";
        print(str.length()-1,str);
    }
}
