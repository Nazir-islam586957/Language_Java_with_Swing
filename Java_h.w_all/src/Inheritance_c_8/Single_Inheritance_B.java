 
package Inheritance_c_8;
  
public class Single_Inheritance_B extends Single_Inheritance_A{
   
    public static void main(String[] args) {
    Single_Inheritance_B bb=new Single_Inheritance_B();
     bb.show();
     Single_Inheritance_B dd=new Single_Inheritance_B();
     dd.nazir();
        
     Single_Inheritance_A cc=new Single_Inheritance_A();
     cc.hello();
    }
 void show(){
     System.out.println("Welcome to UTC");
 }
 void nazir(){
     System.out.println("Feni computer institiute");
}}
