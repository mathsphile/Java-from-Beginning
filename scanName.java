import java.util.Scanner;

public class scanName {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("May I know your name please");
        String name;
        name=s.nextLine();
        System.out.println("Hello "+name);
    }
    
}
