//Print the Number from 10 to 1
class Recursion {
    public void printNumber(int n)
    {
        if (n==0)
        {
            return;
        }
        
    
    System.out.println(n);
    printNumber(n-1);
    }
}


public class Recursion1 {
    public static void main(String[] args) {
        Recursion r=new Recursion();
        r.printNumber(10);
    }
    
}
