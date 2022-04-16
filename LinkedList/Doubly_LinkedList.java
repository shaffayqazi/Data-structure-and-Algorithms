package LinkedList;

public class Doubly_LinkedList {
    
    private Node head;
    private Node tail;

private static class Node{


int data;
Node next; 
Node prev;
public Node(){}
 
public Node(int data){
   this.data = data;
}

public Node(int data, Node next, Node prev)
{
    this.data = data;
    this.next = next;
    this.prev = prev;
}

}

public void insertFirst(int data){

    Node node = new Node(data);

    node.next = head;
    node.prev = null;
    if (head!=null)
    {
        head.prev = node;
    }
    head = node;
}

public void insertLast(int data){

   Node node = new Node(data);

   Node last = head;

   if(head==null)
   {
       node.prev = null;
       head = node;
       return;
   }
   while(last.next!=null)
   {
     last = last.next;
   }


   node.next = null;
   last.next = node;   
    node.prev =last;

    
}
public static void main(String[] args) {
    
    Doubly_LinkedList DLL = new Doubly_LinkedList();

    
  

    DLL.insertLast(2);
}

}
