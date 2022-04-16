package Queue;

public interface Queue {

    public Object first();
    public void add(Object obj);
    public Object remove();
    public int size();
    public boolean isEmpty();

}
