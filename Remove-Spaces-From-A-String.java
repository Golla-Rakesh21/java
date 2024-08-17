// Remove spaces from a string
package removespacesstring;
import java.util.Scanner;
public class RemoveSpacesString {
    public static String RemoveSpacesString(String str1){
        String str2=str1.replaceAll(" ","");
        return str2;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str1=sc.nextLine();
        System.out.println("The String after removing spaces  : "+RemoveSpacesString(str1));
    }
    
}
