
package evenorodd;
import java.util.*;
public class EvenOrODD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number to check : ");
      int num=sc.nextInt();
      sc.close();
      if(num%2==0){
          System.out.println(num +" is even number");
      }
      else{
          System.out.println(num +" is odd number");
      }
    }
}
