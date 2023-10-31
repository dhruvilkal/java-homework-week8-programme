package homework_week_8;
/**
 * Palindrome Number
 */

public class Programme_5_PalindromeNumber {
    public static boolean isPalindrome(int number){
        int originalNumber =number;
        int reverse = 0;

        //Handle negative numbers by taking the absolute value
        if (number <0){
            number =Math.abs(number);

        }
        while (number > 0){
            int lastDigit = number % 10;
            reverse = (reverse * 10)+ lastDigit;
            number /=10;
        }
        // Compare the original number with its reverse
        return originalNumber == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
}
