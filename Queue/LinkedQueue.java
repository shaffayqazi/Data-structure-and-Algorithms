package Queue;

public class LinkedQueue implements Queue {
 
    private int size;
    private Node head = new Node(null);

    private static class Node{

      Object obj;
      Node prev = this;
      Node next = this;
      
      Node (Object obj)
      {
         this.obj = obj;

      }
      Node(Object obj, Node next, Node prev)
      {

        this.obj = obj;
         this.next = next;
         this.prev = prev;

      }

    }
    public boolean isEmpty()
    {
        return size == 0;
    }

    public void add(Object obj)
    {
        head.prev = head.prev.next = new Node(obj,head,head.prev);
        ++size;
    }
     
    public Object first()
    {
        return head.next.obj;
    }

    public Object remove()
    {
       Object temp = head.next.obj;
       head.next = head.next.next;
       head.next.prev = head;
       --size;
       return temp;
    }

    public int size()
    {
        return size;
    }

    public void display()
    {
         Node temp = head.next;
         while(temp!=head)
         {
             System.out.print(temp.obj + " ");
             temp = temp.next;
         }
         System.out.println();
    }

    public String toString()
    {
       String str = " ";

       for (Node i = head.next; i !=head; i = i.next) {
           
        str +=i.obj;
       }
       return str;
    }

    public void addFirst(Object obj)
    {
        head.next = new Node(obj,head.next,head);

        size++;
    }

    public void merge(Node head1, Node head2)
    {
        head1.prev.next = head2.next;
        head2.next.prev = head1.prev;
        head2.prev.next = head1;
        head1.prev = head2.prev;
    }

    public void addMID(Object obj)
    {
        int half = size/2;
        int i=0;
        
        for (Node p = head.next; p!=null; p=p.next)
        {
            i++;
            if(i==half)
            {
                p.next = new Node(obj , p.next , p);
                size++;
                break;
            }
        }
    }

    public void getMiddle()
    {
        int half = size/2;
        int count =0;

        for (Node p = head.next; p!=head; p = p.next)
        {
            ++count;
            if(count==half)
            {
                p = p.next;
                System.out.println(p.obj);
                break;
            }
        }
    }

    public boolean contains(Object obj)
    {
        if(head.next.obj.equals(obj))
             return true;

        for(Node p= head.next; p!=null; p= p.next)
        {
            if(p.obj.equals(obj))
                return true;
        }
        return false;
    }

    public Object peeklast()
    {
        if(size==0) {
            throw new IllegalArgumentException("Queue is empty");
        }
       return head.prev.obj;
    }


    public Object peekFirst() {
        if (size == 0) {
            throw new IllegalStateException("Empty Queue");
        }
        return head.next.obj;
    }

   public void reverse()
   {
       Object[] arr = new Object[size];

       int i =0;
       for (Node p = head.next; p!=head; p=p.next)
       {
           arr[i] = p.obj;
           i++;
       }
       Node q = head.next;
       for (int j= arr.length-1; j>=0; j--)
       {
           q.obj = arr[j];
           q = q.next;
       }
   }
   public void addLast(Object obj)
   {
       head.prev = head.prev.next = new Node(obj,head , head.prev);
       size++;
   }

   public LinkedQueue reversed()
   {
LinkedQueue lq = new LinkedQueue();

for(Node p = head.prev; p!=head;p=p.prev)
{
    lq.add(p.obj);

}
return lq;
   }


    public static void main(String[] args) {
        

        LinkedQueue LQ = new LinkedQueue();
        for (int i = 1; i <= 10; i++) {
             
            LQ.add(i);
        }

       LinkedQueue LQ2 = new LinkedQueue();

        for (int i = 1; i <=10 ; i++) {

            LQ2.add(i);
        }

//LQ.merge(LQ.head,LQ2.head);


//LQ.addFirst(3);
        System.out.println(LQ.reversed());
        LQ.display();

    }
}
