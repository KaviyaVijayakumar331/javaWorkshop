public class Cal{
    public int add(int num1,int num2){
        int num3=num1+num2;
        return num3;
    }
        public int sub(int num1,int num2){
            int num3=num1-num2;
            return num3;
        }
     public int multiply(int num1,int num2){
            int num3=num1*num2;
            return num3;
        }
        public int divide(int num1,int num2){
            int num3=num1/num2;
            return num3;
        }
    public static void main(String args[])
    {
       Cal obj=new Cal();
       int c= obj.add(10,30);
       int d=obj.sub(20,5); 
       int n=obj.multiply(5,7);
       int s=obj.divide(10,5);
       System.out.println(c);
       System.out.println(d);
       System.out.println(n);
       System.out.println(s);
    }
}