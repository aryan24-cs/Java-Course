import java.util.*;

public class Input_in_java {
    public static void main(String[] args) {
        //Input:

        //this is the Statement we write to take input from the user.
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();
        double price = sc.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(price);


        // Ques: Take 2 variables 'x'& 'y' and print there sum.
        Scanner s =new Scanner(System.in);

        // take the inputs
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x + y;
        
        // take the output
        System.out.println(sum);
    }
}
