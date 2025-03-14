class Parent{
    public void add(){
        System.out.println("Hello World");
    }
}
class Child extends Parent{
    void display(){
        add();
    }
}
class Third extends Parent{
    void helper(){
        add();
    }
}
public class Hier{
    public static void main(String args[]){
        Child obj1=new Child();
        obj1.add();
    Third obj=new Third();
    obj.helper();
    }
}