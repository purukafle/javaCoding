package importantCoding;

import java.util.HashMap;
import java.util.Scanner;

public class CountWords {
	public void countWords(String word) {
		//split words
		String[] split=word.split(" ");
		HashMap<String, Integer>map=new HashMap<String, Integer>();
		for(int i=0;i<split.length;i++){
			if(map.containsKey(split[i])) {
				int count=map.get(split[i]);
				map.put(split[i], count +1);
			}
			else {
				map.put(split[i], 1);
			}
			
		}
		
		System.out.println(map);
	}
	static void wordcount(String string)  
    {  
      int count=0;  
  
        char ch[]= new char[string.length()];     
        for(int i=0;i<string.length();i++)  
        {  
            ch[i]= string.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
       System.out.println(string+"has: "+count);
    }  
	public static void main(String[] args) {
		
		CountWords count=new CountWords();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string: ");
		count.countWords(scan.nextLine());
		System.out.println("enter words");
		wordcount(scan.nextLine());
		scan.close();
	}

}
