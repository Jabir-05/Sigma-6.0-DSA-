public class binarseach {
    public static int  binarySearch(int numbers [],int key){
        int start = 0;
        int end = numbers.length-1;
        while (start <= end) {
            int mind = (start + end ) /2;

            if (numbers [mind] == key) {
                return mind;
                
            }
            if (numbers[mind] < key) {
                start = mind+1;

                
            }else {
                end = mind -1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10,12,14};
        int key = 89;
        System.out.println("index for key is : " + binarySearch(numbers, key));
    }
}

// time complexcity is 0(logn)
