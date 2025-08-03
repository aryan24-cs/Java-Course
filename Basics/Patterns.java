package Basics;
public class Patterns {
    public static void main(String[] args) {
        // Pattern 1: Solid Rectangle
        // *****
        // *****
        // *****
        // *****

        // outer loop
        int n = 4; // number of rows
        int m = 5; // number of columns
        //outer loop
        for (int count = 1 ; count <= n ; count++){
            //inner loop
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Pattern 2: Hollow Rectangle
        // *****
        // *   *
        // *   *
        // *****
        
        //outer loop 
        for (int i=1; i<=4; i++){
            //inner loop
            for (int j=1; j<=5; j++){
                // condition for printing star
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Pattern 3: half pyramid
        // *
        // **
        // ***
        // ****

        //outer loop
        for (int i = 1; i <= 4; i++){
            //inner loop
            for (int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 4: Inverted half pyramid
        // ****
        // ***
        // **
        // *

        // outer loop
        for (int i = 4; i >= 1; i--) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern 5: inverted half pyramid 180Degree rotated
        //    *
        //   **
        //  ***
        // ****

        //outer loop
        int n = 4; // number of rows
        for (int i = 0; i <= n; i++) {

            //inner loop for spaces
            for (int j = 1; j<=n-i ; j++){
                System.out.print(" ");
            }

            //inner loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Pattern 6: half pyramid using numbers
        // 1
        // 12
        // 123
        // 1234
        // 12345

        int n = 5; // number of rows
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }       

        //pattern 7 : inverted half pyramid using numbers
        // 12345
        // 1234
        // 123
        // 12
        // 1

        int n = 5; // number of rows
        //outer loop
        for (int i = 1; i<= n; i++) {
            //inner loop
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Pattern 8: Floyd's Triangle
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        int n = 5; 
        int number = 1 ; 
        //outer loop
        for (int i = 1 ; i <= n ; i++){
            //inner loop
            for (int j = 1 ; j<=i ; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

        // Pattern 9: 0-1 Triangle
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1

        int n = 5; // number of rows
        //outer loop    
        for (int i = 1; i <= n; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                // condition for printing 0 or 1
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
