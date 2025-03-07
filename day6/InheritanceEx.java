package day6;
//parent class

class Student{
    void speak(){
        System.out.println("yes students are public speackers");
    }
}
//child class
class Teacher extends Student{
    void teach(){
        System.out.println("yes they are teachers");
    }
}
class Principle extends Teacher{
    void Manange(){
        System.out.println("principle mam");
    }
}

public class InheritanceEx {
 public static void main(String[] args) {
        Teacher obj=new Teacher();
        Principle obj1=new Principle();
        obj1.teach();
        obj.speak();
        obj1.speak();
    }

}
//inheritance is oops conecept 
//that allows one class to inherit properties
//and behavior (methods) from another class (parent)
//purpose:code reusability and 
//establishes a rletionship between classes
//types:
//single inheritance: one class inherites from another
// multilevel:a class inherites from class ,which inherites from 
// another class
//hierarchical :multiple classes inherites from single parent class
//multiple inheritance :not supported ,why?
//not supported bcoz of diamond problem in class , 
//interfaces are using  instead of multiple inheritence.
//hybrid inheritance:
//not supported so have to use hybrid inheritance
