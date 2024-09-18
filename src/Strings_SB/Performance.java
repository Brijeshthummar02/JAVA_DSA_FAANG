package Strings_SB;

public class Performance {
    public static void main(String[] args) {
        // "a" --> String(""), 'a' --> char('')

        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
         //   System.out.println(ch); // A to Z
            series = series + ch; // series += ch
        }

        System.out.println(series);
    }
}
