package ConditionalsAndLoops;

import java.util.Scanner;

public class PermutationAndCombination {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println("Please enter the total number of items");
        float n = rd.nextFloat();
        System.out.println("Please enter the items taken");
        float r = rd.nextFloat();
        System.out.println("The permutation is "+permutation(n,r));
        System.out.println("The combination is "+combination(n,r));
    }
    public static float fact(float n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static float permutation(float n, float r){
        float ans;
        ans= fact(n)/fact(n-r);
        return ans;
    }
    public static float combination(float n, float r){
        float ans;
        ans = fact(n)/(fact(n-r) * fact(r));
        return ans;
    }
}
