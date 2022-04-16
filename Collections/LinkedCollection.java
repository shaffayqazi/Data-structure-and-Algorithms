package Collections;

public class LinkedCollection extends AbstractCollection {

    private static class Node
    {
        Object obj;
        Node prev, next;

        Node(){prev = next = this;}

        Node(Object obj, Node prev, Node next)
        {
          this.obj = obj;
            this.prev = prev;
            this.next=next;
        }
    }
    private int size;
    private Node head = new Node();

    public int size()
    {
        return size;
    }

    public boolean add(Object obj)
    {
        head.prev = head.prev.next = new Node(obj, head.prev , head);
        ++size;
        return true;
    }

    public Iterator iterator()
    {
        return new Iterator() {

            private Node cursor = head.next;
            private boolean oktoremove = false;

            public boolean hasNext() {

                return cursor!=head;
            }

            public Object next() {
                if(cursor == head)

                    throw new RuntimeException();

                oktoremove = true;
                Object obj = cursor.obj;
                cursor = cursor.next;
                return obj;
            }

            public void remove() {
                if(!oktoremove)
                    throw new IllegalStateException();

                cursor.prev = cursor.prev.prev;
                cursor.prev.next = cursor;
                --size;
                oktoremove = false;

            }
        };
    }

    public static void main(String[] args) {
        LinkedCollection LC = new LinkedCollection();
        System.out.println(LC.add(1));
        LC.add(2);
        LC.add(3);
        LC.add(4);
        LC.add(5);
        LC.add(6);
        System.out.println(LC);
//        Iterator it = LC.iterator();
//        it.next();
//        it.remove();
//        System.out.println(LC);

    }


}
