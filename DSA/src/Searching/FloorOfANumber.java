package Searching;

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] a ={2, 3, 5, 9, 16, 18, 20, 40, 54, 65, 72};
        System.out.println(floor(a,1));
    }
    public static int floor(int a[], int target){
        if(target < a[0]){
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
        return a[end];
    }
}
