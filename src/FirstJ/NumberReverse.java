package FirstJ;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int num = rd.nextInt();
        int ans = 0;
        while(num>0){
            int rem = num%10;
            num = num/10;
            ans = ans*10+rem;
        }
        System.out.println("The reversed number is "+ans);
    }
}
