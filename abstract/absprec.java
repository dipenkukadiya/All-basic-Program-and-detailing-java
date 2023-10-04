abstract class absprec {
    String name;
    int age;

    public static void main(String[] args) {
        student s1 = new student("hi am", 21, 2, 100);
        teacher t1 = new teacher("hi who i am", 34, 230000, "science");

        System.out.println(t1.salary);
        System.out.println(s1.marks);
    }

}

class student extends absprec {
    int rollno;
    int marks;

    student(String name, int age, int rollno, int marks) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
        this.marks = marks;
    }

}

class teacher extends absprec {
    double salary;
    String subject;

    teacher(String name, int age, double salary, String subject) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.subject = subject;

    }

}
