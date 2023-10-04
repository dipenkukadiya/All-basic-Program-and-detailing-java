package constuctor;

class person {
    String name;
    int age;

    public static void main(String[] args) {
        System.out.println("this one first");
        student s = new student("dipen", 12, 1, 100);
    }

    public person(String name, int age) {
        System.out.println("hello dipen");
        this.name = name;
        this.age = age;
    }

}

public class student extends person {
    int rollno;
    int marks;
    

    public student(String name, int age, int rollno, int marks) {
        super(name, age);
        System.out.println(".................");
        this.age = age;
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
        System.out.println(name);
        System.out.println(age);
        System.out.println(rollno);
        System.out.println(marks);

    }

}