import java.util.*;
public class HashingHM{
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
        //insertion
        map.put("India",120);
        map.put("China",150);
        map.put("US",30);
        //printing the map
        System.out.println(map);
        //Updating
        map.put("China",180);
        System.out.println(map);
        //Searching
        if(map.containsKey("Indonesia")){
            System.out.println("Key exists in hash map");
        }
        else{
            System.out.println("Key doesnt exist in hash map");
        }
        //Iterating in arrays
        int arr[] = {12,15,18};
        for(int val : arr){
            System.out.println(val);
        }
        //Itertaing in HashMaps
        //for(int val : arr)
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey());
            System.out.println(" "+e.getValue());

        }
        //Creating a set of keys
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }
        //Removing keys
        map.remove("China");
        System.out.println(map);
        
    }
}