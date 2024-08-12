//reverse An array
package reverseanarray;
import java.util.Scanner;
public class ReverseAnArray {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr1,arr2;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of elememts in array : ");
        int n=sc.nextInt();
        arr1=new int[n];
        arr2=new int[n];
        System.out.print("enter the elememts of array : ");
         for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println(java.util.Arrays.toString(arr1));
        for(int i=0,j=n-1;i<n;i++,j--){
            arr2[j]=arr1[i];
        }
        System.out.println(java.util.Arrays.toString(arr2));
    }
}
