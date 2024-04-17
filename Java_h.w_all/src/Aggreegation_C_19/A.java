package Aggreegation_C_19;
 public class A {
 int id;
 String name;
 Address ad;
   public static void main(String[] args) {
     Address address=new Address(102,"Harong","Chandina","Cumilla");
     A aa=new A(10, "Nazir",address);
     aa.showAll();
   }
 public A(int id, String name, Address ad) {
        this.id = id;
        this.name = name;
        this.ad = ad;
    }
 void showAll(){
     System.out.println("Id:"+id+", Name:"+name+""
             +"\nRoad No:"+ad.roadNo+", Village:"+ad.Village+"\n"
             +"city:"+ad.city+", state:"+ad.state);
 }
 }


class Address{
int roadNo;
String Village;
String city;
String state;
public Address(int roadNo, String Village, String city, String state) {
        this.roadNo = roadNo;
        this.Village = Village;
        this.city = city;
        this.state = state;
    }

}

