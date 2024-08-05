//Automorphic Number
package automorphicnumber;
import java.util.Scanner;
public class AutomorphicNumber {
    static boolean automorphic(int N){
              int s=N*N;
              while(N>0){
                  if(N%10!=s%10){
                      return false;
                  }
                  else{
                      N=N/10;
                      s=s/10;
                  }
              }
              return true;
     }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter a mumber : ");        
         int N=sc.nextInt();
         if(automorphic(N)){
             System.out.println("Automorphic number");
         }
         else{
             System.out.println("Automorphic number");  
         }
    }
    
}
