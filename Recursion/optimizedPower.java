public class optimizedPower {
    public static int optimizedPower(int a,int n){
        if (n==0) {
            return 1;
            
        }
        int halfPowerSqr = optimizedPower(a, n/2) *optimizedPower(a, n/2); // for even

        // for odd
        if (n % 2 !=0) {
            halfPowerSqr = a*halfPowerSqr;
           
            
        }
         return halfPowerSqr;
    }
    public static void main(String[] args) {
        int a=2;
        int n=5;
        System.out.println(optimizedPower(a, n));
    }
}
