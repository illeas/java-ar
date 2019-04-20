package crread;

import java.io.FileReader;

public class Crread 
{
    public static void main(String[] args) 
    {
        try
        {
            FileReader fr = new FileReader("abc.txt");  
            int i;  
            while((i = fr.read()) != -1)
			{				
                System.out.println((char)i);  
			}
            fr.close(); 
        }
        catch(Exception err)
        {
            
        }
    }    
}