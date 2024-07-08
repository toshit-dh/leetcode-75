package Leetcode75.PrefixSum;

import java.util.Arrays;

public class PS1 {
    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));
    }
    public static int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length+1];
        prefix[0] = 0;
        for (int i = 1; i < gain.length+1; i++) {
            prefix[i] = prefix[i-1] + gain[i-1];
        }
        return Arrays.stream(prefix).max().orElse(0);
    }
}
