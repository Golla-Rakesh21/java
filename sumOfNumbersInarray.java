//Sum of arrays
package sumofarrays;
import java.util.Scanner;
public class SumOfArrays {
    public static void main(String[] args) {
        // TODO code application logic here
         int[] arr;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of elememts in array : ");
        int n=sc.nextInt();
        arr=new int[n];
        System.out.print("enter the elememts of array : ");
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         int sum=0;
         for(int i=0;i<n;i++){
            sum=arr[i]+sum;
        }
        System.out.println("sum of elememts in array : "+sum); 
    }
}
