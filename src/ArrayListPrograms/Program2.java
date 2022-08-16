package ArrayListPrograms;

import java.util.ArrayList;

public class Program2 
{
	  public static void main(String[] args) {
		    // Creating an array list
		    ArrayList<String> names = new ArrayList<>();
		    names.add("Raghu");
		    names.add("Manoj");
		    names.add("Chandu");
		    System.out.println("ArrayList: " + names);

		    // Using for loop
		    System.out.println("Iterating over ArrayList using for loop: ");

		    for(int i = 0; i < names.size(); i++)
		    {
		      System.out.print(names.get(i));
		      System.out.print(", ");
		    }
		  }
		}
