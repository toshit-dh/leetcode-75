package Leetcode75.PrefixSum;

public class PS2 {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
    }
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftsum = 0;
        for (int ele : nums)
            totalSum += ele;
        for (int i = 0; i < nums.length; leftsum += nums[i++])
            if (leftsum * 2 == totalSum - nums[i])
                return i;
        return -1;
    }
}
