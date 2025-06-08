import java.util.*;;

public class functional {
    public static int printHelloWorld() { // function created
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        return 3;
    }

    public static int calSum(int a, int b) { // parameter or formal parametrs
        int sum = a + b;
        return sum;

    }

    public static void swap(int a, int b) {

        // swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a =" + a);
        System.out.println("b =" + b);

    }

    public static int multipy(int a, int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binCoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int fact_nmr = factorial(n - r);

        int binCoeff = n_fact / (r_fact * fact_nmr);
        return binCoeff;

    }

    // public static boolean isPrime(int n) {
    // boolean isPrime = true;
    // for (int i = 2; i <= n - 1; i++) {
    // if ((n % i == 0)) {
    // isPrime = false;
    // break;
    // }

    // }
    // return isPrime;
    // }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // print all primes in a range
    public static void primesInRange(int n) {
        for(int i =2; i<=n; i++){
            if (isPrime(i)) { // true
                System.out.print(i + " ");

                
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        // printHelloWorld(); // function call

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum =calSum(a,b); // function call/ argumemts or actual parameters
        // System.out.println("sum is " +sum);

        // swap - values exchange
        // int a = 5;
        // int b = 10;
        // swap(a, b);

        // int a = 3;
        // int b = 6;
        // int prod =multipy(a, b);
        // System.out.println(("a * b = " +prod));
        // prod = multipy(30, 40);
        // System.out.println("a *b = " +prod);

        // System.out.println((factorial(7)));

        // System.out.println((binCoeff(5, 4)));

        // System.out.println((isPrime(16)));


        primesInRange(100);

    }
}
