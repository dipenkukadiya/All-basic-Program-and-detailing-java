//case 1:

// package exception_program;
// public class null_pointer_exception {
//     static ArithmeticException e = new ArithmeticException();
//     public static void main(String[] args) {
//         throw e;
//     }
//     }

// output -->Exception in thread "main" java.lang.IllegalArgumentException: 0 > -1
//         at java.base/java.util.Arrays.copyOfRange(Arrays.java:3782)
//         at java.base/java.util.Arrays.copyOfRange(Arrays.java:3742)
//         at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:431)
//         at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:192)
//         at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:132)

// case 2:

package exception_program;

public class null_pointer_exception {
    static ArithmeticException e;

    public static void main(String[] args) {
        throw e;
    }
}

// nullPointer exception