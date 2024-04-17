 
package Accessvisibility_c_15;
 
public class A {
    public static void main(String[] args) {
    
  A ab=new A();
  ab.Show();
  
  // ai khane sodo method diye kaj kora hoicy...
  //ai khane variable diye o kaj kora jabe.....
  }
    
   void Show(){
  
        System.out.println("Hi!!..I'm Private method..");
        //sodo ai classy kaj korbe...
    }

 
   protected void display(){
   
       System.out.println("I'm Protected method..");
       // ai pupa package kaj kore & onno class yer sub-classye kaj kore...
   }
public void view(){
    System.out.println("Hi!. I'm Public method");
    //ai khane kaj kore onno class o kaj kore...
}
 
}
