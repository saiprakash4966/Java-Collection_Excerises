package ArrayListPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shuffle
{  
    public static void main(String[] args)
    {  
        List<String> list = Arrays.asList("P", "Q", "R", "S");  
            System.out.println("List before Shuffle : "+list);  
            
            Collections.shuffle(list);  
            System.out.println("List after shuffle : "+list);  
          }  
}  