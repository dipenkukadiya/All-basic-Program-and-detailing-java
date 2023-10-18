package exception_program;

public class final_modifier {

    public static void main(String[] args) {
        try{

        }   
        
    }
}
// applicable for classes ,methods and variables
// finally is a block always associated with try catch
// maintain clean up code
/*
 * try{risky code }
 * catch(exception e){handling code}
 * finally{cleanup code}
 */


//  finally block is responsible to perform cleanup activity 
//  related to try block that is whatever resources we opened as a part of 
//  try block will bw closed inside finally block,
//  whereas, finalize method responsible to clean up activity related 
//  to object that is whatever resources associated with object deallocated 
//  before destroying object with using finalize  method. 