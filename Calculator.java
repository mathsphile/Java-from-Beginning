import java.util.Scanner;

public class Calculator {
    public static void main(String args[])
    {
        System.out.println("Enter two numbers");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Select operation \n.1.addition\n2:Subtraction\n3:Multiplication\n4:Division");
        int op=sc.nextInt();
        switch(op)
        {
            case 1: int c=a+b;
                   System.out.println("The addition of two numbers are "+c);
                   break;
            case 2: int d=a-b;
                    System.out.println("The difference between two numbers are "+d);
                    break;
            case 3:int mul=a*b;
                   System.out.println("The mul of two numbers is "+mul);
                   break;
            case 4:int div=a/b;
                      System.out.println("The quoitient is "+div);
                   break;
            default:System.out.println("You have entered wrong choice");

        }
    }
}
