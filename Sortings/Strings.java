import java.util.Scanner;

public class Strings {
    public static void printLetter (String str ){
        for(int i =0; i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
    //     char arr [] = {'a', 'b', 'c', 'd', 'e'};
    //     String str = "abcde";
    //     String str2 = new String("xyz");   
    //     // Strings are immutable in Java, meaning once created, they cannot be changed.
    //     // However, we can create a new string based on an existing one.
        
    //     Scanner sc = new Scanner(System.in);
    //     String name;
    //    // name = sc.next(); // it takes only one word like tony;
    //     name=sc.nextLine(); // it takes whole line like tony stark;
    //     System.out.println(name);


        // String fullName = "Jabir Imteyaz";
        // System.out.println(fullName.length());
    

        // Concatenation:- add two things in one 

        String firstName = "Jabir";
        String lastname = "Imteyaz";
      String fullName = firstName + " " + lastname;
    //   System.out.println(fullName.charAt(0));

    printLetter(fullName);

    

    }
}
