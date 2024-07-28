import java.util.Scanner;

public class FactorialUsingFunction {
    public static int fact(int n)
    {
        int factorial=1;
        for(int i=n;i>=1;i--)
        {
            factorial= factorial*i;
        }
        return factorial;
    }
    public static void main(String args[])
    {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int result=sc.nextInt();
        System.out.println("The factorial of the number is "+fact(result));
    }
}
