package javaCollections;

//linkedlist: used it you have a large number of insert or delete operations. 
//you have no idea how large your data is. 
//ARRAY: used it read operations need to be extremly fast. ,
//You require random access to array elements. 


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
 * Array lists manage arrays internally, traversing in array is very fast.
 * getting a particular item is very fast. ..position in memort in item 
 * 
 * [0][1][2][3][4]
 * 
 * if you're 
 * linkedlists consist of elements each elements has a reference to the previous and next element
 * [0]->[1]->[2] ... 
 * if you wanna add or remove  an item to the beginnig or middle of the list. USE LINKED LIST.
 * 
 * 
 * */


public class Linkedlistss {


		
		public static void main(String[] args)
		{
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			LinkedList<Integer> linkedList = new LinkedList<Integer>();
			//List<Integer> arrayList = new ArrayList<Integer>();
			//List<Integer> linkedList = new LinkedList<Integer>();
			
			doTimings("ArrayList",arrayList);
			doTimings("LinkedList",linkedList);
			 
		}
		
		
		private static void doTimings(String type,List<Integer> listt)
		{
			for (int i = 0; i<1E5; i++)
			{
				listt.add(i);
			}
			
			long start = System.currentTimeMillis();
			
			
			//ArrayList is faster thhan linked listt 
			
			for(int i=0;i<1E5;i++)
			{
				listt.add(i);
				
			}
			
			//add items to elsewhere in list
			
			/*
			for(int i=0;i<1E5;i++)
			{
				listt.add(0, i);
			}*/
			
			
			long end = System.currentTimeMillis();
			
			System.out.println("Time taken: " +(end-start) +" ms for " +type);
			
		}



}
