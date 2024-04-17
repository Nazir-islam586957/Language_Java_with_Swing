package Inheritance_c_8;  
public class Hierarchical_Inheritance_B extends Hierarchical_Inheritance_A {
    
     public static void main(String[] args) {
  Hierarchical_Inheritance_B bb=new Hierarchical_Inheritance_B();  
             
   Hierarchical_Inheritance_A aa=new Hierarchical_Inheritance_A(); 
     
 aa.superclass();
 aa.bangla();
 bb.hello();
    }  
    void hello(){
        System.out.println("Our internationlal language English");
    
}}
