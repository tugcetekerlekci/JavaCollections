package javaCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class UsingIterators {
	
	public static void main(String[] args)
	{
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("fog");
		animals.add("cat");
		animals.add("dog");
		animals.add("rabbit");
		
		Iterator<String> it = animals.iterator();
		
		while(it.hasNext())
		{
			String anima = it.next();
			System.out.println(anima);
			if(anima.equals("cat"))
			{
				it.remove();
			}
			
		}
		System.out.println();
		
		//Modern Iteration,post Java5 and later 
		for(String animal:animals)
		{
			System.out.println(animal);
		}
		
		
		
		
	}

}
