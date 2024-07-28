import java.util.Scanner;

public class addingFunction {
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        System.out.println("Enter two numbers");
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("The sum of two digits are "+add(m,n));
    }

    
}
