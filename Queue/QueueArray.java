package Queue;
public class QueueArray
{
 Object queue[];
 int size  =0, removed;
 int front = -1;
 int rear= -1;
 int capacity;

 public QueueArray(int capacity)
 {
      queue = new Object[capacity];
     this.capacity = capacity;
 }


 public void display()
 {
     for (int i = removed; i < queue.length; i++) {
         System.out.print(queue[i] + " ");
     }
 }

 public boolean isEmpty()
 {
     return size == 0;
 }

 public Object first()
 {
     if(size==0)
         throw new IllegalStateException("Stack is empty");
     return queue[removed];
 }

 public void add(int data)
 {
     if(rear == capacity-1)
     {
         resized(queue);
     }
     else
     {
         rear++;
         size ++;
         queue[rear] = data;
     }
 }
    public Object[] resized(Object[] a)
    {
        int  n = a.length;

       Object[] aa = new Object[2*n];

        System.arraycopy(a, 0, aa, 0, n);
        return aa;
    }

 public Object remove()
 {
     if(size ==0)
         throw new IllegalStateException("Stack is Empty");

     Object obj = queue[removed];
     queue[removed] = null;
     removed++;
     return obj;
 }

 public Object peek()
 {
      Object data = 0;
      if(!isEmpty())
      {
           data = queue[front+1];
      }
      return data;
 }

 public int size()
 {
      return size-removed;
 }

 public void reverse()
 {
     int start =0;
     int end = size-1;
     while(start < end)
     {
         Object temp = queue[start];
         queue[start] = queue[end];
         queue[end] = temp;
         start++;
         end--;
     }
     for(int i=0; i<size; i++)
     System.out.print(queue[i] + " ");
 }

 public void copyArray()
 {
     Object[] arr2  = new Object[10];
     for(int i =0;i<size;i++)
     {
         arr2[i] = queue[i];
         System.out.print(arr2[i] + " ");
     }
 }

 public Object removeBottomElement()
 {
     if(size==0)
         throw new IllegalStateException();

     Object obj = queue[--size];
     queue[size] = null;
     return obj;
 }

 public LinkedQueue toLinkedQueue()
 {
     LinkedQueue LQ = new LinkedQueue();

     for (int i = removed; i <queue.length ; i++) {

         LQ.add(queue[i]);

     }
     return LQ;
 }

// public void reverse()
// {
//
// }


 public static void main(String[] args) {

     QueueArray Q = new QueueArray(10);
     
     Q.add(1);
     Q.add(2);
     Q.add(3);
     Q.add(4);
     Q.add(5);
     Q.add(6);
     Q.add(7);
     Q.add(8);
     Q.add(9);
     Q.add(10);
     Q.add(11);
     System.out.println( Q.peek());
     System.out.println(Q);
     Q.display();
}

}

