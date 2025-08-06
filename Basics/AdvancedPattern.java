package Basics;
public class AdvancedPattern {
    public static void main(String[] args) {
        // Advanced Question of Pattern printing using For Loops..
        //1. butterfly pattern
        // *      *
        // **    **
        // ***  ***
        // ********
        // ********
        // ***  ***
        // **    **
        // *      *

        int n = 4 ;
        // Upper part of the butterfly pattern
        for (int i= 1 ; i<=n; i++){
            // first part of the pattern
            for (int j = 1 ; j<=i; j++){
                System.out.print("*");
            }
            //spaces in the middle
            int spaces = 2*(n-i);
            for (int j= 1; j<=spaces; j++){
                System.out.print(" ");
            }
            // second part of the pattern
            for (int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower part of the butterfly pattern
        for (int i= n ; i>=1; i--){
            // first part of the pattern
            for (int j = 1 ; j<=i; j++){
                System.out.print("*");
            }
            //spaces in the middle
            int spaces = 2*(n-i);
            for (int j= 1; j<=spaces; j++){
                System.out.print(" ");
            }
            // second part of the pattern
            for (int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //2. solid rhombus pattern
        //    *****
        //   *****
        //  *****
        // *****
        //*****

        int n= 5;
        // ourtloop
        for (int i = 1; i <= n; i++) {
            //spaces 
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j=1 ; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //3. Number pyramid pattern
        //    1
        //   2 2
        //  3 3 3
        // 4 4 4 4
        //5 5 5 5 5

        int n = 5; 
        // outer loop
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }


        //4. palindrome pattern
        //    1
        //   212
        //  32123
        // 432234
        //543212345

        int n = 5;
        //outer loop 
        for (int i =1 ; i<=n ;i++){
            //spaces 
            for(int j = 1; j<= n-i ; j++){
                System.out.print(" ");
            }
            //1st half numbers
            for (int j = i; j>= 1; j--){
                System.out.print(j);
            }
            //2nd half numbers
            for (int j= 2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //5. diamond pattern
        //   *
        //  ***
        // *****
        //*******
        // *****
        //  ***
        //   *

        int n = 4;
        //upper half
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1 ; j<=n-i ;j++){
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for (int i = n; i >= 1; i--) {
            //spaces
            for (int j = 1 ; j<=n-i ;j++){
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
