import java.util.*;
public class linearSearchInTwoDArray {
    public static void inputArray(int arr[][],int row, int col)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();

            }
        }
    }
    public static void printArray(int arr[][],int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows in an array");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns in an array");
        int cols=sc.nextInt();
        int array[][]=new int[rows][cols];
        
        System.out.println("Enter array elements ");
        inputArray(array, rows, cols);
        
        System.out.println("The entered array is ");
        printArray(array, rows, cols);
        System.out.println("Enetr the number youre finding");
        int el=sc.nextInt();
        boolean found =false;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(array[i][j]==el)
                {

                    found=true;
                    System.out.println("Element is present at index ("+(i+1)+","+(j+1)+")");

                    break;
                }
            }
                if(found)
                {
                    break;   // if el is found then have to break from outer loop also
                }
                
        }
        
        if(!found)
        {
            System.out.println("Entered element is not found");
        }
    }
}
