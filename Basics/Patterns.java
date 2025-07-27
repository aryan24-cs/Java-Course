package Basics;

public class Patterns {
    public static void main(String[] args) {
        // patterns using for loop 
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // new line after each row
        }
        // inverted pattern using for loop
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // new line after each row
        }
        // right-angled triangle pattern using for loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" "); // print spaces
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // print stars
            }
            System.out.println(); // new line after each row
        }
        // diamond pattern using for loop
        int n = 5; // height of the diamond
        // upper part of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); // print spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // print stars
            }
            System.out.println(); // new line after each row
        }
        // lower part of the diamond
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); // print spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // print stars
            }
            System.out.println(); // new line after each row
        }
        // hollow square pattern using for loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("* "); // print stars for borders
                } else {
                    System.out.print("  "); // print spaces for hollow part
                }
            }
            System.out.println(); // new line after each row
        }
        // number pattern using for loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // print numbers
            }
            System.out.println(); // new line after each row
        }
        // reverse number pattern using for loop
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " "); // print numbers
            }
            System.out.println(); // new line after each row
        }
        // pyramid pattern using for loop
        int rows = 5; // number of rows in the pyramid
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" "); // print spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // print stars
            }
            System.out.println(); // new line after each row
        }
        // inverted pyramid pattern using for loop
        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" "); // print spaces
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*"); // print stars
            }
            System.out.println(); // new line after each row
        }
        // butterfly pattern using for loop
        for (int i = 1; i <= 5; i++) {
            // left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces in the middle
            for (int j = 1; j <= 2 * (5 - i); j++) {
                System.out.print("  ");
            }
            // right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // new line after each row
        }
        for (int i = 5; i >= 1; i--) {
            // left wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // spaces in the middle
            for (int j = 1; j <= 2 * (5 - i); j++) {
                System.out.print("  ");
            }
            // right wing
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // new line after each row
        }
        // cross pattern using for loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j || i + j == 6) {
                    System.out.print("* "); // print stars for cross
                } else {
                    System.out.print("  "); // print spaces
                }
            }
            System.out.println(); // new line after each row
        }
    }
}
