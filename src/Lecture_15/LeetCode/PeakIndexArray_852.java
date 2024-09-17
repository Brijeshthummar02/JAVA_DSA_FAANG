package Lecture_15.LeetCode;
//852: PEAK INDEX IN A MOUNTAIN ARRAY
//You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//Return the index of the peak element.
//Your task is to solve it in O(log(n)) time complexity.


public class PeakIndexArray_852 {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                //you are in decreasing part of array
                //this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in ascending part of the array
                start = mid + 1; // cuz we know mid + 1 element > mid element
            }
        }
        // in the end, start == and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above two checks
        // hence, when they are pointing to just one element, that is the max one bcuz that is what the check say
        // more elaboration: at every point of time for start and end they have the best possible ans till that time
        // and if we are saying that only one item is remaining, hence bcuz of the above line that is the best possible ans.
        return start; // or return end as both are equal
    }
}
