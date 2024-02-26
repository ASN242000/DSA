package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Please enter the elements of the array");
        for(int i=0;i<a.length;i++){
            a[i]=rd.nextInt();
        }
        System.out.println("Please enter the target element");
        int target = rd.nextInt();
        if(LinearS(a,target) == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element fount at location "+(LinearS(a,target)+1));
    }
    public static int LinearS(int a[],int target){
        for(int i=0;i< a.length;i++){
            if(a[i]==target)
                return i;
        }
        return -1;
    }
}
