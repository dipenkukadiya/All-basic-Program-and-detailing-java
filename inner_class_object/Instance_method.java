package inner_class_object;

class  Instance_method {
    int x= 10;
    class InnerInstance_method {
        int x =100;
        public void m1() {
            int x=1000;
            System.out.println("inner class method");
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Instance_method.this.x);
        }
    }
        public static void main(String[] args) {
           new Instance_method().new InnerInstance_method().m1();
        }
    

}
