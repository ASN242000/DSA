package Searching;

import java.util.Arrays;

public class RunningSunOf1DArray {
    public static void main(String[] args) {
        int nums[] = {1,3,2,1};
        int a[] = runningSum(nums);
        System.out.println(Arrays.toString(a));
    }
    public static int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];

        }
        return nums;
    }
}
