package importantCoding;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	
public static void main(String[] args) {
	int []arr=new int[] {};
	List<Integer>list=new ArrayList<Integer>();
	list.add(2);
	list.add(3);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	list.add(8);
	list.add(9);
	System.out.println(list.toString());
	Set<Integer>set=new LinkedHashSet<Integer>(list);
	System.out.println(set);

	}

}
