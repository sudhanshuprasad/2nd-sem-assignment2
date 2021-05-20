import java.util.Scanner;
class complex{
    double real,img;
    void setData() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real and imaginary part ");
        real=sc.nextDouble();
        img=sc.nextDouble();
    }
    void display() {
        System.out.println(real+" + "+img+"i");
    }
    void add(complex c,complex c1) {
        complex c2=new complex();
        c2.real=c.real+c1.real;
        c2.img=c.img+c1.img;
        System.out.println("Sum is "+c2.real+" + "+c2.img+"i");
    }
}
public class Q2 {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        complex c=new complex();
        complex c1=new complex();
        c.setData();
        c.display();
        c1.setData();
        c1.display();
        c1.add(c, c1);
    }
}