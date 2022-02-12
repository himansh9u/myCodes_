public class towerofhanoi {
    public static void print(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer disc "+n+ " from "+ src+ " to "+dest);
            return;
        }
        print(n-1, src , dest, helper);
        System.out.println("Transfer disc "+n+ " from "+ src+ " to "+dest);
        print(n-1, helper,src, dest);
    }
    public static void main(String[] args) {
        print(3,"S","H" ,"D");
    }
}
