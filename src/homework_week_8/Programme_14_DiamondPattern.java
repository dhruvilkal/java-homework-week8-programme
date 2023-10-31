package homework_week_8;

import java.util.Scanner;

public class  Programme_14_DiamondPattern {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the number of rows (odd number): ");
            int rows = scanner.nextInt();

            if (rows % 2 == 0) {
                System.out.println("Please enter an odd number of rows.");
                return;
            }

            int n = rows / 2 + 1; // Number of rows in the upper half of the diamond

            int i = 1;
            while (i <= n) {
                int spaces = 1;
                while (spaces <= n - i) {
                    System.out.print(" ");
                    spaces++;
                }

                int stars = 1;
                while (stars <= 2 * i - 1) {
                    System.out.print("*");
                    stars++;
                }

                System.out.println();
                i++;
            }

            i = n - 1;
            while (i >= 1) {
                int spaces = 1;
                while (spaces <= n - i) {
                    System.out.print(" ");
                    spaces++;
                }

                int stars = 1;
                while (stars <= 2 * i - 1) {
                    System.out.print("*");
                    stars++;
                }

                System.out.println();
                i--;
            }
        }
    }


