package BSQuestions;

public class Celling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int ans = celling(arr, target);
        System.out.println(ans);
    }

    // return the index of smallest no >= target
    static int celling(int[] arr, int target) {

        // but what if the target is greater than the greatest no in array
        if(target > arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            //            int mid = (start + end) / 2; // might be possible that (statr + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return start;

    }
}




