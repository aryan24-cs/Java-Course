package Basics;
// Loops.java
public class Loops {
    public static void main(String[] args) {
        // for loop syntax
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop iteration: " + i);
        }
        //while loop syntax
        int j = 0;
        while (j < 5) {
            System.out.println("While loop iteration: " + j);
            j++;
        }
        // do-while loop syntax
        int k = 0;
        do {
            System.out.println("Do-while loop iteration: " + k);
            k++;
        } while (k < 5);
        // enhanced for loop syntax
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Enhanced for loop number: " + number);
        }
        // infinite loop example (commented out to avoid running it)
        // while (true) {
        //     System.out.println("This is an infinite loop");
        // }
        // break statement example
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break; // exits the loop when i equals 5
            }
            System.out.println("Loop iteration: " + i);
        }
        // continue statement example
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Skipping even number: " + i);
                continue; // skips the rest of the loop for even numbers
            }
            System.out.println("Odd number: " + i);
        }
    }
}