package ConditionalsAndLoops;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int a[],n;
        System.out.println("Enter the number of elements to calculate the average");
        n=rd.nextInt();
        a=new int[n];
        System.out.println("Enter the numbers to calculate the average");
        for(int i=0;i<a.length;i++){
            a[i]=rd.nextInt();
        }
        System.out.println("The average is "+average(a));
    }
    public static int average(int a[]){
        int avg,sum=0;
        for(int i =0;i<a.length;i++){
            sum+=a[i];
        }
        avg = sum/a.length;
        return avg;
    }
}
