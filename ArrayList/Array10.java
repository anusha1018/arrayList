package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
public class Array10 {
	
	
	    public static void main(String[] args) 
	    {
	        ArrayList<String> list = new ArrayList<>(Arrays.asList("ammu", "ramsai", "january","birthday","godavarthi","rajamandry","introvert","lesson for life"));
	         
	        int lastIndex = list.lastIndexOf("ramsai");
	         
	        System.out.println(lastIndex);
	 
	        lastIndex = list.lastIndexOf("just go to hell");
	         
	        System.out.println(lastIndex);
	    }
	}


