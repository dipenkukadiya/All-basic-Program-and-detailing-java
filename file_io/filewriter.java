package file_io;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
 
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("Dipen.txt",true);
        fw.write(100);
        fw.write("hey man hello i am");
        fw.write('\n');
        char[] ch1 ={'a','b','c'};
        fw.write(ch1);
        fw.write('\n');
        fw.flush();
        fw.close();
        
    }
}
