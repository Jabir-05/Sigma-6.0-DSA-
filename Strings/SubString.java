public class SubString {
    public static String SubString(String str, int si,int ei){
        String Substr = "";
        for (int i = si; i<ei; i++){
            Substr +=str.charAt(i);
        }
        return Substr;
    }
    public static void main(String[] args) {
        String str ="HelloWorld";
        System.out.println((str.substring(0,5))); // ye java ka ek function jo hmne help krta direct substrings print krwane me.
        // System.out.println(SubString(str, 0, 5));
    }
}
