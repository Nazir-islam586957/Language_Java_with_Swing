 package Throw_Throw_CustomException_C_22;
 public class Throw_throws {
 
 public static void main(String[] args) {
      Throw_throws tt=new Throw_throws();
      try{
          tt.checkAge(19);
       }catch(ArithmeticException ar){
          System.out.println("Error is:"+ar.getMessage());
        }
         System.out.println("Hello");
     }     
      
  void checkAge(int age)throws ArithmeticException{
  if(age>21){
  System.out.print("Hello Guys you're stable to marry!!");
  }else{
  throw new ArithmeticException("Age is not enough for marrige");
  }
  }
    
}
