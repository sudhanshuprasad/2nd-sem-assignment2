interface A{
    void display();
    void count();
}

class B implements A{
    static  int maxcount;
    String name;
    B(String name){
        this.name=name;
    }
    public void display(){
        System.out.println("name is "+name);
    }
    public void count(){
        maxcount=name.length();
        System.out.println("length is "+maxcount);
    }
}

public class Q7 {
    public static void main(String[] args) {
        A a=new B("sudhanshu");
        a.display();
        a.count();
    }
}
