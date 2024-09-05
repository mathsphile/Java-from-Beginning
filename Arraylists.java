import java.util.ArrayList;
import java.util.Collections;

public class Arraylists {
    public static void main(String[] args) {
        // Creating new object of Arraylist
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add element in the ArrayLusts but all will be added in the last
        list.add(0);
        list.add(1);
        list.add(8);
        list.add(90);
        list.add(999);
        System.out.println("Our array list is "+list);

        //addin element in middle (index,element) but no element will be modified 
        list.add(1,4);
        list.add(5,91);
        System.out.println("After adding element in middle "+list);

        //set element
        //an element will be modified bty another element using set element
        list.set(2,90);
        System.out.println("After setting element the new list is "+list);

        //remove element 
        //we can remove elemenrt from beginning or last or any where by pasing index number

        list.remove(5);
        list.remove(0);
        System.out.println("After removing element the new list is "+list);

        // finding size of the arrayList
        System.out.println("The size of the arrrayList is "+list.size());

        //trace the element

        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        //sort arrayList

        Collections.sort(list);
        System.out.println("After sorting the list is "+list);



    }
    
}
