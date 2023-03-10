package reverseString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListOfStringUsingCollections {
	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("Aman");
		list.add("Bimal");
		list.add("Suman");
		list.add("Janak");
		list.add("Rohan");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
