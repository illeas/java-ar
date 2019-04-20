package crwrite;

import java.io.FileWriter;

public class Crwrite 
{
    public static void main(String[] args) 
    {
        try
        {  
            FileWriter fw = new FileWriter("abc.txt");  
            String s = "I am Shahriar";
			fw.write(s);  
            fw.close();  
        }
        catch(Exception e)
        {
        
        }        
    }  
}    