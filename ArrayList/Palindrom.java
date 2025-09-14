public class Palindrom {
    public static void main(String[] args) {
        int num = 124;
        int orig= num;
        int rev =0;

        while (num > 0) {
        int digit  = num % 10;
        rev = rev*10+digit;
        num /= 10;
            
        }
        if (orig == rev) {
            System.out.println(orig + " is Palindrom");
            
        }
        else{
            System.out.println(orig + " Not palindrom ");
        }

    }
}
