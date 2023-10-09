// with use of constuctor and super keyword 

abstract class absprec {
    String name;
    int age;

   
    public static void main(String[] args) {
        
        student s1 = new student("hi am", 21, 2, 100);
        teacher t1 = new teacher("hi who i am", 34, 230000, "science");

        System.out.println(t1.salary);
        System.out.println(s1.name);
    }
     absprec(String name, int age){
        this.name=name;
        this.age=age;
    }

}

class student extends absprec {
    int rollno;
    int marks;

    student(String name, int age, int rollno, int marks) {
        super( name,age);
     
        this.rollno =   rollno;
        this.marks = marks;
    }

}

class teacher extends absprec {
    double salary;
    String subject;

    teacher(String name, int age, double salary, String subject) {
        super(name, age);
        this.salary = salary;
        this.subject = subject;

    }

}
