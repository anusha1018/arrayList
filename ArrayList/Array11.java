package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
 	
public class Array11 {
	
	    public static void main(String[] args) throws CloneNotSupportedException 
	    {
	        ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
	         
	        ListIterator<String> listItr = alphabets.listIterator();
	         
	        System.out.println(listItr.next());     //A
	        System.out.println(listItr.next());     //B
	         
	        listItr.add("E");       
	         
	        System.out.println(alphabets); //["A", "B", "E", "C", "D"]
	         
	        System.out.println(listItr.previous()); //E
	        System.out.println(listItr.next());     //E
	         
	        System.out.println(listItr.next());     //C
	         
	        listItr.remove();       
	         
	        System.out.println(alphabets); //["A", "B", "E", "D"]
	         
	        System.out.println(listItr.next());     //D
	    }
	}