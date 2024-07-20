import java.util.Scanner;

public class comparision {
    public static void main(String args[])
    {
        System.out.println("Enter two numbers");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println(a+ " is greater than " +b);
        }
        else if(a==b)
        {
            System.out.println(a+ " is equal to "+b );
        }
        else
        {
            System.out.println(b+ " is greater than "+a);
        }
    }
}
