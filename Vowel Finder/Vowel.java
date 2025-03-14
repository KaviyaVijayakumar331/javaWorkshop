import java.util.*;
public class Vowel{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter alphabets:");
        String alph=sc.nextLine();
        String arr[]={"a","e","i","o","u"};
        int i=0;
        int n=arr.length-1;
        int detect=0;
        while(i<=n)
        {
            if(alph.equals(arr[i]))
            {
                detect=1;
            }
    
                i=i+1;
        }
        if(detect==1){
            System.out.println("It is vowel");
        }
        else{
            System.out.println("It is Consonent");
        }
    }
}