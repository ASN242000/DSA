package Searching;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Please enter the elements of the array");
        for(int i=0;i<a.length;i++){
            a[i]=rd.nextInt();
        }
        System.out.println("Please enter the target element");
        int target = rd.nextInt();
        if(OrderAgnosticBS(a,target) == -1)
            System.out.println("The element is not found");
        else
            System.out.println("The element is found at the location "+(OrderAgnosticBS(a,target)+1));
    }
    public static int OrderAgnosticBS(int[] a, int target){
        int start = 0, end = a.length-1, mid;
        boolean isAsc = a[start] < a[end];
        while(start<end){
            mid = (start+end)/2;
            if(a[mid] == target)
                return mid;
            if(isAsc){
                if (a[mid]<target) {
                    start = mid+1;
                }
                else
                    end=mid-1;
            }
            if(!isAsc){
                if (a[mid]>target) {
                    start = mid+1;
                }
                else
                    end=mid-1;
            }
        }
        return -1;
    }
}
