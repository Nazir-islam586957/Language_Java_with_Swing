 package Inheritance_c_8;

public class Multilavel_Inheritance_B extends Multilavel_Inheritance_A{
   
    public static void main(String[] args) {
    Multilavel_Inheritance_B bb=new Multilavel_Inheritance_B();
     bb.show();
     Multilavel_Inheritance_B dd=new Multilavel_Inheritance_B();
     dd.nazir();
        
    Multilavel_Inheritance_A cc=new Multilavel_Inheritance_A();
     cc.hello();
    }
 void show(){
     System.out.println("Welcome to UTC");
 }
 void nazir(){
     System.out.println("Feni computer institiute");
}

    void customer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
   
    
    
    
    
    
    
    
    
    
 
