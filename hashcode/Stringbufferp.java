package hashcode;

public class Stringbufferp {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer(1000);
        sb.append("hwy");
        StringBuffer sb1 = new StringBuffer("hey dipen");

        sb.append(67);
        sb1.insert(6, 23);
        sb.append(false);
            sb.trimToSize();
        System.out.println(sb.compareTo(sb1));
        System.out.println(sb1.compareTo(sb1));
        System.out.println(sb1.compareTo(sb));
        System.out.println(sb.capacity());
        System.out.println(sb.toString());
        System.out.println(sb1.charAt(6));
        System.out.println(sb1);

    }
}
