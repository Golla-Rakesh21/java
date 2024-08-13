//ascending order of arrays 
package secondlargestinarray;
import java.util.Scanner;
public class SecondLargestInArray {
    public static void main(String[] args) {
         int[] arr;
         int temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of elememts in array : ");
        int size=sc.nextInt();
        arr=new int[size];
        System.out.print("enter the elememts of array : ");
         for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        } 
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        } 
        System.out.println();
        System.out.println("Elements of array are sorted in ascending order : "); 
        System.out.println(java.util.Arrays.toString(arr));
       
    }
    
}
