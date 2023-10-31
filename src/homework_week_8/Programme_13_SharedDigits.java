package homework_week_8;

public class Programme_13_SharedDigits {
    public static boolean hasSharedDigit(int num1, int num2){
        if ((num1 < 10 || num1 >99) || (num2 < 10 || num2 > 99 )){
            return  false;
        }
        int firstDigitNum1 = num1 % 10 ;
        int secondDigitNum1 = num1 / 10 ;
        int firstDigitNum2 = num2 % 10 ;
        int seconDigitNum2 = num1 /10 ;
        return (firstDigitNum1 == firstDigitNum2 || firstDigitNum1 == seconDigitNum2
                || secondDigitNum1 == firstDigitNum2 || secondDigitNum1 == seconDigitNum2);

    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,557));
    }

}
