package FirstJ;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            try{
                int num = rd.nextInt();
                EvenOrOdd a = new EvenOrOdd();
                a.evenOrOdd(num);
                flag = false;
            }catch (Exception e){
                if(rd.hasNext())
                    System.out.println("Please enter an integer");
                flag = true;
            }
        }
    }
    public void evenOrOdd(int num){
        if(num % 2 == 0)
            System.out.println("The number "+num+" is even number");
        else
            System.out.println("The number "+num+" is a odd number");
    }
}
