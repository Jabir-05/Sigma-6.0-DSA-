public class Practice {
    public static int lastOccurence(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
            
        }
        int isfound = lastOccurence(arr,key ,i+1);
        if (isfound == -1 && arr[i]== key) {
            return i;
            
        }
            return isfound;
        }
    
        public static void main(String[] args) {
            int arr [] ={3, 2, 4, 5, 6, 2, 7, 2, 2};
            int key =2;
            System.out.println(lastOccurence(arr, 2, 0));
        
    }
}
