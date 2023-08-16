public class Palindrome {
    public static void main(String[] args) {
        String str = new String("h");
        System.out.println(palindrome(str));
        
    }
    static boolean palindrome(String str){
        int end = str.length() - 1;
        int start = 0;
        while(start<=end){
            if (str.charAt(end)!= str.charAt(start)){
                return false;
            }
            else{
                start ++;
                end --;
            }
        }
        return true;

    }
}
