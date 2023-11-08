package file_io;
import java.io.File;
public class fileio {

    public static void main(String[] args) throws Exception {
        File f = new File("abcd");
        System.out.println(f.exists());
        f.mkdirs();
        System.out.println(f.exists());


    }
}



// boolean exists();
// boolean createnewFile();
// boolean mkdir();
// boolean isFile();
// boolean isDirectory();
// String [] list()
// long length()
// boolean delete();
