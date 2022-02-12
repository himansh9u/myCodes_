public class recursion7 {
    public static boolean[] map = new boolean[26];
    public static void removeDublicates(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        if(map[str.charAt(idx)-'a']){
            removeDublicates(str, idx+1,newString);
        }
        else{
            newString += str.charAt(idx);
            map[str.charAt(idx)-'a']=true;
            removeDublicates(str, idx+1,newString);
        }
    }
    public static void main(String[] args) {
        removeDublicates("aabcccdeg",0,"");
    }
}
