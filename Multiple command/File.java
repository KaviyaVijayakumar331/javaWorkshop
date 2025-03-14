public class File{
    /*
    1)add method
    2)printout the value of that method
    */
    public void add(int x,int y){
        int z=x+y;//
        System.out.println(z);
    }
    public static void main(String args[]){
        int x=10;
        int y=20;
        File obj=new File();
        obj.add(x,y);

    }
}