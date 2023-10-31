package homework_week_8;
/**
 * Write a program in Java to display the pattern like a triangle with a number.
 */
import java.util.Scanner;

public class Programme_6_NumberTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of raw required:");

        int rowNumber = scanner.nextInt();
        trianglePrint(rowNumber);
        scanner.close();//scanner close
    }
    public static void trianglePrint(int r){
        // use of nested for loop

        for (int  i = 1; i <r; i++){
            for(int j= 1; j<i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
