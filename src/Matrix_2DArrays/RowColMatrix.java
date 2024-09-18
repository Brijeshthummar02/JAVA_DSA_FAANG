package Matrix_2DArrays;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int arr[][] = {
            //   0   1   2   3
                {10, 20, 30 ,40}, //0
                {15, 25, 35, 45}, //1
                {28, 29, 37, 49}, //2
                {33, 34, 38, 50}  //3
        };
        System.out.println(Arrays.toString(search(arr, 40)));
    }
    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
