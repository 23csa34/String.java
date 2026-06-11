public class Main {
    public static void main(String[] args) {
        int n =5;
        String s = "hiiiii";
        String rev ="";

        for(int i = n-1; i >= 0; i--) {
            rev = rev +s.charAt(i);
        }
            if(s.equals(rev) ){
                System.out.print("palindrome");
            }
            else {
                System.out.print("Not a plaindrome ");
            }
        
    }
}
