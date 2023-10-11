package oops;

import java.io.EOFException;
import java.io.IOException;

public class overrideexception {
    public static void main(String[] args) {
        
    }
}

class p{
    public void m1() throws Exception{

    }
}
class c extends p{
    public void m1() throws EOFException, InterruptedException , NullPointerException,ArithmeticException {
    }
}



//for other exception we must required to throws main exception 
//otherwise we can get compile time error like they can not override 