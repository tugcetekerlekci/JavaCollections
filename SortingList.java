package javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Person1
{
	private int id;
	private String name;
	public Person1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person1 [id=" + id + ", name=" + name + "]";
	}
	
}

class ReverseAlphabeticalComparator implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		
		return -s1.compareTo(s2);
	}
	

}



class AlphabeticalComparator implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2);
	}

	

}

class StringLengthComparator implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		
		// if s1 == s2 return 0 
		//if s1>s2 return 1
		//if s1<s2 return -1 
		
		int len1= s1.length();
		int len2 = s2.length();
		
		if(len1 >len2)
		{
			return 1;
		}
		
		
		else if(len1 <len2)
		{
			return -1;
		}
		
		
		return 0;
	}
	

}



public class SortingList {
	
	public static void main(String args[])
	{
		/////////Sorting Strings///////////////////////
		
		
		
		
		List<String> animals = new ArrayList<String>();
		
		
		animals.add("cat");
		animals.add("elephant");
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("mongoose");
		
		//Collections.sort(animals,new StringLengthComparator());
		
		//Collections.sort(animals,new AlphabeticalComparator());
		
		Collections.sort(animals,new ReverseAlphabeticalComparator());
		
		System.out.println(animals);
		
		/////////Sorting Numbers ///////////////////////
		List<Integer> number = new ArrayList<Integer>();
		number.add(3);
		number.add(34);
		number.add(56);
		number.add(21);
		number.add(13);
		Collections.sort(number, new Comparator<Integer>()
		{
			public int compare(Integer num1, Integer num2)
			{
				return -num1.compareTo(num2);
			}
			
			
			
		});
	
		System.out.println(number);
		
		//// SORTING ARBITRARY NUMBERS ///////////////////////
		
		List<Person1> people = new ArrayList<Person1>();
		
		people.add(new Person1(4,"Chandler"));
		people.add(new Person1(3,"Ross"));
		people.add(new Person1(1,"Joey"));
		people.add(new Person1(2,"Rachel"));
		
		
		
		
		//do not work because do not have any natural order. 
		//Comparing to alphabetical order according to ID; 
		
		Collections.sort(people,new Comparator<Person1>(){
			
			public int compare(Person1 p1,Person1 p2)
			{
				if(p1.getId()> p2.getId()){
					return 1;
					
				}
				else if (p1.getId()<p2.getId())
				{
					return -1;
				}
				return 0;
				
				
			}
			
		});
		
		//Compraring to alphabetical order for name
		Collections.sort(people,new Comparator<Person1>(){
			
			public int compare(Person1 p1,Person1 p2)
			{
				return p1.getName().compareTo(p2.getName());
				
				
			}
			
		});
		
		
		for(Person1 Person1:people)
		{
			System.out.println(Person1);
		}
				
	
		
		}
		
		

}
