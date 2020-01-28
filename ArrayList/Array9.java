package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
public class Array9 {
	    public static void main(String[] args) 
	    {
	        ArrayList<String> list = new ArrayList<>(Arrays.asList("anu", "anusha", "sree","bindu","murali","kavya","ramya","harry"));
	         
	        int firstIndex = list.indexOf("anusha");
	         
	        System.out.println(firstIndex);
	         
	        firstIndex = list.indexOf("murali");
	         
	        System.out.println(firstIndex);
	    }
	}


