package leap;

public class leapyear {
    public static void main(String[] args) {
        int passedTests=0;
        int failedTests=0;
        if(testIsLeap(2024,true)){
            passedTests++;
        }else{
            failedTests++;
        }
        if(testIsLeap(1900,false)){
            passedTests++;
        }else{
            failedTests++;
        }
        if(testIsLeap(2004,true)){
            passedTests++;
        }else{
            failedTests++;
        }
        if(testIsLeap(2021,false)){
            passedTests++;
        }else{
            failedTests++;
        }
    }

    private static boolean testIsLeap(int i, boolean expectedResult) {
        boolean result=isLeap(i);
        if(result==expectedResult){
            System.out.println("Test passed "+expectedResult+" got "+ result);
        }else{
            System.out.println("Test failed "+expectedResult+" got "+result);
        }
    }

    private static boolean isLeap(int i) {
        throw new UnsupportedOperationException("Unimplemented method 'isLeap'");
    }
}
