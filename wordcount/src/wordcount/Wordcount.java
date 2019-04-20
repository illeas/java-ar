package wordcount;

import java.io.FileReader;
import java.util.StringTokenizer;

public class Wordcount 
{
    public static void main(String[] args)
    {
        String fcon = "";
        int wc = 0;
        
        try
        {
            FileReader fr = new FileReader("abc.txt");  
            int i;  
            while((i = fr.read()) != -1)
            {				
                fcon += ""+(char)i;  
            }
            fr.close(); 
        }
        catch(Exception err)
        {
            
        }
        
        StringTokenizer st = new StringTokenizer(fcon);
        while(st.hasMoreTokens())
        {
            wc++;
            st.nextToken();
        }
        
        System.out.println("Total word : "+wc);       
    }    
}