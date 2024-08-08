//Factors Of A number
package factorsofnumber;
import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        num=sc.nextInt();
        System.out.print("The Factors of : ");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
    
}

