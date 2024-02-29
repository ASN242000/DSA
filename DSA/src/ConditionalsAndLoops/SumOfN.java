package ConditionalsAndLoops;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Please enter the total total number of values to calculate summation");
        int num= rd.nextInt();
        System.out.println("The summation is "+summation(num));
    }
    public static int summation(int n){
        Scanner rd = new Scanner(System.in);
        int sum=0;
        System.out.println("Please enter the numbers");
        while(n>0){
            int num = rd.nextInt();
            sum+=num;
            n--;
        }
        return sum;
    }
}
