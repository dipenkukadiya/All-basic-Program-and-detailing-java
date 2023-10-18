package exception_program;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class exe_fnf {
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter pw  = new PrintWriter("abc.txt");
        pw.println("hello");
        // System.out.println(10/0);
    }
    
}


///file not found exception

