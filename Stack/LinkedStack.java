package Stack;

import java.util.NoSuchElementException;

public class LinkedStack implements Stack {

    private Node top;
    private int size;

    private static class Node
    {
        Object obj;
        Node next;

      public   Node(Object obj, Node x)
        {
            this.obj = obj;
            next = x;
        }
    }

    public boolean isEmpty(){return size == 0;}

    public void push(Object obj) {

        ++size;
        top = new Node(obj, top);
    }

    public Object peek(){

        if(size == 0)
        throw new NoSuchElementException();

        return top.obj;

    }

    public Object pop(){

        if(size==0)
          throw new NoSuchElementException();

          Object temp = top.obj;
          top = top.next;
          --size;
          return temp;
    }

    public int size(){return size;}

    public LinkedStack toLinkedStack(){
        var stack = new LinkedStack();
        for(int i=size; i>0; i--)
            stack.push(top.next.obj);
        return stack;
    }

    public String[] toArray(){
        String[] arr = new String[size];
        int index = 0;
        for(Node p = top; p != null; p = p.next){
            arr[index++] = p.obj.toString();
        }
        return arr;
    }

    public LinkedStack reverse(){

        LinkedStack reversed = new LinkedStack();
        for(Node  p = top;p!=null;p=p.next)
        {
                reversed.push(p.obj);


        }
        return reversed;
    }
    public void display()
    {
        Node p = top;
        while(p!=null)
        {
            System.out.println( p.obj+ " ");
            p= p.next;
        }


    }


    public static void main(String[] args) {

   LinkedStack LS = new LinkedStack();

   LS.push("book1");
   LS.push("book2");
   LS.push("book3");
   LS.push("book4");

    System.out.println("Element peeked " + LS.peek());
    System.out.println( "Element poped " +  LS.pop());
    System.out.println("Element peeked " + LS.peek());

        LS.display();

    }
}
