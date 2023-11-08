package file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class print_writer {
    public static void main(String[] args)  throws IOException {
        FileWriter fw= new FileWriter("d.txt");
        PrintWriter out = new PrintWriter(fw);
        out.write(100);
        out.println(100);
        out.print(true);
            out.print('c');
                    out.print("durga");
        out.flush();
        out.close();

    }
}
