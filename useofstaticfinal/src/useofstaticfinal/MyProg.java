package useofstaticfinal;

public class MyProg extends Lion
{
    static int x = 10;
    
    public static class Tiger
    {
        int y;
        
    }
    
    @Override
    public void show()
    {
        
    }
       
    public static void main(String[] args) 
    {
        MyProg xyz = new MyProg();
        MyProg pqr = new MyProg();
        
        xyz.x = 9;
        pqr.x = 8;
        
        System.out.println(xyz.x);
        System.out.println(pqr.x);
    }    
}
