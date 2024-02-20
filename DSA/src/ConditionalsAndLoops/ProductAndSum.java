package ConditionalsAndLoops;

import java.util.Scanner;

public class ProductAndSum {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        double num1,num2,sum,product;
        System.out.println("Enter 2 numbers");
        num1 = rd.nextDouble();
        num2 = rd.nextDouble();
        sum = num1 + num2;
        product = num1*num2;
        System.out.println("The difference between the sum and product is "+(product-sum));
    }
}
