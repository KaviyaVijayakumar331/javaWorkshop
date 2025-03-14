public class Method{
    public void add(int num1,int num2){
        int num3=num1+num2;
        System.out.println(num3);
    }
    public static void main(String args[])
    {
        Method obj=new Method();
        obj.add(20,30);
    }
}