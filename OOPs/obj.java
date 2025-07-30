package OOPs;

public class obj {
    public static void main (String args[]){
     Pen p1 =new Pen(); // Constructor
     p1.setColor("blue");
     System.out.println(p1.color);
    }
}
    class Pen {
        String color;
        int tip ;
        void setColor(String newColor){
            color= newColor;
        }
        void setTip(int newTip){
            tip =newTip;
        }
    }

    


class Student{
    String name;
    int age;
    float percentage ;

    void calPercentage(int phy,itn chem,int math ){
        percentage =(phy+ chem+math ) /3;
    }
}
