import java.util.*;
public class Toll{
    public static void main(String  args[])
    {
        int car=100;
        double car2=car*0.1;
        double car3=car-car2;
        int truck=200;
        double truck2=truck*0.1;
        double truck3=truck-truck2;
        System.out.println("1.Car\n 2.truck");
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        System.out.println("Enter the Vechicle:");
        int i=sc.nextInt();
        if(i==1)
        {
            System.out.println("1.RFID\n 2.NO RFID:");
            int RFID=sc.nextInt();
            if(RFID==1){
                System.out.println("Toll Fee:"+car3);
                
                }
            else
            {
                System.out.println("Toll Fee:"+car);
            }
                
            }
         else if(i==2)
        {
            System.out.println("1.RFID\n 2.NO RFID:");
            int RFID=sc.nextInt();
            if(RFID==1){
                System.out.println("Toll Fee:"+truck3);
                
                }
            else
            {
                System.out.println("Toll Fee:"+truck);
            }
                
        }
        }}}