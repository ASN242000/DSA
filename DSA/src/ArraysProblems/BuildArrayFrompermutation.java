package ArraysProblems;

import java.util.Arrays;

public class BuildArrayFrompermutation {
    public static void main(String[] args) {
        int nums[] = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    public static int[] buildArray(int[] nums) {
        int a[] = new int [nums.length];
        for(int i=0;i<nums.length;i++){
            a[i] = nums[nums[i]];
        }
        return a;
    }
}
