package LinkedList;

public class SearchString {
     private static class Node
     {
      String data;
       Node next;

       public Node(String data)
       {
           this.data = data;
       }
       public Node(String data, Node next)
       {
           this.data = data;
           this.next = next;
       }

     }

     public static String searchstring(Node head ,Node head2, String data , String data2)
     {
  
        Node p = head;
            while (p.next!=null){

                p = p.next;

                if (p.data == data || p.data == data2) {

                    return "Found";
                }
            }

         return "Not Found";
     }

     public static void main(String[] args) {
         
        Node head = new Node("biscuit");
         head.next = new Node("patties");
          head.next.next = new Node("samosa");
          head.next.next.next = new Node("sandwich");
          head.next.next.next.next = new Node("cakes");

          Node head2 = new Node("pepsi");
          head2.next = new Node("juice");
           head2.next.next = new Node("water");
           head2.next.next.next = new Node("coffee");
           head2.next.next.next.next = new Node("milk");

           String S1 = "samosa";
           String S2 = "water";

           SearchString S = new SearchString();

          System.out.println( S.searchstring(head,head2,S1,S2));
     }
}
