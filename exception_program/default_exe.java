package exception_program;
class default_exe{
public static void main(String[] args) {
    dostuff();
    System.out.println(10/0);
}
public static void dostuff() {
    domorestuff();
    System.out.println("hi");

}
public static void domorestuff() {
    System.out.println("hello");
    
}


}
// Arithmathic exeception give bydefault