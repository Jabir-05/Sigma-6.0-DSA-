public class FindSubsets {
    public static void FindSubsets(String str, String ans,int i){
        // base case 
        if (i == str.length()) {
            if(ans.length() == 0){
               System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;
            
        }
        //recursion
        //yes choice
        FindSubsets(str, ans+str.charAt(i), i+1);

        // No choice
        FindSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str ="abc";
        FindSubsets(str,"", 0);
    }
}
