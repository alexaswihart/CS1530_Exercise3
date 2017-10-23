import java.lang.math

public class exercise3 {
    public static void main(String[] args) {
        
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
        return (math.pow(n, 2) + n + 2)/2;
    }
    
    
}