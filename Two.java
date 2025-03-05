class DefaultEx {
        int number = 10; // Default access modifier (no keyword)
    }
    
    public class Two{
        public static void main(String[] args) {
            DefaultEx obj = new DefaultEx();
            System.out.println(obj.number);  
        }
    }
    

