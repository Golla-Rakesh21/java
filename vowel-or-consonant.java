//Check whether a character is a vowel or consonant.
package vowelorconsonant;
import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);
       if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
            || ch == 'u') {
      System.out.println(ch + "given character is an vowel.");
      }
     else {
      System.out.println(ch + " given character is not an vowel.");
       }
    }
 }
    

