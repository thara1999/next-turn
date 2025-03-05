package Day5;

public class MethodEx {
    // method
     public static int add(int a,int b)
     {
        return  a+b;
     }
     // static keyword ,it can be accessed without creating object
    public static void main(String[] args) {
        int sum=add(3,8);
        System.out.println(sum);
    }
}
