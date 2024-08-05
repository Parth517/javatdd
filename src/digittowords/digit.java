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
        if(testWords(22,"twenty-two")){
            passedTests++;
        }else{
            failedTests++;
        }
        System.out.println("No of test passed:"+passedTests);
        System.out.println("No of tests failed:"+failedTests);
    }

    private static boolean testWords(int num, String expectedResult) {
        String result=toWords(num);
        if(result.equals(expectedResult)){
            System.out.println("Test passed expected "+expectedResult+" got "+result);
            return true;
        }else{
            System.out.println("Test failed expected "+expectedResult+" got "+ result);
            return false;
        }
    }

    private static String toWords(int num) {
        String ans="";
        String[] units={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] hundreds={"","","twenty","thirty","fourty","fifty","sixty","seventy","eigty","ninety"};
        if(num<20){
            ans=units[(int) num];
        }if(num>20&&num<100){
            ans=hundreds[(int) num/10]+(num%10==0?"":"-"+toWords(num%10));
        }if(num>=100 && num<1000){
            ans=units[(int) num/100]+" hundred"+(num%100==0?"":" "+toWords(num%100));
        }
        return ans;
    }
}
