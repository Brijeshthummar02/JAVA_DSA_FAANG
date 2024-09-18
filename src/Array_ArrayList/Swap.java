package Array_ArrayList;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 54};
        swap(arr, 0, 4);
       System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index, int index2){
        int temp = arr[index];
        arr[index] = arr[index2];
        arr[index2] = temp;

    }
}
