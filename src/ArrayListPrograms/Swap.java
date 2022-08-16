package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class Swap{
 
    public static void main(String a[])
    {
 
        // Create the Array List
        ArrayList<String> ArrList = new ArrayList<String>();
 
        // add the values in Array List
        ArrList.add("Sai");
        ArrList.add("Venky");
        ArrList.add("Nag");
        ArrList.add("Manu");
        ArrList.add("Samrat");
 
        // display Array List before swap
        System.out.println("Before Swap the ArrayList ");
        System.out.println(ArrList);
 
        // Swapping the elements at 1 and 2 indices
        Collections.swap(ArrList, 2, 3);
 
        // display Array List after swap
        System.out.println("After Swap the ArrayList");
        System.out.println(ArrList);
    }
}