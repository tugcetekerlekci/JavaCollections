package javaCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class SortedMaps {
	
	public static void main(String[] args)
	{
		//keys and values does not maintain order.
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		//Map<Integer,String> hashMap = new HashMap<Integer,String>(); you can use it like that
		LinkedHashMap<Integer,String> linkedHashmap = new LinkedHashMap<Integer,String>();
		
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
		
		//testMap(hashMap); // does not guarantee the order
		
		
		testMap(linkedHashmap); //maintains the order you put things in 
		
		testMap(treeMap); //maintains the natural order...
		
		
		

	}

	
	public static void testMap(Map<Integer,String> map)
	{
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "giraffe");
		map.put(1, "dog");
		map.put(0, "snake");
		map.put(15, "bear");
		map.put(6, "alligator");
		
		for(Integer key: map.keySet())
		{
			String value = map.get(key);
			System.out.println(key + ": " + value);
		
		}
	
	}
	
}
