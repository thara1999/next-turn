package Day4;

public class StringEx {
    public static void main(String[] args) {
        // String name="thara";
        // name = name+" "+"welcome"; // creates new one
        // System.out.println(name);
        StringBuilder  name= new StringBuilder("priya");// stringbuiler dont have threadsafe
        name.append("welcome");// editing the existing memory
        System.out.println(name);
        StringBuffer name1=new StringBuffer("hello welcome");
        name1.append("thara");
        System.out.println(name1);
        //string buffer is slower than string builder 
        //threadsafe
        // key takeaway: faster,and effiecnt memory storage
        
        


    }
}
