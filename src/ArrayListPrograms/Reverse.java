package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse 
{  
    public static void main(String[] args)
    {  
        List<String> l = new ArrayList<String>(); 
        l.add("Grape");  
        l.add("Banana");  
        l.add("Mango");  
        l.add("Apple"); 
        System.out.println("Before Reverse");  
        System.out.println(l.toString());  
          
        Collections.reverse(l);  
        System.out.println("After Reverse");  
        System.out.println(l);  
    }  
}  
