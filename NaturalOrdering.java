package javaCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class NaturalOrdering {

	public static void main(String[] args)
	{
		//hashset does not retain order. 
		//
		//set is a kind of collection that stores only unique elements
		
		Set<String> set1 = new HashSet<String>();
		
		set1.add("dog");
		set1.add("cat");
		set1.add("fog");
		set1.add("fox");
		set1.add("snake");
		set1.add("alligator");
		set1.add("dog");
		
		System.out.println(set1);
		
		
		//linkedhas set remembers the order that you added items in
		Set<String> set2 = new LinkedHashSet<String>();
		
		set2.add("dog");
		set2.add("cat");
		set2.add("fog");
		set2.add("fox");
		set2.add("snake");
		set2.add("alligator");
		set2.add("dog");
		
		System.out.println(set2);
		
		//treeset: natural order:for string alphabetical order, for integer: numeric order
		//for doubles- also numericaly.
		
		Set<String> set3 = new TreeSet<String>();
		
		set3.add("dog");
		set3.add("cat");
		set3.add("fog");
		set3.add("fox");
		set3.add("snake");
		set3.add("alligator");
		set3.add("dog");
		
		System.out.println(set3);
		
		//accessing elements,,iterating
		for(String element: set1)
		{
			System.out.println(element);
		}
		
		//does set contain a given item? ///
		if(set1.contains("batu"))
		{
		System.out.println("contains batu");
		}
		
		if(set1.contains("dog"))
		{
		System.out.println("dog var");
		}
		
		//isEmpty... 
		if(!set1.isEmpty())
		{
			System.out.println("Dolu bu set");
		}
		
		
		
		//toArray - > returns the Arrat that includes all elements in the set. 
		
		//INTERSECTION::::::::::::::::Intersection :::: ///
		
Set<String> set4 = new TreeSet<String>();
		
		set4.add("doggy");
		set4.add("kitten");
		set4.add("giraffe");
		set4.add("fox");
		set4.add("snake");
		set4.add("alligator");
		
		Set<String> intersection = new HashSet<String>(set1); //make a copy of set1
		
		System.out.println(intersection);
		
		intersection.retainAll(set4); //get only the elements in intersection
		
		System.out.println(intersection);
		
		//::::::::::::::::DIFFERENCE::::::::::::::::::::::::::::::::::::::::: ///
		
		Set<String> difference = new HashSet<String>(set1);
		
		difference.removeAll(set4);
		//the elements that are not in set4 //////
		System.out.println(difference);
		
		
	}
	
	
	
	
}
