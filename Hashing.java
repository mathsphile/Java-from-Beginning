import java.util.*;
public class Hashing {
    public static void main(String args[])
    {
        HashMap<String,Integer> map=new HashMap<>();
        
        // Insertion Operation

        map.put("China",120);
        map.put("India",150);
        map.put("Indonesia",10);
        System.out.println(map);

        map.put("india",200);
        System.out.println(map);
        
        //Searching 

        if(map.containsKey("Nigeria"))
        {
            System.out.println("Key is present");
            System.out.println(map.get("China"));   // if key is presenyt .get() will return the value of that key
        }
        else{
            System.out.println("Key is not present");
        }

        //Iteration

        //for(int val : arr)
        for(Map.Entry<String,Integer> e: map.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }


    }
    
}
