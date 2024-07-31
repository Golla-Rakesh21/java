//greatest of two numbers
package greatestofnumbers;
import java.util.*;
public class GreatestOfNumbers {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number : ");
        int num1=sc.nextInt();
        System.out.print("enter second number : ");
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("num1 = "+num1+" is greater than num2 = "+num2);
        }
        else if(num2>num1){
            System.out.println("num2 = "+num2+" is greater than num1 = "+num1);
        }
        else{
            System.out.println("Both numbers are same,should give different numbers to find greater number");
        }
    }
    
}
