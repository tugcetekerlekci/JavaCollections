package javaCollections;


import java.util.ArrayList;

public class App {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>(500);
		//adding 
		numbers.add(34);
		numbers.add(100);
		numbers.add(1002);
		
		//retrieving
		//System.out.println(numbers.get(0));
		System.out.println("\n 1st Iteration ");
		//indexed for loop iteration
		for(int i=0; i<numbers.size() ; i++)
		{
			
				System.out.println(numbers.get(i));
		}
		
		//removing Items: be careful
		
				numbers.remove(numbers.size()-1);
				
				//remove first element is very slow!
				numbers.remove(0);
		
		
		System.out.println("\n 2nd Iteration ");
		
		for(Integer value:numbers)
		{
			System.out.println(value);
		}
		
		//List interface: 
		//List<String> values =new ArrayList<String>();
		
	}

}
