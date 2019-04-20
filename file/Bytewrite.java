package bytewrite;

import java.io.FileOutputStream;

public class Bytewrite 
{
    public static void main(String[] args) 
    {
        try
        {  
            FileOutputStream fout = new FileOutputStream("abc.txt");  
            String s = "I am Shahriar";  
            byte b[] = s.getBytes();
            fout.write(b);  
            fout.close();          
        }
        catch(Exception e)
        {
            
        } 
    }    
}