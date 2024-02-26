package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Please enter the elements of the array");
        for(int i=0;i<a.length;i++){
            a[i]=rd.nextInt();
        }
        System.out.println("Please enter the target element");
        int target = rd.nextInt();
        if(BinaryS(a,target) == -1)
            System.out.println("The element is not found");
        else
            System.out.println("The element is found at the location "+(BinaryS(a,target)+1));
    }
    public static int BinaryS(int a[], int target){
        int start = 0, end = a.length-1, mid;
        while(start<=end){
            mid = (start+end)/2;
            if(a[mid] == target)
                return mid;
            else if (a[mid]<target) {
                start = mid+1;
            }
            else
                end=mid-1;
        }
        return -1;
    }
}
