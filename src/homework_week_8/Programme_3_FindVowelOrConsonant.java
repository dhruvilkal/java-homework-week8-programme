package homework_week_8;
/**
 * Write a Java program that takes the user to provide a single character from the alphabet.
 * Print Vowel of Consonant, depending on the user input.
 * If the user input is not a letter (between a and z or A and Z),
 * or is a string of length > 1, print an error message.
 */

import java.util.Scanner;

public class Programme_3_FindVowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a single character:");
        String input =scanner.nextLine();
        scanner.close();//close scanner

        //Check if the input is a single character and a letter
        if(input.length() == 1 && Character.isLetter(input.charAt(0))){
            char ch = Character.toLowerCase(input.charAt(0));
            //Check if character is vowel
            if ( ch  == 'a' || ch == 'e'|| ch =='i' || ch =='o'||ch == 'u'){
                System.out.println("Input letter is a Vowel");
            }else{
                System.out.println("Input letter is a Consonant");
            }
        }else {
            System.out.println("Error: Please enter a single letter.");
        }
    }
}
