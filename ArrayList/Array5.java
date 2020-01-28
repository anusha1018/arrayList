package ArrayList;
import java.util.*;
public class Array5 {
	
	
	    public static void main(String[] args) 
	    {
	        ArrayList<String> list = new ArrayList<>();
	         
	        list.add("A");
	        list.add("B");
	        list.add("C");
	        list.add("D");
	         
	        System.out.println( list.contains("A") );       //true
	         
	        System.out.println( list.contains("Z") );       //false
	    }
	}


