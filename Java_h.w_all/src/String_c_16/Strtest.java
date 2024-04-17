
package String_c_16;
import java.util.Scanner;
public class Strtest {
    public static void main(String[] args) {
       String st=new String("Hello World");
       String a;
       Scanner ss=new Scanner(System.in);
        System.out.println("Enter your data=");
       a=ss.nextLine();
       if(a.contains("Dhaka")){
           System.out.println("Dhaka is match");
       }else{}
        System.out.println("Not match" );
         
    }
} 