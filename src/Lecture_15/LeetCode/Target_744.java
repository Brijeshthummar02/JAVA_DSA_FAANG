package Lecture_15.LeetCode;
//744. FIND THE SMALLEST LETTER GREATER THAN TARGET
// Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.


public class Target_744 {
    public static void main(String[] args) {
        int[] arr = {'c', 'f', 'j'};
        int target = 'c';
        int ans = letter(arr, target);
        System.out.println(ans);
    }

    // return the index of greatest no <= target
    static int letter(int[] letter, int target) {
        int start = 0;
        int end = letter.length - 1;

        while (start < end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (statr + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letter[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return letter[start % letter.length];
    }
}

