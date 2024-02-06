package Basic;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
       Scanner rd = new Scanner(System.in);
        LeapYear a = new LeapYear();
        System.out.println("Please enter a year to check if a year is leap year or not");
       int year = rd.nextInt();
       if (a.checkLeap(year)==true)
           System.out.println("The year "+year+" is leap year");
       else
           System.out.println("The year "+year+" is not leap year");
    }
    public boolean checkLeap(int year){
        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 ==0){
                    return true;
                }
                else
                    return false;
            }
            else
                return true;
        }
        return false;
    }
}
