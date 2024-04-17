package Throw_Throw_CustomException_C_22;
import java.util.logging.*;

public class Cus_excep {
    public static void main(String[] args) {
      Cus_excep cc=new Cus_excep();
      try{
      cc.testVoter(16);
     }catch(MyException mm){
      System.out.println("Error is:"+mm.getMessage());
 
     }
    }
 void testVoter(int age)throws MyException{
 if(age>=18){
     System.out.println("Welcome to vote");
 }else{
 throw new MyException ("Sorry age is under 18, So you can't vote");
 }
 }
}






class MyException extends Exception{

 public MyException(String message){
 super(message);
 }   
}
 