package homework_week_8;
/**
 *  Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme_9_FibonacciNumber {
    public static void main(String[] args) {
        int n =8;
        int a = 1, b =1;

        //print the first two numbers
        System.out.println(a);
        System.out.println(b);

        //loop to generate and print the rest of the sequence
        for(int i = 2; i <n; i++){
            int c =a+b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }
}
