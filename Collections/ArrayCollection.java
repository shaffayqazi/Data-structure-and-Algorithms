package Collections;

public class ArrayCollection extends AbstractCollection{
    
    private final int LENGTH_I = 16;
    private Object[] arr = new Object[LENGTH_I];
    private int size;

    public int size() {

        return size;
    }
    public boolean add(Object obj) 
    {
        if(size == arr.length) { }

        arr[size++] = obj;
        return true;
    }

    public Iterator iterator()
    {
        return new Iterator() {
            private int i = 0;
            private boolean okToRemove = false;

        public boolean hasNext()
        {
            return i <size;
        }

        public Object next()
        {
            if(i == size )
            throw  new RuntimeException();

            okToRemove = true;
            return arr[i++];
        }

        public void remove()
        {
            if(!okToRemove)
            throw new IllegalStateException();

            arr[--i]  = arr[--size];
            arr[size]  = null;
            okToRemove  = false;
        }
        };
    }

    public static void main(String[] args) {
        
        ArrayCollection arr = new ArrayCollection();
        System.out.println(arr.add(5));
        System.out.println(arr.add(6));
        System.out.println(arr.add(7));
        System.out.println(arr.add(8));
        System.out.println(arr.add(9));
        System.out.println(arr);
        Iterator it = arr.iterator();
        it.next();
        it.remove();
    System.out.println(arr);

    }

 
}
