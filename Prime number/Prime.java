import java.util.*;
public class Prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        boolean prime=true;
        if(num<=1)
        {
            System.out.println("It is not a prime number");
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                 prime=false;
            }
        }
        if(prime){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
        }

    }