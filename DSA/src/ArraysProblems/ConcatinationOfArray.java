package ArraysProblems;

import java.util.Arrays;

public class ConcatinationOfArray {
    public static void main(String[] args) {
        int nums[] = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int a[] = new int[2*nums.length];
        int j=0;
        for(int i=0;i<2*nums.length;i++){
            a[i] = nums[j];
            j++;
            if(j == nums.length)
                j=0;

        }
        return a;
    }
}
