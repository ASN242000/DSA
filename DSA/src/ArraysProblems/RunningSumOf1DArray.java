package ArraysProblems;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int a[] = new int[nums.length];
        a[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            a[i] = a[i-1] + nums[i];
        }
        return a;
    }
}
