package Searching;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] a ={2, 3, 5, 9, 16, 18, 20, 40, 54, 65, 72};
        System.out.println(ceil(a,700));
    }
    public static int ceil(int a[], int target){
        if(target > a[a.length-1]){
            return -1;
        }
        int start = 0, end = a.length-1, mid, ceil;
        while(start<=end){
            mid = start+(end-start)/2;
            if(target<a[mid])
                end = mid-1;
            else if (target > a[mid]) {
                start = mid+1;
            }else{
                    return a[mid];
            }
        }
        return a[start];
    }
}
