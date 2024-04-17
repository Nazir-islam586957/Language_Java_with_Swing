 package Constractor_over_loding_C_5;
import java.util.Scanner;
 public class Students {
  
    String x;
    int y;
    public static void main(String[] args) {
        
       String a;
       int roll;
       Scanner ss=new Scanner(System.in);
        System.out.print("Enter your name:");
        a=ss.nextLine();
      System.out.print("Enter your roll:");
       roll =ss.nextInt();
        Students sa=new Students(a,roll);
        
        sa.show();    
    }
    
   Students(String x,int y){
        this.x=x;
        this.y=y;
    }
    
   void show(){
       System.out.println("Roll:"+x+"Name:"+y);
       
       System.out.println("Hello Wold"); 
    } 
        
}

