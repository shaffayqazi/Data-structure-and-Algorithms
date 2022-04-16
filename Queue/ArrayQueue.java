package Queue;

public class ArrayQueue {

    Object arr[];
    int size;
    int rear = -1;

    ArrayQueue()
    {}
    ArrayQueue(int size)
    {
        arr = new Object[size];

        this.size= size;

    }
    public boolean isEmpty()
    {
        return rear ==-1;
    }

    public void add(Object obj)
    {
        if (rear ==size-1)
        {
            resized(arr);
        }
        size++;
         rear++;
        arr[rear] = obj;
    }

    public Object remove() {
        if (isEmpty())
            return -1;

        Object front = arr[0];

        for(int i = 0; i < rear; i++) {
            arr[i] = arr[i+1];
        }
        rear--;
        return front;
    }

    public Object peek()
    {
        if (isEmpty())
        {
            throw new IllegalStateException("Queue is full");
        }
        return arr[0];
    }

    public int[] resized(Object[] a)
    {
        int  n = a.length;

        int[] aa = new int[2*n];

        System.arraycopy(a, 0, aa, 0, n);
        return aa;
    }


    public static void main(String[] args) {

        ArrayQueue AQ = new ArrayQueue(5);

        AQ.add(1);
        AQ.add(2);
        AQ.add(3);
        AQ.add(4);
        AQ.add(5);
        AQ.add(6);
        AQ.add(7);
        System.out.println(AQ);
    }
}
