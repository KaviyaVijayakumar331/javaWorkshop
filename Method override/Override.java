class  parent{
    void display(){
        System.out.println("Hello");
    }
}
class Child{
    void display(){
        System.out.println("Home");
    }
}
public class Override{
    public static void main(String args[]){
        Child obj=new Child();
        obj.display();
    }
}



