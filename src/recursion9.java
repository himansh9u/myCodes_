public class recursion9 {
    String map[]={".", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void printComb(String str, int idx, String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currIntPlace = str.charAt(idx);

        String button = this.map[currIntPlace-'0'];
        for(int i = 0; i<button.length(); i++){
            printComb(str,idx+1,combination+button.charAt(i));
        }
    }
    public static void main(String[] args) {

        recursion9 obj = new recursion9();
        obj.printComb("23",0,"");
    }
}
