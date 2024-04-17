package Association_c_9;
public class A {
 
    public static void main(String[] args) {
        
    A aa=new A();
    aa.show();
    int x=aa.number();
    System.out.println("This result="+x);
    }
      
void show(){    
    System.out.println("This is Superclass");        
}

int number(){
int x=50, y=42;
x=x-y;
return x;
}
}