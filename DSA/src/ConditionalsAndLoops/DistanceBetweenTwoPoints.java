package ConditionalsAndLoops;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Please enter the co-ordinates of point x1");
        double x1 = rd.nextDouble();
        System.out.println("Please enter the co-ordinates of point y1");
        double y1 = rd.nextDouble();
        System.out.println("Please enter the co-ordinates of point x2");
        double x2 = rd.nextDouble();
        System.out.println("Please enter the co-ordinates of point y2");
        double y2 = rd.nextDouble();
        System.out.println("Distance between 2 points = "+disBetweenTwoPoints(x1,y1,x2,y2));
    }
    public static double disBetweenTwoPoints(double x1, double y1, double x2, double y2){
        double dis;
        dis=Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
        return dis;
    }
}
