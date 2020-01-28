package ArrayList;
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.*;
 
public class Array7 {
	
	
	    public static void main(String[] args) throws CloneNotSupportedException 
	    {
	        ArrayList<String> names = new ArrayList<>(Arrays.asList("A","B","C","D")); 
	         
	       names.forEach(name -> printString(name));
	    }
	     
	    private static void printString(String str) {
	        System.out.println(str.toLowerCase());
	    }
	}

