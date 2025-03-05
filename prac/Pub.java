package prac;
class PublicEx{
    public String greet = "Hello, World!";
}


public class Pub {
    public static void main(String[] args) {
        PublicEx obj = new PublicEx();
        System.out.println(obj.greet);  // Accessible from anywhere
    }

}
