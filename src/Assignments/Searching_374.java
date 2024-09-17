package Assignments;
// 374. GUESS NUMBER HIGHER OR LOWER
// I  pick a number from 1 to n. You have to guess which number I picked.
//Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
/*
  -1 (NUM > PICK)
   1 (NUM < PICK)
   0 ( NUM == PICK)
 */


public class Searching_374 {
}
/*
private public int guessNumber(int n) {
    for (int i = 1; i < n; i++)
        if (guess(i) == 0)
            return i;
    return n;
}

// OR
/*
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);
            if (res == 0)
                return mid;
            else if (res < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
*/