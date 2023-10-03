package constuctor;

public class student extends person {
    int rollno;
    int marks;

    public student(String name, int age , int rollno , int marks) {
        super(name, age);
        this.age=age;
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
        
    }
  
}