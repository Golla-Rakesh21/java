//Sum Of Digits In String
package sumofdigitsinstring;
import java.util.Scanner;
public class SumOfDigitsInString {
    public static void main(String[] args) {
        String A;
        Scanner sc=new Scanner(System.in);
        A=sc.nextLine();
        int sum = 0;
        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            sum += Character.getNumericValue(ch);  
        }
        System.out.println("The sum of digits in the string is: " + sum);
    }
}
