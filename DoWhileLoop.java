

public class DoWhileLoop {
    public static void main(String args[])
    {
        int i=0;
        System.out.println("The odd numbers between 0 to 10 are ");
        
        do
        {
          
            if(i%2!=0)
            {
                System.out.println(+i);
            }
            i++;
        }
        while(i<10);
    }
}
