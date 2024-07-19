import java.util.Scanner;

public class sum
    {
        public static void main(String args[])
        {
            Scanner s= new Scanner(System.in);
            int a,b,c;
            System.out.println("Enter two numbers");
            a=s.nextInt();
            b=s.nextInt();
            c=a+b;
            System.out.println("the Sum of two numbers is "+c);
            s.close();


        }
    }
    

