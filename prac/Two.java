package prac;


    class DefaultExample {
        int number = 10; // Default access modifier (no keyword)
    }
    
    public class Two{
        public static void main(String[] args) {
            DefaultExample obj = new DefaultExample();
            System.out.println(obj.number);  
        }
    }
    

