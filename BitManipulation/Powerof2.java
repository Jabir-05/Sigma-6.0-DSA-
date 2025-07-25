package BitManipulation;

public class Powerof2 {
    public static boolean IspowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(IspowerOfTwo(7));
        
    }
}