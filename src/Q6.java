public class Q6 {

    abstract class shape{
        abstract void area();
    }

    class square extends shape{
        int a,b;
        void area(){
            System.out.println(a*b);
        }
    }

    public static void main(String[] args) {

    }
}
