 import java.util.LinkedList;

public class linkedlist {
    public static class  Node {
    int data;
    Node next;

    public Node (int data){
        this.data = data;
        this.next= null; 
    }
        
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);//create new node
        if (head == null) {
            
            head= tail=newNode;
            return;
        }
        
        newNode.next = head;// linking step
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
            
        }
        
        tail.next = newNode;
        tail= newNode;
    }

    public void print(){
        if (head == null) {
            System.out.println("LL is empty");
            return;
            
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
System.out.println("null");
    }

    // public void add(int idx, int data){
    //     Node newNode = new Node(data);
    //     Node temp = head;
    //     int i =0;
    //     while ( i < idx -1) {
    //         temp = temp.next;
    //         i++;
            
    //     }
    //     // i= idx-1; temp -> prev
    //     newNode = temp.next;
    //     temp.next = newNode;
    // }

    public void add(int idx, int data){
        Node newNode = new Node(data);
        Node fast =head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
    }
    public static void main(String[] args) {
       linkedlist ll = new linkedlist();
       
        ll.addFirst(2);
        ll.addFirst(1); 
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();

    }
}
