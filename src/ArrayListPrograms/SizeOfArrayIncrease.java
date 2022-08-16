package ArrayListPrograms;

import java.util.ArrayList;

public class SizeOfArrayIncrease
{
  public static void main(String[] args) 
  {
          ArrayList<String> c1= new ArrayList<String>(3);
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          System.out.println("Original array list: " + c1);
          
          //Increase capacity to 6
          c1.ensureCapacity(5);
          c1.add("White");
          c1.add("Pink");
          
          System.out.println("New array list: " + c1);
   }
}