package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class delEl {
    public static void main(String[] args) {
        //solving question2. Create a Java method that takes an ArrayList of integers and a value to delete all occurrences of that value from the list.
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 int value in an ArrayList");
        for(int i=0;i<10;i++)
        {
            int n = sc.nextInt();
            list.add(n);
        }
        System.out.println("Enter the element you want to delete");
        int elementToDelete = sc.nextInt();

        // Remove all occurrences of the element
        // while (list.contains(elementToDelete)) {
        //     list.remove((Integer) elementToDelete);
        //if you don't want to use loop then go for it
           list.removeIf(n -> n == elementToDelete);
        

        System.out.println("The list after deleting  " + elementToDelete + " is " + list);



    }
    
}
