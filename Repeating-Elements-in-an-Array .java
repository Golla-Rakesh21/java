//Find Repeating Elements in an Array 
package duplicateelementsinarray;
import java.util.Scanner;
public class DuplicateElementsInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
       System.out.println("Enter "+size+" numbers : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("The repeated eleents is : "+arr[j]);
                    break;
                }
            }
        }
    }  
}
