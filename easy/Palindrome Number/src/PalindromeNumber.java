public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome2(121));
    }
    public static boolean isPalindrome(int x) {
        String numStr = String.valueOf(x);
        int length = numStr.length();
        if (x < 0 ) return false;
        for(int i = 0;i < (length/2);i ++) {
            if(numStr.charAt(i) != numStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome2(int x) {
        String str = String.valueOf(x);
        StringBuffer numStr = new StringBuffer(str);
        return numStr.reverse().toString().equals(str);
    }
}
