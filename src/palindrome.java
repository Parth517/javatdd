
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
        if(testIsPalindrome("abcdcba",true)){
            passedTests++;
        }else{
            failedTests++;
        }
        if(testIsPalindrome("abcdecba",false)){
            passedTests++;
        }else{
            failedTests++;
        }
        
        System.out.println("No of tests passed:"+passedTests);
        System.out.println("No of tests failed:"+failedTests);
    }

    private static boolean testIsPalindrome(String condition, boolean expectedResult) {
        boolean result=isPalindrome(condition);
        if(result==expectedResult){
            System.out.println("Test passed expected "+expectedResult+" got "+result);
            return true;
        }else{
            System.out.println("Test failed expected "+ expectedResult+ " got "+result);
            return false;
        }
     }

    private static boolean isPalindrome(String condition) {
        System.out.println(condition.length());
        int length=condition.length();
        for(int i=0;i<length/2;i++){
            if(condition.charAt(i)!=condition.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }
}