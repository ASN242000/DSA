package Basic;

import java.util.Scanner;

public class HCFAndLCM {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = rd.nextInt();
        int b = rd.nextInt();
        System.out.println("HCF of "+a+" and "+b+" is "+HCF(a,b));
        System.out.println("LCM of "+a+" and "+b+" is "+LCM(a,b));

    }
    public static int HCF(int num1, int num2){
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
    public static int LCM(int num1, int num2){
        int HCF = HCF(num1,num2);
        int LCM =(num1*num2)/HCF;
        return LCM;
    }
}
