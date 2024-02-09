package ConditionalsAndLoops;

import java.util.Scanner;

public class LargestOfNums {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int max=0,num;
        boolean flag=true;
        while(flag){
            System.out.println("Please enter the number: ");
            num=rd.nextInt();
            if(num == 0)
                flag = false;
            else{
                if(max<num)
                    max=num;
            }
        }
        System.out.println("The maximun is "+max);
    }
}
