
package positiveornegativenumber;
import java.util.*;
public class PositiveorNegativenumber {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number to check : ");
      int num=sc.nextInt();
      sc.close();
      if(num>=0){
          System.out.println(num +" is positive number");
      }
      else{
          System.out.println(num +" is negative number");
      }
    }
}
