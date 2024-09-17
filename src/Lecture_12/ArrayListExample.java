package Lecture_12;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         // syntax
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(87);
//        list.add(98);
//        list.add(99);
//        list.add(100);
//        System.out.println(list.contains(1010));
//        list.set(0, 20);
//        list.remove(2);
//
//        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));// pass index here, list [index] syntax will not working
        }

        System.out.println(list);

    }


}
