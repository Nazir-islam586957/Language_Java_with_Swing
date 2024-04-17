package Association_c_9;

import java.util.Scanner;

public class B {
 
 public static void main(String[] args) {
     B dd=new B();
     dd.method();
     dd.show("df");
    
     A aa=new A();
     aa.number();
             
    }
   

   
  void method(){
  
      System.out.println(" This is SubClass");
  }
    
 void show(String x){
     System.out.println("Welcome");
      Scanner ss=new Scanner(System.in);
     System.out.println("Hello Wold");
     x= ss.nextLine();
     System.out.println("UTC"+x);
    
}  
 
  }
    
 
