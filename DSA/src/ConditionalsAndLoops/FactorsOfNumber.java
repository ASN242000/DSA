package ConditionalsAndLoops;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int num;
        System.out.println("Enter the num to find the factors of it");
        num = rd.nextInt();
        for(int i=1;i<num;i++){
            if(num%i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
