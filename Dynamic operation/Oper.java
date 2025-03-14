import java.util.*;
public class Oper{
    public void add(int num1,int num2){
        int num3=num1+num2;
        System.out.println(num3);
    }
    public void sub(int num1,int num2){
        int num3=num1-num2;
        System.out.println(num3);
    }
    public void multiply(int num1,int num2){
        int num3=num1*num2;
        System.out.println(num3);
    }
    public void divide(int num1,int num2){
        int num3=num1/num2;
        System.out.println(num3);
    }
    public static void main(String args[]){
        int choice;
        Scanner sc=new Scanner(System.in);
        Oper obj=new Oper();
        System.out.println("Enter your choice:");
        choice=sc.nextInt();
        System.out.println("Enter num1:");
        int num1=sc.nextInt();
        System.out.println("Enter num2:");
        int num2=sc.nextInt();
        if(choice==1){
            obj.add(num1,num2);
        }
        else if(choice==2){
            obj.sub(num1,num2);
        }
        else if(choice==3){
            obj.multiply(num1,num2);
        }
        else if(choice==4){
            obj.divide(num1,num2);
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}