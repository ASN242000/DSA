package FirstJ;

import java.util.Scanner;

public class NumOccurance {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = rd.nextInt();
        System.out.println("Enter the digit of occurance");
        int digit = rd.nextInt();
        int count=0;
        int rem;
        while(num != 0){
            rem = num%10;
            if(rem == digit){
                count++;
            }
            num = num /10;
        }
        System.out.println("The total occurance of "+digit+" is "+count+" times");
    }
}
