package LinkedList;
public class LinkedListAllmostEvery{

    private Node head;
    private Node tail;

private static class Node{


int data;
Node next; 

public Node(){}
 
public Node(int data){
   this.data = data;
}

public Node(int data, Node next)
{
    this.data = data;
    this.next = next;
}

}

public void insertFirst(int data) {

    Node node = new Node(data);
 
    node.next = head;

    head = node;

}

public void dup(){

    Node node = head;
     while(node.next!=null)
     {
       if(node.data == node.next.data)
       node.next = node.next.next;
   
       else
       node= node.next;
     } 
     
   tail = node;
   tail.next = null;
   }

    public void middle()
    {

    Node s = head;
    Node f = head;

    while(f!=null && f.next!=null)
    {
     
        f = f.next.next;
        s = s.next;
   }
     
      System.out.println("Middle element is " + s.data);
    }

    // public void deleteMiddle()
    // {

    //    if(head==null)
    //    return;
    //    if(head.next==null)
    //    return;

    //    Node s = head;
    //    Node f = head;
    //    Node prev = null;

    //   while(f!=null && f.next!=null)
    //   {

    //   f = f.next.next;
    //   prev = s;
    //   s = s.next;

    //   }

    //   prev.next = s.next;

    // }

  public int lowest()
  {
      int small = head.data;
      Node p = head;

      while(p!=null)
      {
          if(p.data< small)
          small = p.data;
          p = p.next;
          break;
      }
     return small;

  }

  public int higest()
  {
       int high = head.data;
       Node p =head;

       while(p!=null)
       {

         if(p.data > high)
         high =p.data;

         p=p.next;
        }
        
        System.out.println(high);
        return high;
  }

  public Node reversed()
  {

     Node prev = null;

     while(head!=null)
     {
        Node node = head.next;
        prev = head;
        head = node;
        prev = prev.next;
     }
    
     return prev;

  }

  public void secondEl()
  {
     Node S = head;

     S  = S.next;

     System.out.println(S.data);

  }

    public void Sum()
    {

        int sum=0;

        Node temp = head;

        while(temp!=null)
        {

            sum = sum + temp.data;

            temp = temp.next;
        }
        System.out.println(sum);
    }

    public void SumEvenOdd()
    {

        int sumEven =0;

        int sumOdd = 0;

        Node temp = head;

        while(temp!=null)
        {
         
          if(temp.data %2==0)
          {
              sumEven += temp.data;
              temp = temp.next;
              
          }   
          else
           {
               sumOdd +=temp.data;
               temp = temp.next;
               
           }
        }

        System.out.println("Total sum of even " + sumEven);
        System.out.println("Total sum of Odd " + sumOdd);
    }

   
    // public boolean palidrome()
    // {

    //     Node cur = head;
    //     if(head==null)
    //     return true;

    //     Node mid = middle(head);
    //     Node last = reversed(mid.next);

    //     while(last!=null)
    //     {
    //          if(last.data!=cur.data)
    //          return false;

    //          last = last.next;
    //          cur = cur.next;
    //     }
    //     return true;

    // }
       public void LastAndFirstMulti()
       {
          Node last = head;
          Node start  = head;
           int multi=1;
           int multi2 = 1;
          while(last!=null && last.next!=null)
          { 
            
          last =  last.next;   
          
          }
           
          multi = start.data;
          
          multi2 = last.data;
             
         int M =   multi * multi2;
             
         System.out.println(M);
       }

public void insertLast(int data)
{
    Node p = new Node(data);
    if(head == null){
        head = p;
        return;
    }

    Node q = head;

    while(q.next!=null)
    {
        q = q.next;
    }
    q.next = p;
}


    public void insert(int data, int posi)
    {
         
     int  counter =2;

     Node p = head;
     
     while(p.next!=null)
     {
              if(counter == posi)
      {
                  Node node = new Node(data);
         return;
     }
          p= p.next;

          System.out.println(p.data);
     }

    }
   public int mergeAverage(Node head1 , Node head2)
   {
int count=0;
int sum = 0;
    Node p = head1;
       for (  p = head1; p.next!=null; p=p.next) {}    
        p.next = head2;
        

        while(p!=null)
        {
         
            sum+=head1.data;
            p = p.next;
            count++;
        }
        int avg = sum / count;
    return avg;

   }



public void MiddleM()
{
 
    Node f = head;
    Node s = head;
    
    while(f!=null && f.next!=null)
    {
         
       f = f.next.next;
       s = s.next;

    }
    System.out.println(s.data);

}
     
   public void replace(int data, int posi)
   {
    
    int counter = 0;
    Node p = head;
    while(p.next!=null)
   { 

    if(counter==posi)
    {
         p.data = data;     
    }
    p = p.next; 
    counter++;
   }

   }

   public Node Merge_Node(Node start1, Node start2)
   {
       
       Node i;
        for( i = start1;i.next!=null;i=i.next){}

        i.next =start2;
        return start1;
   }


//    public Node sort(Node head)
//    {
//     if(head == null || head.next==null)
//        return head;

//        Node temp = head;
//        Node fast = head;
//        Node slow = head;

//        while(fast!=null && fast.next!=null )
//        { 
//            temp = slow;
//            fast = fast.next.next;
//            slow = slow.next;
//        }

//        temp.next = null;

//        Node left =  sort(head);
//        Node right = sort(slow);

//        return merge( );

//    }



   public void deleteFirst()
   {
      
       head = head.next;

   }

   public void deleteLast()
   {

    
    while(head.next.next!=null)
    {
         head = head.next;
    }
    head.next = null;

   }

   public void sumaverage()
   {
        
    Node p = head;
     int sum = 0;
     int count = 0; 
    int avg = 0;
 
    while(p!=null)
    {
         sum +=p.data;
         p = p.next;
         count++;
    } 
      avg = sum/count;
     System.out.println("The Average is "+ avg);
     System.out.println("Total sum is "+ sum);   
   }

   public void display() {
       Node temp = head;
       while (temp != null) {
           System.out.print(temp.data + " -> ");
            
         temp = temp.next;

       }
       System.out.println("END");
   }

   public void insertMiddle(int data)
   {
 
        Node f  = head;
        Node s = head;

        while(f!=null && f.next!=null)
        {
            f = f.next.next;
            s = s.next;
        }
        
        s.data = data;

   }

   public void printSecondLast()
   {
       Node f = head;

       while(f.next.next!=null)
       {
         
         f  = f.next;

       }
       System.out.println("Second last element is " +f.data);

   }

   public void printsecond()
   {

    Node p; 
        p = head.next;
        System.out.println("Second element is " + p.data);
   }

   public Node binarySearch(Node head , int search)
   {

     Node start = head;
     Node last = null;
       Node  f  =head;
       Node s = head;


       while(f!=null && f.next!=null)
       { 
          f = f.next.next;
          s = s.next;
         
       }
       
       do{ 
           
           Node mid = s;
    
      if(mid == null)
        return null;
        
       if(mid.data == search)
         return mid;
        
         else if(mid.data > search)
            start =mid.next;
            else
            last = mid;
        }
      while(last == null || last!=start);

      return null;
   }

    public LinkedListAllmostEvery reverse(LinkedListAllmostEvery list){

        Node prev = null;
        Node current = list.head;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list.head = prev;
        return list;
    }

public static void main(String[] args) {
    
   LinkedListAllmostEvery N = new LinkedListAllmostEvery();

N.insertLast(1);
    N.insertLast(2);
    N.insertLast(3);
    N.insertLast(4);
    N.insertLast(5);

N.reverse(N);
    N.display();




}
   
}