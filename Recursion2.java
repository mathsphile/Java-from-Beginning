//Print the sum of first n natural numbers
class Recur{
    public void printSum(int i, int n,int sum)
    {
        if(i==n)
        {
            sum=sum+i;
            System.out.println("the sum of first "+n+" natural numbers is "+sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
    }
}

public class Recursion2 {
    public static void main(String[] args) {
        Recur r=new Recur();
        r.printSum(1,10,0);
    }
    
}
