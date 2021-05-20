package Q3;

public class Student {
    int roll;
    String name,course;
    void input_Student(int roll,String name,String course) {
        this.roll=roll;
        this.name=name;
        this.course=course;
    }
    void display_students() {
        System.out.println("Name "+name+"\nroll "+roll+"\ncourse "+course);
    }
}
class Exam extends Q5.Student {
    int mark1,mark2,mark3;
    void input_Marks(int m1,int m2,int m3) {
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }
    void display_Result() {
        super.display_students();System.out.println("Mark1: "+mark1+"\nMark2: "+mark2+"\nMark3:
                "+mark3);
    }
}
import java.util.Scanner;
public class A2Q3 {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Exam[] e=new Exam[5];
        for(int i=0;i<5;i++) {
            e[i]=new Exam();
            System.out.println("Enter student details: ");
            String name=sc.next();
            int roll=sc.nextInt();
            String course=sc.next();
            e[i].input_Student(roll,name,course);
            System.out.println("Enter marks");
            int m1=sc.nextInt(),m2=sc.nextInt(),m3=sc.nextInt();
            e[i].input_Marks(m1,m2,m3);e[i].display_Result();
        }
        sc.close();
    }
}