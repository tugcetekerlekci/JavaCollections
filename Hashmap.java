package javaCollections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	
	
	
	//HASH MAP DOES NOT MAINTAIN ORDER.... 
	
	public static void main(String[] args)
	{
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(2, "two");
		
		//override your previous key. 
		map.put(6, "second key");
		
		//if you're retrieving the object that does not have key, returns null 
		String text= map.get(34);
		
		System.out.println(text);
		
		//iterating thru map
		for(Map.Entry<Integer, String> entry: map.entrySet())
		{
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key+ ": "+ value);
			
		}
		
		
		
		
		
		
		
	}

}
