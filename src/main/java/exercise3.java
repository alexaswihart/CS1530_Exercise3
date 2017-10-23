
import java.lang.Math;

public class exercise3 {
    public static void main(String[] args) {
        if(args.length != 1)
        {
            System.out.println("Error: must have 1 argument");
            System.exit(1);
        }
        
        int n = Integer.parseInt(args[0]);
        
        System.out.println("triangle(" + n + ") = " + triangle(n));
        System.out.println("lazyCaterer(" + n + ") = " + lazyCaterer(n));
            
    }
    
    public static int triangle(int n)
    {
        int i = 0;
        while(n > 0)
        {
            i = i + n;
            n--;
        }
        return i;
    }
    
    public static int lazyCaterer(int n)
    {
        return (int)(Math.pow(n, 2) + n + 2)/2;
    }
    
    
}