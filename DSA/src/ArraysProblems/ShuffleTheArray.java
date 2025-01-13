package ArraysProblems;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int nums[] = {2,5,1,3,4,7}, n = 3;
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int a[] = new int[2*n];
        int i=0,j=n;
        for(int k=0;k<2*n;k=k+2){
            a[k]=nums[i];
            a[k+1]=nums[j];
            i++;
            j++;
        }
        return a;
    }
}
