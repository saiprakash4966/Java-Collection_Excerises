package ArrayListPrograms;

import java.util.ArrayList;
import java.util.List;

public class Program3 {
	  public static void main(String[] args) {
		  // Create a list and add some colors to the list
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  // Print the list
		  System.out.println(list_Strings);
		  // Now insert a color at the first and last position of the list
		  list_Strings.add(0, "Voilet");
		  list_Strings.add(6, "Ash");
		  // Print the list
		  System.out.println(list_Strings);
		 }
		}
