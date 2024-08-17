//Remove all characters from string except alphabets
package removingcharaters;
import java.util.Scanner;
public class RemovingCharaters {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println("the String After removing the special characters : "+str1.replaceAll("[^a-zA-Z]"," "));
    }  
}
