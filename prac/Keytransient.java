package prac;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable {
    private static final long serialVersionUID = 1L;  // Unique ID for serialization
    
    String name;
    transient String password;  //  This field will NOT be saved

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}

public class Keytransient {
    public static void main(String[] args) throws Exception {
        // Creating an object of User
        User user = new User("Alice", "secret123");

        // Serialization: Saving object to a file
        FileOutputStream fileOut = new FileOutputStream("user.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();
        System.out.println(" Object Serialized!");

        //  Deserialization: Reading object from file
        FileInputStream fileIn = new FileInputStream("user.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        User deserializedUser = (User) in.readObject();
        in.close();
        fileIn.close();

        // Checking values after deserialization
        System.out.println("Name: " + deserializedUser.name);  // Name is saved
        System.out.println("Password: " + deserializedUser.password);  //  Password is null (not saved)
    }

}
