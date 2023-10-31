package homework_week_8;
/**
 * First And Last Digit Sum
 */
public class Programme_7_FirstAndLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if (number <0){
            return -1; //Return -1 for negative numbers(invalid value)
        }
        int lastDigit = number %10;//calculate the last digit
        int firstDigit =0;
        while (number >0){
            firstDigit = number % 10; //updating firstDigit until we reach the first digit
            number /= 10;
        }
        return firstDigit + lastDigit; //Return the sum of the first and last digits
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
}
