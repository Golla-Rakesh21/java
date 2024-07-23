//method1

package sum.of.numbers;
public class SumOfNumbers {
    public static void main(String[] args) {
       int x=20;
       int y=30;
       int z;
       z=x+y;
       System.out.println("Sum of two numbers: "+z);
    }
    
}

//method2

package sum.of.numbers;
import java.util.*;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("Sum 1st number: ");
       int x=sc.nextInt();
       System.out.println("Sum 2nd number: ");
       int y=sc.nextInt();
       sc.close();
       int z;
       z=x+y;
       System.out.println("Sum of two numbers: "+z);
    }
}
