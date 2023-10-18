package exception_program;

class try_catch {

    public static void main(String[] args) {
        System.out.println("statement 1");

        try {
            System.out.println(10 / 0);
            System.out.println("stt2");
        } catch (ArithmeticException e) {

            try{
                System.out.println(10 / 0);

                System.out.println("stt4");
            }
            catch(ArithmeticException a){
                System.out.println("hey");
            }
        }

        System.out.println("statement 3");
    }
}

/* try{ 
    risky code 
} 
catch(exception e){
    handling code
}*/