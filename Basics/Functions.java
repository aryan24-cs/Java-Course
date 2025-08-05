import java.util.Scanner;

public class Functions {
    // Ques 1: Print  given Name in a Function.
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    // Ques 2: Print sum of two numbers in a function.
    public static int CalculateSum(int a, int b){
        int sum = a+b ;
        return sum ;
    }

    // Ques 3: Print product of two numbers in a function.
    public static int CalculateMul(int a, int b){
        int mul = a*b ;
        return mul ;
    }

    // Ques 4: Find the factorial of a number.
    public static void Printfact(int a, int b){
        //loop
        int factorial = 1;
        for(int i=n ; i>= 11 ; i--){
            factorial = factorial*1;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        // Function is a block of code that performs a specific task.
        // It is reusable and can be called multiple times in a program.
        // it is a block of code that take input , perform operaton and produce a output


        // Syntax of function:- 

        // returnType FunctionName (typearg1, typearg2, ...) {
        //     body of function
        //     return value;
        // }

        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        int a = sc.nextInt();
        // int b = sc.nextInt();
        
        // printMyName(name);

        // int sum = CalculateSum(a, b);
        // System.out.println("Sum is: " + sum);

        // int mul = CalculateMul(a, b);
        // System.out.println("Multiplication is: " + mul);

        Printfact(n);


        // what happens in the memory?
        // function in the memory are stored in the form of stack. 

    }
}
