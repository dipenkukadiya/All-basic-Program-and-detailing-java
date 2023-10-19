package exception_program;

public class throwss {

    public static void main(String[] args) {

        System.out.println(10 / 0);
        // output of this-->
        // //dipen@gtcsys-dipen:~/Dipenfiles/learning/exception_program$ java
        // throwss.java
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        throw new ArithmeticException("/ byyy zero");
        // output of this -->
        // dipen@gtcsys-dipen:~/Dipenfiles/learning/exception_program$ java
        // throwss.java
        // Exception in thread "main" java.lang.ArithmeticException: / byyy zero
    }
}
