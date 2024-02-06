package Basic;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int n=rd.nextInt();
        MultiplicationTable m = new MultiplicationTable();
        m.MultiTableNum(n);
    }
    public void MultiTableNum(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}
