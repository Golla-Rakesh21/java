//Prime between numbers
package primebetween;
import java.util.Scanner;
public class PrimeBetween {
    public static void main(String[] args) {
        // TODO code application logic here
        int start;
        int end;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the start number : ");
        start=sc.nextInt();
        System.out.print("Enter the start number : ");
        end=sc.nextInt();
        for(int i=start;i<=end;i++){
            if (i == 1 || i == 0){
                continue;
            }
            int cart = 1;

            for (int j=2;j<=i/2;j++) {
                if (i%j==0) {
                    cart=0;
                    break;
                }
            }
            if (cart==1){
                System.out.println(i);
            }
        }
    }
}
