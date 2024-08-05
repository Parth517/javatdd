package digittowords;

public class digit {
    public static void main(String[] args) {
        int passedTests=0;
        int failedTests=0;
        if(testWords(0,"zero")){
            passedTests++;
        }else{
            failedTests++;
        }
        if(testWords(1,"one")){
            passedTests++;
        }else{
            failedTests++;
        }
        if(testWords(15,"fifteen")){
            passedTests++;
        }else{
            failedTests++;
        }
        if(testWords(100,"one hundred")){
            passedTests++;
        }else{
            failedTests++;
        }
        if(testWords(400,"four hundred")){
            passedTests++;
        }else{
            failedTests++;
        }
    }

    private static boolean testWords(int num, String expectedResult) {
        String result=toWords(num);
        if(result==expectedResult){
            System.out.println("Test passed expected "+expectedResult+" got "+result);
            return true;
        }else{
            System.out.println("Test failed expected "+expectedResult+" got "+ result);
            return false;
        }
    }

    
}
