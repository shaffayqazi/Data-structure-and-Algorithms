package Queue;

public class MyQueue {

    private Node rear;
    
    private Node front;
    
    private int size;
    
    public MyQueue(){
    
    front = null;
    
    rear = null;
    
    size = 0;
    
    }
    
    public class Node {
    
    private Object data;
    
    private Node next;
    
    public Node(Object data){
    
    this.data = data;
    
    this.next = null;
    
    }
    
    public Object getData(){
    
    return data;
    
    }
    
    public void setData(Object data){
    
    this.data = data;
    
    }
    
    public Node getNext(){
    
    return next;
    
    }
    
    public void setNext(Node next){
    
    this.next = next;
    
    }
    
    }
    
    public boolean isEmpty(){
    
    boolean response = false;
    
    if (size == 0)
    
    response = true;
    
    return response;
    
    }
    
    public void enQueue(Object element){
    
    Node node = new Node(element);
    
    if (front == null){
    
    rear = node;
    
    front = node;
    
    size++;
    
    }
    
    else{
    
    rear.setNext(node);
    
    rear = node;
    
    size++;
    
    }
    
    }
    
    public Node deQueue(){
    
    Node response = null;
    
    if(front != null){
    
    if(front.getNext() != null){
    
    response = new Node(front.getData());
    
    front = front.getNext();
    
    size --;
    
    }
    
    else{
    
    response = new Node(front.getData());
    
    front = null;
    
    rear = null;
    
    size--;
    
    }
    
    }
    
    return response;
    
    }
    
    public Node peekFront(){
    
    Node response = null;
    
    if(!isEmpty())
    
    response = new Node(front.getData());
    
    return response;
    
    }
    
    public Node peekRear()
    {
    
    Node response = null;
    
    if(!isEmpty())
    
    response = new Node(rear.getData());
    
    return response;
    
    }
    
    public int getSize(){
    
    return size;
    
    }
    
    public static void main (String[] args){
    
        MyQueue q = new MyQueue();
    
    q.enQueue(1000);
    
    q.enQueue(2000);
    
    q.enQueue(3000);
    
    System.out.println("the size of queue is = "+q.getSize());
    
    System.out.println(q.peekFront().getData()+" element at front");
    
    System.out.println(q.peekRear().getData()+" element at rear");
    
    System.out.println(q.deQueue().getData()+" element deleted from queue ");
    
    System.out.println("the size of queue is = "+q.getSize());
    
    }
    
    }
    
    