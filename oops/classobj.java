package oops;

public class classobj {
    public static void main(String[] args) {
        System.out.println("class object");
        hello   = new hello();

    }

    void dipen(){
        int number = 10;
    }

}

class hello extends classobj {

    hello() {
        System.out.println("use parent clasd");
    }

}