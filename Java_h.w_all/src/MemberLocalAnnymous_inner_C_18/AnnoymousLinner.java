 package MemberLocalAnnymous_inner_C_18;
 
public class AnnoymousLinner {

    public static void main(String[] args) {
      AnnoymousLinner aa=new AnnoymousLinner (); 
      aa.hello();
    }
    
 void hello(){
     MyAnnonymousInner aic=new MyAnnonymousInner(){
    @Override
  void show(){
   System.out.println("This is hello show");}
// void helloTest(){
//    System.out.println("This is helloTest");}
  
  // annamoush er main class er method bade onno kono method use kora jabe na... 
     };
 aic.show();
  }
}   
  class MyAnnonymousInner{
  void show(){
      System.out.println("Hello wold");
   
  } }  
 
