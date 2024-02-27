package ConditionalsAndLoops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = rd.nextInt();
        int copy = num,count=0;
        while(copy>0){
            copy=copy/10;
            count++;
        }
        int val=num;
        double sum=0;
        while(val>0){
            int digit = val%10;
            val=val/10;
            sum= sum+Math.pow(digit,count);
        }
        if(sum == num)
            System.out.println("The number is an armstrong number");
        else
            System.out.println("The number is not an armstrong number");
    }

}
