package Lecture_12;

import java.util.Arrays;

public class PassingInFxn {
    public static void main(String[] args) {
        int[] nums = { 1,2,54,624};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
