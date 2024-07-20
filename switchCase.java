import java.util.Scanner;

public class switchCase {
    public static void main(String args[])
    {
        System.out.println("press Button \n1. for French\n2: for Hindi \n3: for English");
        Scanner sc=new Scanner(System.in);
        int btn=sc.nextInt();
        switch(btn)
        {
            case 1: System.out.println("Bojour");
                    break;
            case 2: System.out.println("Namaste");
                    break;
            case 3: System.out.println("Hello");
                    break;
            default:System.out.println("You have entered wrong choice");
        }
    }
}
