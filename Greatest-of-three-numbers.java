//greatest of three numbers
package greatestofthreenumbers;
import  java.util.*;
public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        a=sc.nextInt();
        System.out.print("Enter the second number : ");
        b=sc.nextInt();
        System.out.print("Enter the third number : ");
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.print("first number is greater than second  and third");
        }
        else if(b>a && b>c){
            System.out.print("second number is greater than first and third");
        }
        else{
            System.out.print("third number is greater than first and second");
        }
    }
    
}
