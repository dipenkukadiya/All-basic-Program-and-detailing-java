package exception_program;

public class try_catch_df_option {

    public static void main(String[] args) {

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
    }
}
// the way of handling an exception is varied from
// exception to exception. hence, every exception type is highly recommnded to
// take seprate catch block that is try with multiple catch block is always
// possible and recomnded to use