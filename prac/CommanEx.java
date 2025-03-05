
public class CommanEx {
    
        public static void main(String[] args) {
            if (args.length < 2) {
                System.out.println("enter provide your name and age in command-line arguments.");
                return;
            }
    
            String name = args[0];  // First argument
            int age = Integer.parseInt(args[1]);  // Second argument
    
            System.out.println("Hello " + name + ", you are " + age + " years old.");
        }
    }
    

