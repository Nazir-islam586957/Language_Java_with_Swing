 
package Arraylist_Linkedlist_c_17;
 
import java.util.ArrayList;
import java.util.LinkedList;

public class ArList {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add("Nazir");
        al.add("Cumilla");
        al.add("01645116798");
        al.add("B+");
        
     System.out.println("Name of student:"+al);
        al.set(1,"Murad");
     System.out.println("Name of student:"+al);
    
        al.add("Class 3");
    System.out.println("Name of student:"+al);         
        
    
   al.add("O+");
    System.out.println("BG in:"+al.indexOf("B+"));
    
    
    //obj ahce kina ta dekar jonno
    if(al.contains("B+")){
        System.out.println("Data found..");
    }else{ 
        System.out.println("Data not found....");
    }
      
    
    
//..................linkedList............
      LinkedList al2=new LinkedList();
        al2.add(20);
        al2.add("Rafi");
        al2.add("Feni");
        al2.add("0182116798");
        al2.add("O+");
        
     System.out.println("Name of student:"+al2);
    
     al.addAll(3, al2);
        System.out.println("Data:"+al);
      
    }
  
}
