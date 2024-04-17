package Method_Override_c_10;
 
public class B extends A {
    public static void main(String[] args) {
        B bb=new B();
        bb.nazir();
        
    }
    
    @Override
    void nazir(){
     System.out.println("Cirodin tumar ahkas tumar batash amar phrane bajay basi");
    }
}
