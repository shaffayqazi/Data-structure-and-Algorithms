package Stack;

import java.util.Arrays;
public class ArrayStack implements Stack{
    Object[] arr;
    int count;

    ArrayStack(int size){
        arr = new Object[size];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public void push(Object value){
        if(count == arr.length)
            throw new StackOverflowError();

        arr[count++] = value;
    }

    public int size() {
        return arr.length;
    }

    public Object pop(){
        if(isEmpty())
            throw new IllegalStateException();

        return arr[--count];
    }

    public Object peek(){
        if(isEmpty())
            throw new IllegalStateException();

        return arr[count-1];
    }

    public boolean equals(ArrayStack stack){

        if(count>stack.count || count<stack.count)
            return false;

        for(int i=0; i<count; i++)
            if(arr[i] != stack.arr[i])
                return false;

        return true;
    }

    public void removeBottomELement()
    {
        arr[0] = null;
    }

    public Object bottomELement(){
        return arr[0];
    }

    public Object secondElement(){
        return arr[count-2];
    }

    public void removeSecondElement(){
        arr[count-2]= arr[count-1];
        arr[--count] = null;
    }

    public LinkedStack toLinkedStack(){
        var stack = new LinkedStack();

        for(int i=count; i>0; i--)
            stack.push(arr[i-1]);

        return stack;
    }

    public String toString(){
        Object[] array = Arrays.copyOfRange(arr, 0, count);
        return Arrays.toString(array);
    }

    public void reverse() {
      System.out.print("[");

        for(int i=arr.length-1; i>=0; i--)
        {
             Object a = arr[i];

             System.out.print( a + ", ");
        }
        System.out.print("]");
    }

// test class

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        System.out.println("Stack is empty: " + stack.isEmpty());

        System.out.println();

        for (int i = 1; i <= 10; i++) {

            stack.push(i);
        }

        System.out.println(stack);

        // stack.pop();
        // System.out.println("\nAfter poping: " + stack);

        // System.out.println("\nStack is empty: " + stack.isEmpty());

        // System.out.println("Bottom element is : " + stack.bottomELement());
//         stack.removeBottomELement();
//         System.out.println("After removing bottom elemenet: " + stack);

        // stack.removeSecondElement();
        // System.out.println("After removing second elemenet: " + stack);

        // stack.toLinkedStack();
        // System.out.println(stack);
        stack.reverse();

    }
}

