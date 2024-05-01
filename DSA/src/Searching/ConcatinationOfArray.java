package Searching;

import java.util.Arrays;

public class ConcatinationOfArray {
    public static void main(String[] args) {
        int nums[] = {1,3,2,1};
        int a[] = getConcatenation(nums);
        System.out.println(Arrays.toString(a));
    }
    public static int[] getConcatenation(int[] nums) {
        int a[] = new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            a[i] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            a[i+nums.length] = nums[i];
        }
        return a;
    }
}
