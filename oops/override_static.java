package oops;

public class override_static {
    
}
class p {
    public static void m1(){

    }
}
class c extends p{
    public static void m1(){

    }
}

//  m1 in c can not override m1 in p;
//coz overriding method is static
 // if both are static then its work like this program