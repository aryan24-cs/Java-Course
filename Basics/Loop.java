package Basics;
public class Loop {
    public static void main(String[] args) {
        // types of loops 
        // 1. for loop
        // for (initialization; condition; updation){
        //    do something
        // }


        // initialization: kisi variable ko initialize karna.
        // conditiob: kis condition par loop chalega. 
        // updattion : value/variable o update karna.

        for (int count = 0 ; count <101; count++){
            // print the value of count
            System.out.println(count);
        }

        // while loop:
        // initialize hum while loop ke bahar karte hain.
        // while (condition){
        //    do something
        // }
        int count = 0; // initialization
        while (count <101) {
            System.out.println(count);
        }

        // do while loop:
        // do {
        //    do something
        // } while (condition); 
        count = 0; // initialization
        do {
            System.out.println(count);
            count++; // updation
        } while (count < 101);
    }
}
