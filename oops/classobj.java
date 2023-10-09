package oops;

public class classobj {
    public static void main(String[] args) {
        System.out.println("class object");
        hello h1 = new hello();

    }

}

class hello extends classobj {

    hello() {
        System.out.println("sadasda");
    }

}