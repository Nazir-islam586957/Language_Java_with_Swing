 
package Final_keyword_12;
 
public class Variable {
    
public static void main(String[] args) {
    
     Variable aa=new Variable();
     aa.display();
     aa.show();
     System.out.println("aa.baf");
       System.out.println("aa.feni");
    }

 final  String y="Nazir";
    int x=50; 
    int baf;//black variable
    final int feni; //final black variable
    static int utc;// static final variable
    //constructor diya call korta pari"1"
   Variable(){
       baf=900;
   }
          
   {feni=700;
  
   }  
  //karlee backet ar modda oo call korte pari"2"
static{   
    utc=800;
}
          
 void show(){
     System.out.println("utc ");
        System.out.println("feni ");  
     
 }      
          
 
  void display(){
      //y="fhffn";final dila ai khana ata use kora jaav naa
      String y="Nazir";
       System.out.println(" Enter you name="+y);
       System.out.println(" Enter you Roll="+x);
}
    
}
