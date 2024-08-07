import java.util.Scanner;
// Bit manipulation
//four kinds of bit manipulation. 1.get 2.set 3. clear 4.update
public class BitManipulation {
    public static void main(String args[])
    {

        // get bit 

        int n=5; //decimal value 0101
        int pos=2; // here value of i is 2 i.e 1
        int BitMask=1<<pos;  //  0001 then left shift by 2 i.e. 0100
        if((BitMask & n)==0)
        {
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was 1");
        }

        //Set bit i.e. if in the given position bit is 0 then change it to 1
        int m=5;   // 0101
        int position=1;
        int BitM=1<<position;   //BitM=0010
        int newNumber=BitM | m;  //new number = 0110 =7
        System.out.println("The new number is "+newNumber);

        // Clear bit i.e. if in the given position bit is 1 then change it to 0
        int N =5; //0101
        int POS=2;
        int BITMASK=1<<POS; //0100
        int NOTBITMASK=~(BITMASK);  // 1011
        int NEWNUMBER=NOTBITMASK & N; // 0001
        System.out.println("New Number "+NEWNUMBER);

        //update bit  if there is 0 in given position then change it to 1

        int M=5;
        int POSITION=1;
        int BM=1<<POSITION;
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        if (oper == 1) {
            // set
            int newN = BM | n;
            System.out.println(newNumber);  //7
        } else {
            // clear
            int newBitMask = ~(BM);
            int newN = newBitMask & n;
            System.out.println(newNumber); //
        }





    }
    
}
