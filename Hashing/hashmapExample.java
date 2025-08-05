import java.util.Set;
import java.util.HashMap;
public class hashmapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> hm= new HashMap<>();
         
        // insert
        hm.put("india",100);
        hm.put("china",150);
        hm.put("US " ,50);
        System.out.println(hm);


        //get
    //     int Population = hm.get("india");
    //     System.out.println(Population);
    //     System.out.println(hm.get("indonesia"));

    //     //containsKey 

    // System.out.println(hm.containsKey("india")); // true
    // System.out.println(hm.containsKey("Nepal")); //false


    // remove
    // System.out.println(hm.remove("india"));
    // System.out.println(hm);

    // size
    // System.out.println(hm.size());

    // // Is empty
    // hm.clear();
    // System.out.println(hm.isEmpty());


    //Iterate
    Set<String> keys = hm.keySet();
    System.out.println(keys);
    
    }
}
