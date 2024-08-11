//largest number in array
package largestnumberinarray;
import java.util.Scanner;
public class LargestNumberInArray {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length : ");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.print("Enter the "+len+ " numbers : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The max number : "+max);
        
    }
    
}
