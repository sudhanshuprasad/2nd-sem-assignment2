import java.util.Scanner;

interface EmpInterface{
    void displayEmp();
    void giveBonus(double amount);
}

abstract class Employee{
    int empId;
    String fname;
    String lname;
    double salary;
    Employee(int empId, String fname, String lname, double salary){
        this.empId=empId;
        this.fname=fname;
        this.lname=lname;
        this.salary=salary;
    }
}

class Manager extends Employee implements EmpInterface{
    double bonus;
    Manager(int empID, String fname, String lname, double salary){
        super(empID, fname, lname, salary);
    }
    public void displayEmp(){
        System.out.println("empid is "+empId);
        System.out.println("first name is "+empId);
        System.out.println("last name is "+empId);
    }
    public void giveBonus(double amount){
        bonus=amount;
        salary=salary+bonus;
        System.out.println("total salary is "+salary);
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        EmpInterface []e=new EmpInterface[2];
        int eID;
        String fname;
        String lname;
        double sal;
        double amt;
        for (int i=0; i<2; i++){
            System.out.println("empid: ");
            eID= sc.nextInt();
            System.out.println("first name: ");
            fname=sc.next();
            System.out.println("last name: ");
            lname=sc.next();
            System.out.println("salary: ");
            sal=sc.nextDouble();
            System.out.println("bonus: ");
            amt=sc.nextDouble();
            e[i]=new Manager(eID, fname, lname,sal);
            e[i].displayEmp();
            if(amt>0){
                e[i].giveBonus(amt);
            }else {
                System.out.println("invalid input");
            }
        }
    }
}
