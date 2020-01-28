package ArrayList;
import java.util.ArrayList;
public class Array2 {

		public static void main(String[]args) {
			ArrayList<String> list1=new ArrayList<>();
			list1.add("Janardhana");
			list1.add("Anusha");
			list1.add("Singh");
			list1.add("Anu");
			list1.add("Ammu");
			ArrayList<String> list2=new ArrayList<>();
			list2.add("Anii");
			list1.addAll(list2);
			list1.remove("Anu");
			System.out.println(list1);
			
			
		}

	}