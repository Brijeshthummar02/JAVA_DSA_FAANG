package Lecture_13;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 14;
        System.out.println(linearSearch(arr, target, 1, 4));
    }
    static int linearSearch(int[] arr, int target, int start, int end) {
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for (int index = start; index <= end; index++) {
            // check for element at evry index if it is = target
            int element = arr[index];
            if (target == element) {
                return index;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}