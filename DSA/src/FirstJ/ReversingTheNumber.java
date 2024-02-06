package FirstJ;

import java.util.Scanner;

public class ReversingTheNumber {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter a number to be reversed");
        int num= rd.nextInt();
        int digit,count=0;
        double reverse=0;
        int copy=num;
        while(copy>0){
            copy = copy/10;
            count++;
        }
        count = count-1;
        while(num > 0){
            digit = num%10;
            reverse = reverse + (digit * Math.pow(10,count));
            count--;
            num = num/10;
        }
        System.out.println("The reversed number is "+reverse);
    }
}
