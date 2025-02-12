package OOPS.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        System.out.println(list2);

        List<Integer> vector = new LinkedList<>();
        vector.add(45);
        vector.add(5);
        vector.add(15);
        vector.add(65);

        System.out.println(vector);

    }

}
