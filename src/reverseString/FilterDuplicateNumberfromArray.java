package reverseString;

import java.util.HashSet;
import java.util.Set;

public class FilterDuplicateNumberfromArray {
	public static void main(String[] args) {
		int[]array= {1,2,3,4,5,6,3,4,7,8,9,1};
		Set<Integer>set=new HashSet<>();
		for(int i=0;i<array.length;i++) {
			set.add(array[i]);
		}
		System.out.println(set);
	}

}
