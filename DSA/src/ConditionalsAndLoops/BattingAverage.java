package ConditionalsAndLoops;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BattingAverage a = new BattingAverage();
        System.out.println("Please enter the player's at-bats");
        double atBa = in.nextDouble();
        System.out.println("Please enter the hits of the batsman");
        double hit = in.nextDouble();
        System.out.println("The batting average of the batsman is "+a.batAvg(atBa,hit));
    }
    public double batAvg(double atBats, double hits){
        double ans;
        ans = hits/atBats;
        return ans;
    }
}
