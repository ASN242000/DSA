package ConditionalsAndLoops;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Please enter the price of the product");
        double price = rd.nextDouble();
        System.out.println("Please enter the Salvage value/Estimated scrap value of the product");
        double salvage = rd.nextDouble();
        System.out.println("Please enter the estimated useful life in years");
        double life = rd.nextDouble();
        System.out.println("The depreciation value per year is "+dep(price,salvage,life));
    }
    public static double dep(double originalCost, double estimatedScrapValue, double estimatedUsefulLife){
        double value;
        value = (originalCost - estimatedScrapValue)/estimatedUsefulLife;
        return value;
    }
}
