package Q5;

class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Student extends Person{
    int roll;
    String course;
    float marks;
    Student(String name,int age,int roll,String course,float marks){
        super(name,age);
        this.roll=roll;
        this.course=course;
        this.marks=marks;
    }void display() {
        System.out.println("Name: "+name+"\nAge: "+age+"\nRoll: "+roll+"\nCourse: "+course+"\nMarks: "+marks);
    }
}
class Teacher extends Person{
    String subject_assigned;
    int contact_hour;
    Teacher(String name,int age,String subject_assigned,int contact_hour){
        super(name,age);
        this.subject_assigned=subject_assigned;
        this.contact_hour=contact_hour;
    }
    void display() {
        System.out.println("Name "+name+"\nAge "+age+"\nSubject Assigned "+subject_assigned+"\ncontact_hour "+contact_hour);
    }
}
public class A2Q5 {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Student s=new Student("Anonymous",22,33,"DSA",23);s.display();
        System.out.println();
        Teacher t=new Teacher("NK",65,"UPM",8);
        t.display();
    }
}