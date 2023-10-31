package homework_week_8;

/**
 *  Read the numbers from the console entered by the user and print the minimum
 *  and maximum number the user has entered.
 */

import java.util.Scanner;

public class Programme_2_MinAndMaxInputChallenge {
    public static void main(String[] args) {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.println("Enter number(or 'q' to quit):");
            String input = scanner.nextLine();
            scanner.close();//close scanner

            if (input.equalsIgnoreCase("q")){
                break;
            }
            try{
                double number =Double.parseDouble(input);
                min =Math.min(min , number);
                max=Math.max(max,number);
            }catch (NumberFormatException e){
                System.out.println("Invalid input.Please enter a valid number. ");
            }

        }
        if (min == Double.POSITIVE_INFINITY && max == Double.NEGATIVE_INFINITY){
            System.out.println("No valid numbers entered ");
        }else{
            System.out.println("Minimum number:" + min); //calling a method MAX

            System.out.println("Maximum number:" +max); // calling a method min
        }
    }
}
