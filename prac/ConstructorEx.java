

public class ConstructorEx {
    String name;
    int num;

    public ConstructorEx(int b) {
        System.out.println("hello"+b);
         num=b;
    }
    
    public static void main(String[] args) {
        ConstructorEx obj=new ConstructorEx(9);
        System.out.println(obj.name);
    }
}
