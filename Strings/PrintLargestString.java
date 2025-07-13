public class PrintLargestString {
    public static void main(String[] args) {
        String fruit [] =  {"banana","mango","apple"};
        String largest =fruit[0];
        for(int i=0; i<fruit.length;i++){
            if (largest.compareTo (fruit[i])< 0) {
                largest =fruit[i];

            }
        }
    System.out.println(largest);
    }
}


// This printing base on lexicographically
