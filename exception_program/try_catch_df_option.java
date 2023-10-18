package exception_program;

public class try_catch_df_option {
    
    public static void main(String[] args) {
        
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println();
        }
    }
}
