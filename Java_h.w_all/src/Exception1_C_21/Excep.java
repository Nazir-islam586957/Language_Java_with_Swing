 
package Exception1_C_21;
import java.util.*;
public class Excep {
    public static void main(String[] args){
        Scanner ss=new Scanner (System.in);
    try{
         System.out.print("Enter 1st value=");
         int x=ss.nextInt();
          System.out.print("Enter 2nd value=");
           int y=ss.nextInt();
           x=x/y;
           System.out.println("Result is="+x);
    }
    
    //try er maj khane catch gola thakbe agola diye error notice deya hoy
    
    catch(InputMismatchException it){
        System.out.println("Error is: Your must enter number!!");
    }catch(ArithmeticException it){
        System.out.println("Your number must be >0 !!");
    }
//    catch (Exception it){
//        System.out.println("Error is"+it);}
    System.out.println("Thanks For Time woest..");
    }}
