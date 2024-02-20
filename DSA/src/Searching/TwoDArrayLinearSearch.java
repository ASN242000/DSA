package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayLinearSearch {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int a[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Please enter the element to find");
        int target = rd.nextInt();
        System.out.println(Arrays.toString(searchL(a,target)));
    }
    public static int[] searchL(int arr[][], int target){
        int row,col;
        for(row=0;row< arr.length;row++){
            for(col=0;col<arr[row].length;col++){
                if(arr[row][col] == target)
                    return new int[]{row,col};
            }
        }
        return new int[]{-1};
    }
}
