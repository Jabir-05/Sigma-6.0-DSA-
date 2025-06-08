public class linearsearch {
    public static int  linearSearch (int number[],int key){
        for(int i=0; i<number.length;i++){
            if (number [i] == key ) {
                return i;
            }
        }
        return-1;
    }
    public static void main(String[] args) {
        int number []= {2,3,4,6,7,8,9,55};
        int key = 9;
         int index = linearSearch(number, key);
         if (index == -1) {
            System.out.println("not found");
            
         }else{
         System.out.println("key is at index : " + index);
         }
       
    }
}


// Note :- time  complexcity is O(n)