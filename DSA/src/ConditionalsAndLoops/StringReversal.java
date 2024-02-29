package ConditionalsAndLoops;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a string");
        String s = in.nextLine();
        rev(s);
    }
    public static void rev(String s){
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse += s.charAt(i);
        }
        System.out.println("The reversed string is "+reverse);
    }
}
