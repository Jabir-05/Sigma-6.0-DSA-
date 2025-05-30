import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        // int counter = 1;
        // while (counter <= 10){
        //     System.out.print(counter);
            
        //     counter++;
           
        // }
        //  System.out.println();
        Scanner sc = new Scanner(System.in);
        // int range =sc.nextInt();
        // int counter = 0;
        // while (counter <= range) {
        //     System.out.println(counter + " ");
        //     counter++;
            
        // }

//        int n = sc.nextInt();
//        int sum = 0;
//        int i = 1;
//        while (i <= n) {
//         sum += i;
//         i++;

        
//        }
// System.out.println(sum);



// int line = 1;
// while (line <= 4) {
//     System.out.println("****"); // squar pattern
//     line++;
    
// }

// Q :- print reverse of number

// int n =74526;
// while (n > 0) {
//     int lastDigit = n % 10;
//     System.out.print(lastDigit + " ");
//     n = n/10; 
// }
// System.out.println();

   

    // Q:- reserve the given number 
    int n = 10899;
    int rev = 0;
    while(n >0){
       int  lastDigit = n % 10;
       rev = (rev*10)+lastDigit;
n = n/10;
    }
    System.out.println(rev);
 }

}
