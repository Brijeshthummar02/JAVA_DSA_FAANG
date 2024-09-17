package Strings;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
      //  subseq(" ", "abc");
      //  System.out.println(subseqRet(" ", "abc"));
      //  subseqAscii("", "abc");
        System.out.println(subseqAsciiRet("", "abc"));

    }

    // p --> processed , up --> unprocessed
    static void subseq(String p, String up){
        if (up.isEmpty()){ // Base condition --> whenever up is empty print (p).
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0); // take the first ch

        // make 2 recursion calls { add it / ignore it }

        subseq(p + ch, up.substring(1)); // add it
        subseq(p, up.substring(1)); // ignore it
    }

    static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch+0), up.substring(1));
    }

    static ArrayList<String> subseqAsciiRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseqAsciiRet(p + ch, up.substring(1));
        ArrayList<String> second = subseqAsciiRet(p, up.substring(1));
        ArrayList<String> third = subseqAsciiRet(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
