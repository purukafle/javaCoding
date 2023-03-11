package importantCoding;

public class TwoMaximumValueInArray {
	public static String getTwoLagestNum(int[]arr) {
		int largestA = arr[0];
	    int largestB = arr[0];
	    for(int i = 0; i < arr.length; i++){
	    	if(arr[i]>largestA) {
	    		largestA=arr[i];

            }
            if(arr[i] < largestA){
                largestB = arr[i];   
            }

    }
		return largestA +" "+largestB ;
		
		
		
	}

	public static void main(String[] args) {
		int[]arr=new int[] {5,2,3,10,15,30,20,18,29,40};
		System.out.println(getTwoLagestNum(arr));
		System.out.println();
		
		

	}

}
