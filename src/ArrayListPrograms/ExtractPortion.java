package ArrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortion 
{
	  public static void main(String[] args) 
	  {
		  // Create a list and add some colors to the list
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  
		  System.out.println("Original list: " + list_Strings);
		  
		  List<String> sub_List = list_Strings.subList(0, 2);
		  System.out.println("List of first two elements: " + sub_List);
		 }
		}
