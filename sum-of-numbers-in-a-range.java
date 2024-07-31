//sum of numbers in a range including start and ending number.
package sumofnumbersinrange;
import java.util.*;
public class SumOfNumbersInRange {
    public static void main(String[] args) {
        // TODO code application logic here
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the start number : ");
        int start=sc.nextInt();
        System.out.print("enter the end number : ");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            sum=sum+i;
        }
        System.out.println("Sum of numbers betwee the range : "+start+" and end : "+end+ " is : "+sum);
    }
}
