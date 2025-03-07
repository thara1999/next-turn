package day7;
abstract class Database{
         abstract void connecting();
          void disconnect(){
            System.out.println("disconnected");
          }
}
class Mydata extends Database{

    void connecting(){
        // codeblock for connecting
    System.out.println("connected to database");
  }
}

public class Abstract2Ex {
    public static void main(String[] args) {
        Mydata db=new Mydata();
        db.connecting();
    }
}
