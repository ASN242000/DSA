package ConditionalsAndLoops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Please enter the number");
        double num = rd.nextDouble();
        System.out.println("Please enter the power");
        int po = rd.nextInt();
        System.out.println(""+num+" power "+po+" is equal to "+power(num,po));
    }
    public static double power(double n, double pow){
        double ans=1;
        if (pow == 0)
            return n;
        else{
            while (pow > 0){
                ans*=n;
                pow--;
            }
        }
        return ans;
    }
}
