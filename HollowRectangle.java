import java.util.Scanner;

public class HollowRectangle {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of rows");
      int n = sc.nextInt();
      System.out.println("Enter the number of star in each row");
      int m = sc.nextInt();
       
       
    for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
             if(i==1|| i==n || j==m|| j==1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
             
            }
            System.out.println();
    }
    
    }
}

