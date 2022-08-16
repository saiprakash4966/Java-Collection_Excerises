package ArrayListPrograms;

import java.util.ArrayList;

public class CloneArray 
{
 
    public static void main(String a[])
    {
 
        // create ArrayList
        ArrayList<String> ArrList1
            = new ArrayList<String>();
 
        // Insert elements in ArrayList
        ArrList1.add("Mahesh");
        ArrList1.add("Rajesh");
        ArrList1.add("Sureh");
        ArrList1.add("Manu");
 
        // print ArrayList1
        System.out.println("Original ArrayList = "
                           + ArrList1);
 
        // clone ArrayList
        ArrayList ArrList2
            = (ArrayList)ArrList1.clone();
 
        // print ArrayList2
        System.out.println("Clone ArrayList2 = "
                           + ArrList2);
    }
}