
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

    private static boolean testIsPalindrome(String condition, boolean expectedResult) {
        boolean result=isPalindrome(condition);
        if(result==expectedResult){
            System.out.println("Test passed expected "+expectedResult+" got "+result);
        }else{
            System.out.println("Test failed expected "+ expectedResult+ " got"+result);
        }
     }

    private static boolean isPalindrome(String condition) {
        throw new UnsupportedOperationException("Unimplemented method 'isPalindrome'");
    }
}