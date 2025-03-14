public class Build{
    public String Concatenator(String name,String name1){
        String name2=name+" "+name1;
        return name2;
    }
        public static void main(String args[])
        {
            Build obj=new Build();
            String x=obj.Concatenator("Jeslin","Golda");
            System.out.println(x);

        }
    
}

