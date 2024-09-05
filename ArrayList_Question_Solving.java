//1.Add Elements: Write a Java program to add 10 random numbers to an ArrayList, and print the list.
import java.util.ArrayList;
import  java.util.Scanner;
import java.util.Collections;

public class ArrayList_Question_Solving {
    public static void main(String[] args) {
        //solving question number 1.
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter 10 int value in an ArrayList");
       

        for(int i=0;i<10;i++)
        {
            int n = sc.nextInt();
            list.add(n);
        }
        System.out.println("Entered list is "+list);
        
            
        
        
    }
}
