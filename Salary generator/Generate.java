import java.util.*;
public class Generate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Profesion:");
        String Profesion=sc.nextLine();
        System.out.print("salary:");
        int salarys=sc.nextInt();
        if(Profesion.equals("developer")){
        double salary=salarys+salarys*0.1;
        System.out.println(salary);
    }
        else if(Profesion.equals("manager")){
            double salary=salarys+salarys*0.2;
            System.out.println(salary);
        }
            
        }
    }
