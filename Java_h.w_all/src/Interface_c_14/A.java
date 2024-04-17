 
package Interface_c_14;
 
public class A implements B_interface {
 
    public static void main(String[] args) {
         
        
        A aa=new A();
        aa.mm();
        int y=aa.display();
        System.out.println("My old are:"+y);
        aa.show();
    }
    
    void mm(){
        System.out.println("Hi! i'm Nazirul"); 
    }

    @Override
    public void show() {
        System.out.println("Hello World!");
    }

    @Override
    public int display() {
       int x=4;
       int y=5;
       x=x*y;
       return x;
    }
        
    
}
