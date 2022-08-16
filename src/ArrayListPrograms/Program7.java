package ArrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program7 
{
	   public static void main(String[] args) 
	   {
		      List L = new ArrayList();
		      L.add("P");
		      L.add("B");
		      L.add("C");
		      L.add("N");
		      L.add("E");
		      int index1 = L.indexOf("C");
		      int index2 = L.indexOf("Z");
		      if(index1 == -1)
		         System.out.println("The element C is not in the ArrayList");
		      else
		         System.out.println("The element C is in the ArrayList at index " + index1);
		      if(index2 == -1)
		         System.out.println("The element Z is not in the ArrayList");
		      else
		         System.out.println("The element Z is in the ArrayList at index " + index2);
		   }
		}