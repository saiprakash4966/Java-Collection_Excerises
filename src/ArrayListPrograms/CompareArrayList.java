package ArrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayList
{  
	public static void main(String args[])  
	{  
	//first array list  
	ArrayList<String> firstList=new ArrayList<String>();  
	//adds elements to the array list  
	firstList.add("Lion");  
	firstList.add("Tiger");  
	firstList.add("Crocodile");  
	firstList.add("Monkey");  
	System.out.println(firstList); 
	
	//second array list      
	List<String> secondList=new ArrayList<String>();  
	//adds elements to the array list  
	secondList.add("Lion");  
	secondList.add("Tiger");  
	secondList.add("Crocodile");  
	secondList.add("Rabbit");  
	System.out.println(secondList);  
	//comparing both lists  
	boolean b = firstList.equals(secondList);  
	System.out.println(b);  
	 
	} 
	}  