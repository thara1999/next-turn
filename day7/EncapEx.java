package day7;

//hinding fields and methods
// controlled access 
//secure
class class1{
     private String name;
     void setname(String name){
        this.name=name;
     }
     String  getname(){
        return name;
     }
}
public class EncapEx {
    public static void main(String[] args) {
     class1 obj=new class1();
    obj.setname("sharmila");
       System.out.println(obj.getname());
    //obj.getname();



    }
}
