import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();


    // Add Element O(1)
        list.add(1);  // Time Complex : O(1)
        list.add((2));
        list.add(3);
        list.add((4));

        list.add(1,9); // O(n)
        System.out.println(list);
        System.out.println(list.size()); // size of arraylist

        for(int i= 0; i<list.size();i++){
            System.out.println(list.get(i));
        }

        // Get Element O(1)
        int element =list.get(2);
        System.out.println(element);

        //remove Element  O(n)
        list.remove(2);
        System.out.println(list);

        //set  O(n)
        list.set(2, 10);
        System.out.println(list);

        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

    }
}
