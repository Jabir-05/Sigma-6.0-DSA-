public class argument {
    public static void update(int marks[] , int nonChangable){
         nonChangable = 10;
            for (int i =0; i<marks.length; i++){
                marks[i]= marks[i]+1;
            }
        }
    public static void main(String[] args) {
        int marks [] = {98,99,97};
        int nonChangable =5;
        System.out.println(nonChangable);
        update(marks,nonChangable);

    // print our marks 
       for (int i =0; i<marks.length; i++){
        System.out.println(marks[i] + " ");
       }
    }
}
