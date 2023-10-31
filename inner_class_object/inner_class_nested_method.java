package inner_class_object;

public class inner_class_nested_method {
    public void m1(){
        class inner{
            public void sum(int x, int y){
                System.out.println(x+y);
            }
        }
        inner in = new inner();
        in.sum(10, 20);
        in.sum(100, 200);
    }
    public static void main(String[] args) {
        inner_class_nested_method i = new inner_class_nested_method();
        i.m1();
    }
}
