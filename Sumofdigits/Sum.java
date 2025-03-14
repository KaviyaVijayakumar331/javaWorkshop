import java.util.*;
public class Sum{
    public static void main(String args[]){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n values:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i=0;
        int sum=0;
        while(i<n){
            System.out.print("Enter the value:");
            a[i]=sc.nextInt();
            i=i+1;
        }
        i=0;
            while(i<n)
            {
                sum=sum+a[i];
                i=i+1;

            }
            System.out.println("The sum is:"+sum);
        }

        
    }