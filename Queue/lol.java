package Queue;

import java.util.Arrays;

public class lol {

    int i = 0;
    int cap = 5;
    Object arr[];
    int size;

    lol(){

        arr = new Object[]{1, 2, 3};

    }
    public void remove(){

        while(i == size){

            arr[i++] = arr[size];
            arr[size] = null;
            size--;

        }

    }

    public static void main(String[] args) {

        lol l = new lol();

        l.remove();

        System.out.println(Arrays.toString(l.arr));

        l.remove();

        System.out.println(Arrays.toString(l.arr));





    }


}

