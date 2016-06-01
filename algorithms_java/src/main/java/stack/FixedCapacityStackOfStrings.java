package stack;

/**
 * Created by User on 5/31/2016.
 */
public class FixedCapacityStackOfStrings {

    private String[] a;     // elements
    private int N;          // size

    public FixedCapacityStackOfStrings(int cap) {
        a = new String[cap];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(String item) {
        a[N++] = item;
    }

    public String pop() {
        return a[--N];
    }

}
