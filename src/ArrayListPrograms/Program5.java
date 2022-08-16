package ArrayListPrograms;

import java.util.ArrayList;

public class Program5 
{
    public static void main(String[] args)
    {
        ArrayList<String> mobiles = new ArrayList<String>();
        mobiles.add("MI");
        mobiles.add("OPPO");
        mobiles.add("VIVO");
         
        //update element of arraylist
        mobiles.set(1, "Reliance");
         
        for(String mobile: mobiles) {
            System.out.println(mobile);
        }
    }
}