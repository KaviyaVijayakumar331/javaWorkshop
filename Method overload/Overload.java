public class Overload{
        void add(int a,int b){
            System.out.println("Addition of two numbers:"+(a+b));
        }
        void add(int a,int b,int c){
            System.out.println("Addition of three numbers:"+(a+b+c));
        }
            public static void main(String args[]){
                Overload obj=new Overload();
                obj.add(10,20);
                obj.add(10,20,40);
        }
    }


