package LinkedList;

    public class merge {

   private static class Node {

       int data;
       Node next;

       public Node(int data) {
           this.data = data;
       }
       public Node(int data, Node next) {

        this.data = data;
        this.next = next;
       }

   }
        public Node Merge_Node(Node start1, Node start2)
        {
            
            Node i;
            for( i = start1;i.next!=null;i=i.next){}

            i.next =start2;

            return start1;
        }



        public void display(Node head1)
        {
            Node p = head1;
            while (p!=null)
            {
                System.out.print(p.data + " ->");
                p = p.next;
            }
        }

    public static void main(String[] args) {
        
        Node start1 = new Node(1);
        start1.next = new Node(2);
        start1.next.next = new Node(3);
        start1.next.next.next = new Node(4);


        Node start2 = new Node(1);
        start2.next = new Node(2);
        start2.next.next = new Node(3);
        start2.next.next.next = new Node(4);

        merge M = new merge();
        System.out.println( M.Merge_Node(start1, start2));

     M.display(start1);


    }
    
}
