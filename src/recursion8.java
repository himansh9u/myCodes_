public class recursion8 {
    public static void sequence(int idx, String str, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        sequence(idx+1,str,newString+currChar);
        sequence(idx+1,str,newString);
    }
    public static void main(String[] args) {
        sequence(0,"abc","");
    }
}
