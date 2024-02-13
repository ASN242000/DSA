package ConditionalsAndLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int num,product=1;
        System.out.println("Enter the number to calculate the factorial");
        num = rd.nextInt();
        if(num == 0 || num == 1)
            System.out.println("The factorial is 1");
        else {
            for (int i = 1; i <= num; i++) {
                product *= i;
            }
            System.out.println("The factorial of the number is " + product);
        }
    }
}
