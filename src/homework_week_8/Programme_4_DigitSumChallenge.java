package homework_week_8;

import java.util.Scanner;

/**
 *  Digit Sum Challenge
 */
public class Programme_4_DigitSumChallenge {

    public static void sumDigits(int number){
        if (number >=10){
            int sum =0;
            while (number>0){
                sum =sum + (number%10);// to get last digit ans sum with previous last digit
                number = number /10;  // to get remaining number after removing last digit
            }
            System.out.println("Adition of digits is : " + sum);
        }
        System.out.println(-1);
    }
    //main method where input has been taken form user using scanner class object
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please input 3 digit number:");
        int number =scanner.nextInt();
        sumDigits(number);
        scanner.close();//scanner close
    }
}



