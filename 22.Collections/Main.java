import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        List<Integer> list2 = new LinkedList<>();

        list2.add(23);
        list2.add(43);
        list2.add(13);
        list2.add(73);

        System.out.println(list2);

        List<Integer> vector = new Vector<>();

        vector.add(23);
        vector.add(43);
        vector.add(13);
        vector.add(73);

        System.out.println(vector);

        //the difference between arrayList and vector is ArrayList is not synchronized but vector is synchronized

    }
}