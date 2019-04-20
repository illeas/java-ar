package findingfactorial;

import java.util.Scanner;

public class FindingFactorial 
{
    public int factorial(int x)
    {
        int fact = 1;
        
        for(int i = x; i > 0; i--)
            fact *= i;
        
        return fact;
    }
    
    public static void main(String[] args)
    {
        int result, n;
        
        Scanner tiger = new Scanner(System.in);        
        n = tiger.nextInt();         
        
        FindingFactorial xyz = new FindingFactorial();
        
        result = xyz.factorial(n);
        System.out.println(result);        
    }    
}