import java.util.Scanner;

public class radixConversion {
    public static void main(String args[])
    {
        System.out.println("Enter the number in binary");
        Scanner sc=new Scanner(System.in);
        sc.useRadix(2);
        int x=sc.nextInt();
         System.out.println("The decimal value is "+x);
          System.out.println("Enter the number in Octal");
        Scanner oct=new Scanner(System.in);
        oct.useRadix(8);
        int y=oct.nextInt();
         System.out.println("The decimal value is "+y);
         System.out.println("Enter the number in hexa Decimal");
         Scanner hex = new Scanner(System.in);
         hex.useRadix(16);
         int z = hex.nextInt();
         System.out.println("The decimal value is " + z);


    }
    
}
