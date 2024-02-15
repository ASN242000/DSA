package ConditionalsAndLoops;

import java.util.Scanner;

public class DiscountPrice {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter the price of an item");
        double price = rd.nextDouble();
        System.out.println("Enter the discount in percentage");
        double discount = rd.nextDouble();
        System.out.println("The discunted price is "+discount(price,discount));
    }
    public static double discount(double price, double discount){
        double disPrice;
        disPrice = price - ((discount/100)*price);
        return disPrice;
    }
}
