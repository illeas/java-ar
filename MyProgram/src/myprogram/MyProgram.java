package myprogram;

public class MyProgram extends Test
{
    public MyProgram()
    {
        System.out.println("1");
    }
    
    public MyProgram(int x)
    {
        System.out.println("2");
    }    
    
    public void hello(int x, String k)
    {
        System.out.println("3");
    }
    
    public void hello(String k, int x)
    {
        System.out.println("4");
    }
    
    @Override
    public void show()            
    {
        System.out.println("7");
    }
    
    public static void main(String[] king) 
    {
        MyProgram xyz = new MyProgram();
        xyz.hello(0, "ashiq");
        xyz.show();
    }    
}
