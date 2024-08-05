
public class palindrome {
    public static void main(String[] args) {
        int passedTests=0;
        int failedTests=0;
        if(testIsPalindrome("wow",true)){
            passedTests++;
        }else{
            failedTests++;
        }
        if(testIsPalindrome("abccba",true)){
            passedTests++;
        }else{
            failedTests++;
        }
        if(testIsPalindrome("abcdcba",false)){
            passedTests++;
        }else{
            failedTests++;
        }
        
    }

    private static boolean testIsPalindrome(String string, boolean b) {
        throw new UnsupportedOperationException("Unimplemented method 'testIsPalindrome'");
    }
}