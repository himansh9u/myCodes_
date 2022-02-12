public class recursion1 {
    public static int print(int x, int n, int result) {
        if(n==0){
            return 1;
        }
        if(x==0){
            System.out.println(result);
            return 1;
        }
        int xpownm1=print(x,n-1,result);
        int xpown=x*xpownm1;
        return xpown;
    }
    public static void main(String[] args) {
        int x = 2;
        System.out.println(print(x,5,x));
    }
}
