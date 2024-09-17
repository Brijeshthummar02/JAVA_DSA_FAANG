package LeetCode;

//Input: accounts = [[1,2,3],[3,2,1]] // 1+2+3 = 6_total wealth
//Output: 6

//process
/*
1. itrate over every row
2. take the sum of every row
3. check it with the main ans
 */

public class RichestCustomerWealth_1672 {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        // person = row
        // account = column
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new col, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;

    }
}

