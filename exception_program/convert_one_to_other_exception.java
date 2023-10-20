package exception_program;

public class convert_one_to_other_exception {

    public static void main(String[] args) {
        try
        {
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            throw new NullPointerException();
        }
    }
    
}
