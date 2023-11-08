package file_io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class buffer_writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("hey.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(100);
        bw.newLine();
        char[] ch1 ={'d','d','d','d'};
        bw.write(ch1);
        bw.newLine();
        bw.write("software");
        bw.newLine();
        bw.append("hello");
        bw.flush();
        bw.close();
        
    }
}
