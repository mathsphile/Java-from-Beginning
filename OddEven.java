import java.util.Scanner;
public  class OddEven{
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("It is an even number");
        }
        else
        {
            System.out.println("The number is an odd");
        }
    }
    
}
