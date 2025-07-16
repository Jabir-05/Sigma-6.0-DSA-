package BitManipulation;

public class clearbit {
    public static int ClearBit(int n, int i){
        int bitMask =~(1<<i);
        return n & bitMask;
    }
    public static int update(int n, int i,int newBit){
        n = ClearBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(update(10, 2, 1));
    }
}
