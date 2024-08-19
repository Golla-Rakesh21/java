//Check whether a character is an alphabet or not.
package alphabetornot;
import java.util.Scanner;
public class AlphabetOrNot {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (Character.isAlphabetic(ch)) {
      System.out.println(ch + "given character is an alphabet.");
      }
     else {
      System.out.println(ch + " given character is not an alphabet.");
    }
        
    }
     
}
