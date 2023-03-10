package reverseString;

public class RemoveMultipleWhiteSpaces {
	public void removeSpaces(String str) {
		//first way
		String noSpaceStr=str.replaceAll("\\s", "");//using build in method
		System.out.println(noSpaceStr);
		
		
	}
	//second way
	public void removeSpaces1(String string) {
		char[]strArray=string.toCharArray();
		StringBuffer strbuff=new StringBuffer();
		for(int i=0;i<strArray.length;i++) {
			if((strArray[i] !=' ') && (strArray[i]!='\t')){
				strbuff.append(strArray);
				
			}
		}
		
		String noSpaceStr1=strbuff.toString();
		System.out.println(noSpaceStr1);
	}
	public static void main(String[] args) {
		RemoveMultipleWhiteSpaces remove=new RemoveMultipleWhiteSpaces();
		remove.removeSpaces1("hello  don't stay  in the  reception more than    one people");
		
	}

}
