package SeleniumLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		
		int[] arr2 = {1,2,4,5,6,7,8,9,10,122};
		for (int i=0; i<arr2.length; i++) {
			if(arr2[i] % 2 ==0) {
				System.out.println(arr2[i]);
				break;
			}
			else {
				System.out.println(arr2[i]+" is not multiple of 2");
			}
		}
		
		
	    int[] number = {1, 2, 3, 4, 5};
	    System.out.println("First no of an array is " + number[0]);
	    System.out.println("Last no of an array is " + number[number.length - 1]);
	    System.out.println("Total no of element in an array is " + number.length);
	    for (int i = number.length - 1; i >= 0; i--) {
	        System.out.println(number[i]);
	    }
	    
	    ArrayList<String> a = new ArrayList<String>();//new is for memory allocation, ArrayList is class
	    a.add("roshan");
	    a.add("padmane");
	    a.add("vidya");
	    a.add("nagar");
	    a.remove(1);
	    System.out.println(a.get(2));
	    for(int i=0; i<a.size(); i++) {
	    	 System.out.println(a.get(i));
	    }
	    System.out.println("*****************");
		for(String val:a) {
			System.out.println(val);	
		}
		System.out.println(a.contains("roshan"));
		
		//Convert simple array to array list
		String[] names = {"rahul", "sahil", "mayur", "akshay", "roshan"};
		List<String>nameArrayList = Arrays.asList("names");
		System.out.println(nameArrayList.contains("sahil"));
		
		System.out.println("Post Jira 4");
		
		System.out.println("develop branch changes2");

	}

}
