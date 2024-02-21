package Searching;

public class EvenNoOFDigits {
    public static void main(String[] args) {
        int a[]= {12,34,123,5463,56,323};
        EvenNoOFDigits b = new EvenNoOFDigits();
        System.out.println(b.noOfDigits(a));
    }
    public int noOfDigits(int[] a){
        int count,ans=0;
        for(int i=0;i<a.length;i++){
            count=0;
            while(a[i]>0){
                a[i]=a[i]/10;
                count++;
            }
            if(count%2 == 0){
                ans = ans+1;
            }
        }
        return ans;
    }
}
