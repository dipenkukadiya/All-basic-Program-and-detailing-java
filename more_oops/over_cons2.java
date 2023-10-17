package more_oops;

public class over_cons2 {
    static int i = 1;

    public static void main(String[] args) {

        m1();
        System.out.println("hello");

    }

    public static void m1() {
        System.out.println(i++);
        m2();
    }

    public static void m2() {
        m1();
    }

}

// function continue call each other so stackoverflow
// incase of constuctor

// class over_cons2{
// over_cons2(){
// this(10);             //hey call eachother and thats wht we got
                          // error like recursive constuctor invocaton
// }
// over_cons2(int i){
// this();
// }
// public static void main(String args[]){
// System.out.println("hello");
// }
// }