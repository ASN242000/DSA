package ConditionalsAndLoops;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = rd.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is "+area);
    }
}
