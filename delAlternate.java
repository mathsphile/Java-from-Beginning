// Given a string s as input. Delete the characters at odd indices of the string. Return the final string after deletion of characters at odd indices.

import java.util.Scanner;

public class delAlternate {
    public static void main(String args[])
    {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        for(int i=1;i<sb.length();i++)
        {
           sb.deleteCharAt(i);
        }
        System.out.println("Final String is "+sb.toString());
    
}
}
