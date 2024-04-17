package Static_c_4; 
public class A {
     public static void main(String[] args) {
         
         int m=6,
             n=7;
          A a=new A();
         a.show();
        System.out.println("Bangladesh is small country");
        
       m=addtwo(n, n);
         System.out.print(""+m);  
    }
    
    void show(){
    System.out.println("Hello world");
}
    
static int addtwo(int x, int y){
        x=x+y;
        return x;
    }    
}
 