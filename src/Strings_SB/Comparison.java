package Strings_SB;

public class Comparison {
    public static void main(String[] args) {
        String a = "Kunal";
        String b = "Kunal ";
        String c = a;
//        System.out.println(c == a);

        // ==
//        System.out.println(a == b); // will give true

        String name1 = new String("Kunal");
        String name2 = new String("Kunal");

//      System.out.println(name1 == name2); // will give false

        System.out.println(name1.equals(name2));

        System.out.println(name1.charAt(0));
    }
}
