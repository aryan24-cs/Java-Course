package Basics;

import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {
        // if, else, switch, break

        // if(condition){
        //     do something
        // }
        // else {
        //     do this 
        // }

        // Ques: take the age as input from user and according to the condition use if and else

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("adult");
        }
        else {
            System.out.println("not adult");
        }

        // Ques: take a number as input from user, and check the number using if else

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }

        // Ques: take 2 nuber as input from user , then if (a = b) then print equal , if (a>b)then a is greater andif (a < )b then print a is lesser than b

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a == b){
            System.out.println("Equal");
        }
        else if (a>b) {
            System.out.println("a is greater");
        }
        else {
            System.out.println("a is lesser");
        }



        // ==>Switch Statement
        // switch (args) {
        //     case value:
                
        //         break;
        
        //     default:
        //         break;
        // }

        // Ques: on button click i want to provide the greeting in differbnt lngguage

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("hello");
                break;
        
            case 2:
                System.out.println("bonjour");
                break;
            
            case 3:
                System.out.println("namaste");
                break;
        
            default:
                System.out.println("invlid number");
                break;
        }

    }
}