package homework_week_8;
/**
 * Write a program to input any number and check if it Armstrong number or not
 */
import java.util.Scanner;

public class Programme_10_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.close();//scanner close

        if (isArmstrongNumber(number)) {
            System.out.println(number + "is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numDigits = 0;
        int armstrongSum = 0;
        // count the number of digits in the number
        while (originalNumber != 0) {
            originalNumber /= 10;
            numDigits++;}
            originalNumber = number; // reset to the orignal number

            // Calculate the sum of digits raised to the power of numDigits
            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                armstrongSum += Math.pow(digit, numDigits);
                originalNumber /= 10;

            }
            // Check if the sum is equal to the original number
            return armstrongSum == number;

        }

}
