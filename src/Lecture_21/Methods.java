package Lecture_21;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args){
        String name = "Brijesh Thummar Hello World";
        System.out.println(Arrays.toString(name.toCharArray())); // will convert name to character array
        name.toLowerCase();
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("    Brijesh   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
