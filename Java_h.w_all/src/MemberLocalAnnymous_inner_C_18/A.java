 
package MemberLocalAnnymous_inner_C_18;
public class A {
 int x=500;
    public static void main(String[] args) {
        A aa=new A();
        aa.dis();
    }
    
void dis(){
    System.out.println("This is main Class");
    class LocalInnerClass{
    void show(){
        System.out.println("Value of x="+x);
    }
    LocalInnerClass lic=new LocalInnerClass();
//    lic.show();
    
    }
}  
       
}
