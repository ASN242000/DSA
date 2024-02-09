package ConditionalsAndLoops;

import java.util.Scanner;

public class FibinacciSeries {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int num1=0,num2=1,sum;
        System.out.println("Enter upto which the fibonacci series must be printed");
        int len = rd.nextInt();
        System.out.print(num1+" "+num2);
        for(int i=2;i<len;i++){
            sum = num1+num2;
            System.out.print(" "+sum);
            num1=num2;
            num2=sum;
        }
    }
}
