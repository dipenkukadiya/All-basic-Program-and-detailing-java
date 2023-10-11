package oops;

public class static_block {
    

    static int i=10;
    static {
        m1();
        System.out.println("first static block");
    }
    public static void main(String[] args) {
        m1();
        System.out.println("main methode");
    }
    public static void m1() {
        System.out.println(j);
        
    }
    static {
        System.out.println("second static block");
    }
    static int j =20;
}



//1> identification of static member from top to bottom
//2> execution of static variable assignment and static block from top
//    to bottom
//3> execution of main method.


/* i=0{riwo}
 * j=0{riwo}
 * i=10{r&w}
 * j=20{rw&}
 */