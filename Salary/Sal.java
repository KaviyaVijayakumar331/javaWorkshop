import java.util.*;
class Employee
{
    int calculateSalary()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary:");
        int basesalary=sc.nextInt();
        return basesalary; 
    }
}
    class Manager extends Employee
    {
        void salary1(){
            int basesalary=calculateSalary();
            double salary=basesalary+basesalary*0.2;
            System.out.println("The salary is:"+salary);
        }
        
    }
    class Developer extends Employee
    {
        void salary2(){
            int basesalary=calculateSalary();
            double salary2=basesalary+basesalary*0.1;
            System.out.println("The salary is:"+salary2);
        }
        
    }
    public class Sal{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("\n1.Developer\n2.Manager");
        System.out.println("Enter the choice:");
        int i=sc.nextInt();
        if(i==1)
        {
        Manager man=new Manager();
        man.salary1();
        }
        else if(i==2)
        {
        Developer b=new Developer();
        b.salary2();
        }
        }
    }
    }