//leap year check
package leapyearornot;
import java.util.*;
public class LeapYearORNot {
    public static void main(String[] args) {
        // TODO code application logic here
        int leap;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter an year : ");
        leap=sc.nextInt();
        if(leap%4==0){
            if(leap%100==0){
                if(leap%400==0){
                    System.out.println(leap+ " is a leap year");
                }
                else{
                    System.out.println(leap+ " is not a leap year");
                }
            }
            System.out.println(leap+ " is a leap year");
        }
        else{
            System.out.println(leap+ " is not a leap year");
        }
    }
    
}
