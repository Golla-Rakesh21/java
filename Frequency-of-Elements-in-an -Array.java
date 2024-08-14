// Frequency of Elements in an Array
package frequencyofelementsinanarray;
import java.util.Scanner;
class frequency1{
    public frequency1(int size){
        int[] arr=new int[size];
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter "+size+" numbers : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }int[] visitedarr=new int[size];
        int visited=-1;
         for(int i=0;i<size;i++){
             int count=1;
             for(int j=i+1;j<size;j++){
              if(arr[i]==arr[j]){
                 count++;
                 visitedarr[j]=visited;
             }  
        } if(visitedarr[i]!=visited){
                 visitedarr[i]=count;
             }
     } for(int i=0;i<visitedarr.length;i++){
             if(visitedarr[i]!=visited){
                 System.out.println("Frequency of "+arr[i]+" : "+visitedarr[i]);
             }
         } 
    }
}
public class FrequencyofElementsinanArray {
    public static void main(String[] args) {
        // TODO code application logic here
         frequency1 sa=new frequency1(6);
    }
}
