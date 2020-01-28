package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
 
public class Array8 {
	
	
	    public static void main(String[] args) 
	    {
	        ArrayList<String> list = new ArrayList<>(Arrays.asList("anusha", "singh", "ammu", "anu"));
	         
	        String firstName = list.get(0);         //anusha
	        String secondName = list.get(1);        //singh
	         
	        System.out.println(firstName);
	        System.out.println(secondName);
	    }
	}

