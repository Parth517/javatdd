import java.util.ArrayDeque;
import java.util.Deque;

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
        Deque<Character> checkPalindrome=new ArrayDeque<>();
        for(char c: condition.toCharArray()){
            checkPalindrome.addLast(c);
        }
        while(checkPalindrome.size()>1){
            if(checkPalindrome.removeFirst()!=checkPalindrome.removeLast()){
                return false;
            }
        }
        return true;
    }
}