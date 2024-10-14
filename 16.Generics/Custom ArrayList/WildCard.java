
import java.util.Arrays;

//here T should either be Number or its subclasses
public class WildCard <T extends Number> {

    private Object[] data;

    private static int DEFAULT_SIZE = 10;

    private int size = 0;

    public WildCard() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {

        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy curents items in the new array

        for (int i = 0; i < data.length; i++) {

            temp[i] =data[i];
        }

        data = temp;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, T val) {

        data[index] = val;
    }

    @Override
    public String toString() {

        return "WildCard{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

    public static void main(String[] args) {

           WildCard<Integer> list = new WildCard<>();

            for (int i = 0; i < 13; i++) {
                list.add(i*2);
            }

            System.out.println(list);



    }
}