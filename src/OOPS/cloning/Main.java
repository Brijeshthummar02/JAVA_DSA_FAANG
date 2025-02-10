package OOPS.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human brijesh = new Human(34, "Brijesh Thummar");
//        Human twin = new Human(brijesh);

        Human twin = (Human) brijesh.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(brijesh.arr));
    }
}