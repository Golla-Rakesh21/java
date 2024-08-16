//Remove vowels in a string
package removevowels;
import java.util.Scanner;
public class RemoveVowels {
        // TODO code application logic here
        public static String RemoveVowels(String str) 
    {       
         String str2=str.replaceAll("[AEIOUaeiou]", "");
         return  str2;
    } 
    public static void main(String[] args)  
    {  
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();        
        System.out.println("The String after Removing vowles : "+RemoveVowels(str)); 
    } 
 }
    
