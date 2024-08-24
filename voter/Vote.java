package voter;

class IsVoter
{
    int age;
    IsVoter(int age)
    {
        this.age=age;
    }
    public boolean isVoter()
    {
        if(this.age>=18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class Vote {
    public static void main(String[] args) {
        IsVoter voter1=new IsVoter(19);
        System.out.println(voter1.isVoter());
    }
}
