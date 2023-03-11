package importantCoding;

import java.util.LinkedHashMap;

public class LongestSubstringWithNoduplicateChar {
	public static void longestSubstring(String inputString) {
		//convert inputString to charArray
		char[]charArray=inputString.toCharArray();
		//initialization
		String longestSubstring=null;
		int longestSubstringLength=0;
		//create LinkedHashMap with characters as keys and their position as values.
		LinkedHashMap<Character,Integer>charPosMap=new LinkedHashMap<Character,Integer>();
		//iterating through charArray
		for(int i=0;i<charArray.length;i++) {
			char ch=charArray[i];
			//if ch is not present in charPosmap, adding ch into charPosMap along with its position
			if(!charPosMap.containsKey(ch)) {
				charPosMap.put(ch, i);
			}
			//if ch is already present in charPosMap, repositioning the cursor to the position of ch and
			else {
				i=charPosMap.get(ch);
				charPosMap.clear();
			}
			//updating longestSubstring and longestSubString length
			if(charPosMap.size()>longestSubstringLength) {
				longestSubstringLength=charPosMap.size();
				longestSubstring=charPosMap.keySet().toString();
			}
		}
		System.out.println("Input String: "+inputString);
		System.out.println("The Longest subString : "+longestSubstring);
		System.out.println("The Longest substring Length : "+longestSubstringLength);
	}
	public static void main(String[] args) {
		longestSubstring("applebanna");
		
		
	}

}
