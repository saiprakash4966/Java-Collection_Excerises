package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program8 
{
	  public static void main(String[] args)
	  {
		  // Create a list and add some colors to the list
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Sai");
		  list_Strings.add("Shivani");
		  list_Strings.add("Kalyani");
		  list_Strings.add("Raghu");
		  list_Strings.add("Manoj");
		  
		  System.out.println("List before sort: "+list_Strings);
		  Collections.sort(list_Strings);
		  System.out.println("List after sort: "+list_Strings);    
		 }
		}