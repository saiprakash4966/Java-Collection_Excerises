package ArrayListPrograms;

import java.util.ArrayList;

public class TestEmptyOrNotArrayList 
{
    public static void main(String args[])
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(50);
        list.add(70);
        if(list.size()==0)
        {
            System.out.println("List is Empty");
            
        }
        else
            System.out.println("List is not Empty");
        
    }
    
	}
