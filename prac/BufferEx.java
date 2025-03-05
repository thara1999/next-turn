package prac;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferEx {



    public static void main(String[] args) throws IOException {
        // Step 1: Connect InputStreamReader to System.in (keyboard input)
        InputStreamReader name = new InputStreamReader(System.in);
        
        // Step 2: Wrap InputStreamReader with BufferedReader for efficient reading
        BufferedReader br = new BufferedReader(name);

        System.out.print("Enter your name: ");
        int myname = Integer.parseInt(br.readLine()); // Reads an entire line

        System.out.println("Hello, " + myname + "!");
    }
}


