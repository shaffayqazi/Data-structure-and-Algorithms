package LinkedList;

public class TESTing{
private static class Node {
    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}

    public Node reversed(Node head) {

        Node prev = null;

        while (head != null) {
            Node node = head.next;
            prev = head;
            head = node;
            prev = prev.next;
        }
        return prev;
    }

        public static void main (String[]args){
    TESTing t = new TESTing();
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);


            System.out.println( t.reversed(head));

        }

}
