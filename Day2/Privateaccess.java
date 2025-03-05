package Day2;
class PrivateEx{
    private int secretcode=222;
     void showcode(){
        System.err.println(secretcode);
     }  
}

public class Privateaccess {
   public static void main(String[] args) {
       PrivateEx obj=new PrivateEx();
       obj.showcode();
      // System.out.println(obj.showcode());
   }

}
