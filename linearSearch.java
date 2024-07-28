import java.util.Scanner;

public class linearSearch {
    public static void main(String args[])
    {
        System.out.println("The the size of an array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        System.out.println("Enetr the element you want to search");
        int el=sc.nextInt();
        boolean result=false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==el)
            {
                System.out.println("Entered element is present in address "+(i+1));
                result=true;
                break;
            }
        }
            if(!result)
            {
                System.out.println("Entered el is not found");
            }
            
           
        
        
    }
}
