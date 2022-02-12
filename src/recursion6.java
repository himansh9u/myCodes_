public class recursion6 {
    public static void moveAllX(String str, int count, int idx, String newString){
        if(idx==str.length()){
            for(int i =0; i<count;i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        if(str.charAt(idx)=='x'){
            moveAllX(str,count+1,idx+1,newString);
        }
        else{
            newString+=str.charAt(idx);
            moveAllX(str,count,idx+1,newString);
        }
    }
    public static void main(String[] args) {
        String str = "abxxcxd";
        moveAllX(str,0,0,"");
    }
}
