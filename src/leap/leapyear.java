package leap;

public class leapyear {
    public static void main(String[] args) {
        int passedTests = 0;
        int failedTests = 0;
        if (testIsLeap(2024, true)) {
            passedTests++;
        } else {
            failedTests++;
        }
        if (testIsLeap(1900, false)) {
            passedTests++;
        } else {
            failedTests++;
        }
        if (testIsLeap(2004, true)) {
            passedTests++;
        } else {
            failedTests++;
        }
        if (testIsLeap(2021, false)) {
            passedTests++;
        } else {
            failedTests++;
        }
        if (testIsLeap(2000, true)) {
            passedTests++;
        } else {
            failedTests++;
        }
        System.out.println("No of tests passed " + passedTests);
        System.out.println("No of tests failed " + failedTests);
    }

    private static boolean testIsLeap(int i, boolean expectedResult) {
        boolean result = isLeap(i);
        if (result == expectedResult) {
            System.out.println("Test passed " + expectedResult + " got " + result);
            return true;
        } else {
            System.out.println("Test failed " + expectedResult + " got " + result);
            return false;
        }
    }

    private static boolean isLeap(int year) {
        boolean ans;
        if (year % 400 == 0) {
            ans = true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            ans = true;
        } else {
            ans = false;
        }
        return ans;
    }

}
