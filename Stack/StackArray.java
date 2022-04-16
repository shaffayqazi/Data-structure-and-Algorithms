//package Stack;
//
//public class StackArray implements Stack{
//
//    private int size=0;
//    private Object[] a;
//
//    public StackArray() {}
//     public StackArray(int capacity)
//     {
//      this.a = new Object[capacity];
//
//     }
//
//     public boolean isEmpty()
//     {
//           return (size==0);
//
//     }
//
//       public int[] resized(Object[] a)
//       {
//           int  n = a.length;
//
//           int[] aa = new int[2*n];
//
//        System.arraycopy(a, 0, aa, 0, n);
//
//        return aa;
//
//       }
//
//    public Object peek() {
//
//        if(size==0)
//        throw new IllegalStateException("Stack is empty");
//        return a[size -1];
//    }
//
//    public Object pop() {
//
//        if(size==0)
//          throw new IllegalStateException("Array is empty");
//
//          Object obj = a[--size];
//          a[size] = null;
//          return obj;
//    }
//
//    public void push(Object obj) {
//
//       a[size++] = obj;
//       System.out.println(obj);
//
//    }
//
//    public int size() {
//
//        return size;
//    }
//
//public StackArray reverse(StackArray arr)
//{
//    StackArray st = new StackArray();
//    while (!arr.isEmpty())
//    {
//        st.push(arr.pop());
//    }
//    return st;
//}
//
//
//public static void main(String[] args) {
//
//    StackArray sa = new StackArray(10);
//
//
//    for (int i = 1; i <= 10; i++) {
//
//        sa.push(i);
//        System.out.println();
//    }
//
//    System.out.println( "Total size is " + sa.size());
//    System.out.println("Top element is " + sa.peek());
//     sa.pop();
//    System.out.println("top element is Pop");
//   System.out.println( "Total size is " + sa.size());
//
//  System.out.println( sa.reverse(sa));
//}
//
//}
