 package Inheritance_c_8; 
public class Multilavel_Inheritance_A {
      int p=30;
    public static void main(String[] args) {
      
        Multilavel_Inheritance_A a=new Multilavel_Inheritance_A();
        a.multi(15 );
    }
    void multi(int x){
        x=x*p;
        System.out.println("Multi is="+x);
    }
    void hello(){
   
    System.out.println("Welcome");
}

    void multi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
 
