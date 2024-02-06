package Basic;

import java.util.Scanner;

public class SumofInputs {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        System.out.println(sum(rd));
    }
    public static int sum(Scanner ob){
        System.out.println("Please enter a num (Enter x to stop) ");
        boolean continueSum=true;
        int sum =0;
        while (continueSum){
            if(ob.hasNextInt()){
                int num = ob.nextInt();
                sum += num;
            } else if (ob.hasNext()) {
                String con = ob.next();
                continueSum = false;
            }
        }
        return sum;
    }
}
