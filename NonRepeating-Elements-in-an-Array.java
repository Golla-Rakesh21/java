// Find Non-Repeating Elements in an Array 
package nonreapetedelements;
import java.util.Scanner;
public class NonReapetedElements {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
       System.out.println("Enter "+size+" numbers : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==x){
                    ++count;
                }
            }
            if(count==1){
                System.out.println("non repeated elements : "+arr[i]);
            }
        }
    }
    
}
