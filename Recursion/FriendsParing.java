public class FriendsParing {
    public static int FriendsParing(int n){
        if (n == 1|| n ==2) {
            return n;
            
        }
        // // Single
        // int fnm1 = FriendsParing(n-1);
        // // Pair 
        // int fnm2= FriendsParing(n-2);
        // int pairways= (n-1)*fnm2;

        // // total ways 
        // int totalWays = fnm1+pairways;
        // return totalWays;


        // In signle line code 
        return FriendsParing(n-1) + (n-1)*FriendsParing(n-2);
    
    }

    public static void main(String[] args) {
        System.out.println(FriendsParing(4));
    }
}
