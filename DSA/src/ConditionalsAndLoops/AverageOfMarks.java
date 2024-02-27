package ConditionalsAndLoops;

import java.util.Scanner;

public class AverageOfMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        System.out.println("Please enter the number of subjects");
        double num = in.nextDouble();
        System.out.println("Please enter the marks of each subject");
        double count = num;
        while(count > 0){
            double sub = in.nextDouble();
            sum += sub;
            count --;
        }
        System.out.println("The average marks is "+avg(sum,num));
    }
    public static double avg (double sum, double total){
        double average;
        average = sum/total;
        return average;
    }

}
