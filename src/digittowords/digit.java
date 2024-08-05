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
}
