package Demo;
import java.util.*;
public class Hashmap {
	public static void main(String[] args)
	{
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "soukhya");
        hash_map.put(2, "Neha");
        hash_map.put(3, "Riya");
        hash_map.put(5, "Siya");
        hash_map.put(7, "Diya");
  
    
        System.out.println("Initial Mappings are: " + hash_map);
  
      
        System.out.println("The Value is: " + hash_map.get(5));
  
        
        System.out.println("The Value is: " + hash_map.get(1));

	}

}
