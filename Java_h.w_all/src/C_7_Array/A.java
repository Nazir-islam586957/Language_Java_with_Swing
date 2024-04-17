 
package C_7_Array;
 
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        A aa=new A();
      int p= aa.show("Enter array size=");
       aa.feni(p);
    }
    
    void feni( int s){
        
        int ar[]=new int[s];
        
        for (int i = 0; i < ar.length; i++) {
            ar[i]=show("Enter"+i+"no value=");  
        }
        
        for (int i = 0; i < ar.length; i++) {
          System.out.println(i+"no value is ="+ ar[i]);
         }
    }
    
     int show(String m){
    Scanner ss=new Scanner(System.in);
    System.out.print(m);
        return ss.nextInt();
    }
}

