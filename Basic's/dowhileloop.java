import java.util.*;

public class dowhileloop {
    public static void main(String[] args) {
        // int counter = 1;
        // do {
        // System.out.println("hello world");
        // counter++;
        // }while(counter <= 10);

        // Q -: keep entering numbers till user enters a multiple of 10

        Scanner sc = new Scanner(System.in);

        // do {
        //     System.out.println("enter your number :");
        //     int n = sc.nextInt();

        //     if (n % 10 == 0) {
        //         break;

        //     }
        //     System.out.println(n);
        // } while (true);


        // Q-: display all numbers entered by user except multiple of 10 ?

        
         do {
            System.out.println("enter your number :");
            int  n = sc.nextInt();

            if ( n % 10 == 0) {
                continue;
                
            }
            System.out.println("number was :" + n);
         }while(true);
    }
}
