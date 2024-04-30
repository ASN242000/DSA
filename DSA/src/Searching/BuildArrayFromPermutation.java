package Searching;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int nums[]={0,2,1,5,3,4};
        int[] a = buildArray(nums);
        System.out.println(Arrays.toString(a));
    }
    public static int[] buildArray(int[] nums) {
        int a[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i] = nums[nums[i]];
        }
        return a;
    }
}
