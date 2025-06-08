import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        
   
    // creating an array
    // int marks [] = new int [50];
    // int number [] = {1,2,3};
    // String fruits[] = {"apple","mango"};


    // input and output 

    int marks [] = new int [100];

    Scanner sc = new Scanner(System.in);
    marks [0] = sc.nextInt(); // phy
    marks[1]= sc.nextInt();// chem
    marks [2]= sc.nextInt();// maths

    System.out.println("phy :" + marks[0]);
    System.out.println("chem :" + marks[1]);
    System.out.println("maths :" + marks[2]);

    int percentage = (marks[0]+marks[1]+ marks[2])/3;
    System.out.println("Percentage = " +percentage + "%");


    System.out.println("lenght of arry = "+ marks.length);
}
}
