package homework_week_8;
/**
 * . Read10 numbers from the console entered by the user and print the sum of those
**/

import java.util.Scanner;

public class Programme_1_ReadNumberAndSum {

    public static void main(String[] args) {
        //main method where input has been taken from user using scanner class object
        Scanner scanner =new Scanner(System.in);
        int sum =0;
        int count =0;
        while (count<10){
            //checking whether the entered number is integer or not using hasNextInt() method

            System.out.println("Enter number #"+(count+ 1) + ":");
            if (scanner.hasNextInt()){
                int number =scanner.nextInt();
                sum += number;
                count++;

            }else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();//Consume  the newline character
        }
        System.out.println("Sum of the 10 number is :"+sum);
        scanner.close(); //close scanner

    }
}
