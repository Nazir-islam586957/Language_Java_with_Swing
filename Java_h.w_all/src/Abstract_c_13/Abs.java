 package Abstract_c_13; 
public abstract class Abs {
    
 abstract void sendmassage();
    public static void main(String[] args) {
        Abs aa; //refarence varivale
        aa= new B();
        aa.sendmassage();
        aa=new C();
        aa.sendmassage();   
        
    }
}
