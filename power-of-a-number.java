//power of a number
package powerofnumber;
import java.util.Scanner;

public class PowerOfNumber {
    static double PowerOfNumber(int n,int p){
        return Math.pow(n, p);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
         System.out.print("Enter the power : ");
        int p=sc.nextInt();
        int result=(int)(PowerOfNumber(n,p));
        System.out.println(result);
    }
}
