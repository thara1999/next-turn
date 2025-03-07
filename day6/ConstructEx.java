package day6;

public class ConstructEx {
    String name;
    int num;
           // constructor method
            ConstructEx() {
                 //default constructor
                   name="thara";
                   num=123456777;

                 }
              //parametrized constructor
           ConstructEx(String a, int b) {
                      name = a;
                        num =b;
                     }
                     //copy constructor
                     ConstructEx(ConstructEx obj){
                           this.name=obj.name;
                     }
            
                 void show(){
                    System.out.println(name+" "+num);
                 }
    public static void main(String[] args) {
    
        ConstructEx obj2=new ConstructEx("ramya", 708);
        ConstructEx obj=new ConstructEx(obj2);
       // System.out.println(obj);
        obj.show();
        obj2.show();
    }
}

    //a constructor is aspecial method that ised to intialize a object
    //it is autumaticvaly create when object is called.
    //1.same name as class
    //2.no return type
    //3.called autumatically
    //4.parametrized 
    //overloading is possible
    //types: default constructor and parametrized constructor
