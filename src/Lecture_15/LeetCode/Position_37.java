//package Lecture_15.LeetCode;
//// 37. FIND THE FIRST AND LAST POSITION OF ELEMENT IN SORTED ARRAY
///*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
//
//*/
//
//
////FACEBOOK INTERVIEW QUESTION
//
//
//public class Position_37 {
//    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
//        int target = 22;
//        int ans =searchRange(arr, target);
//        System.out.println(ans);
//    }
//
//    // return the index
//    // return -1 if it does not exist
//    static int searchRange(int[] nums, int target) {
//
//        int[] ans = {-1, -1};
//        // check for first occurence if target first
//        ans[0]  = search(nums, target, true);
//      if(ans[0] == -1) {
//          ans[1] = search(nums, target, false);
//      }
//
//        return ans[0];
//    }
//    //this function just return the index value of target
//    int[]  search(int[] nums, int target, boolean findStartIndex) {
//       int ans = -1;
//        int start = 0;
//        int end = nums.length - 1;
//
//        while (start <= end) {
//            // find the middle element
//            //            int mid = (start + end) / 2; // might be possible that (statr + end) exceeds the range of int in java
//            int mid = start + (end - start) / 2;
//
//            if (target < nums[mid]) {
//                end = mid - 1;
//            } else if (target > nums[mid]) {
//                start = mid + 1;
//            } else {
//                // potential ans found
//               ans = mid;
//               if (findStartIndex) {
//                   end = mid - 1;
//               } else {
//                   start = mid + 1;
//               }
//            }
//        }
//        return ans;
//    }
//}