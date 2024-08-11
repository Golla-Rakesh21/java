// HCF of two numbers
package hcfoftwonumbers;

import java.util.Scanner;

public class HCFOfTwoNumbers {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int g=0;
        for(int i=1;i<=a;i++){
            if(a%i==0&&b%i==0){
                g=i;
                
            }
        }
        System.out.println("GCD of HCF : "+g);
    }
}
