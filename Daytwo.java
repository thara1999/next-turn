class PrivateEx {
    private int secretCode = 1234;  // Private variable

    void showCode() {
        System.out.println(secretCode);
    }
}

public class Daytwo {
    public static void main(String[] args) {
        PrivateEx obj = new PrivateEx();
        obj.showCode();  
         //System.out.println(obj.secretCode); 
         // why error :Because secretCode variable is private, and it cannot be accessed outside PrivateEx
    }

}
