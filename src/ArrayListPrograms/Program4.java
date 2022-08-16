package ArrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program4
{
	   public static void main(String args[]) throws Exception {
		      List list = new ArrayList();
		      list.add("Sai");
		      list.add("Prakash");
		      list.add("Manoj");
		      list.add("Sravan");
		      list.add("Raghu");
		      
		      System.out.println("The element at index 4 in the ArrayList is: " + list.get(4));
		   }
		}