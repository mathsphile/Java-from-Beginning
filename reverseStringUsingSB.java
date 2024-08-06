import java.util.Scanner;

class reverseStringUsingSB {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<str.length()/2;i++)
        {
            int front =i;
            int end=str.length()-1-i;
            char frontChar=sb.charAt(front);
            char endChar=sb.charAt(end);
            sb.setCharAt(front,endChar);
            sb.setCharAt(end, frontChar);
        }
        System.out.println("Reversed String is  "+sb );

       
    }
    
}
