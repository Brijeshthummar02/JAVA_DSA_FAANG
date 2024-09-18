package SearchAlgorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {32,54,24,6,54,87,45,24};
        int target = 6;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    // search in the array: return the index if item found
    // otherwise if item not found return -1;
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
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
