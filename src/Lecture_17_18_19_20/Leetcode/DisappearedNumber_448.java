package Lecture_17_18_19_20.Leetcode;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
// 448.FIND ALL NUMBERS DISAPPEARED IN AN ARRAY [1, N]
// GOOGLE QUESTION
import java.util.ArrayList;
import java.util.List;

public class DisappearedNumber_448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }

        // just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
