package ConditionalsAndLoops;

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int sum=0,num;
        boolean flag=true;
        while(flag){
            System.out.println("Please enter the number: ");
            num=rd.nextInt();
            if(num == 0)
                flag = false;
            else
                sum += num;
        }
        System.out.println("The sum = "+sum);
    }
}
