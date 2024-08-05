//perfect Square
package perfectsquare;
import java.util.*;
public class PerfectSquare {
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  number : ");
        num=sc.nextInt();
        int root=(int)Math.sqrt(num);
        if(root*root == num){
            System.out.println("perfect square");
        }
        else{
            System.out.println("Not perfect square");
        }
         
    }
    
}
