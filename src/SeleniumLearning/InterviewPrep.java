package SeleniumLearning;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InterviewPrep {
	public static void main(String[] args) {
		
//		String name = "Banglore";
//		for(int i=name.length()-1; i>=0; i--) {
//			System.out.print(name.charAt(i));
//			
//		}
		
		
		
//		String str = "Bangalore 1234";
//		String[] parts = str.split(" ");
//		
//		String word = parts[0];
//		String no = parts[1];
//		
//		String reverseno = new StringBuilder(no).reverse().toString();
//		
//		System.out.print(reverseno+" "+word);
		
		
		
//		int[] a= {1,2,3,4,5,};
//		int largest = a[0];
//		
//		for(int i=1; i<a.length; i++) {
//			if(a[i]>largest) {
//				largest = a[i];
//				
//			}
//		}
//		System.out.print(largest);
		
		
		
//		int[] l= {1,2,3,4,5,};
//		int sum = 0;
//		for(int i=0; i<l.length; i++) {
//			sum = sum + l[i];
//		}
//		System.out.print("Sum of all numbers is : "+sum);
		
		
		
		
//		int fact=1;
//		for(int i=1; i<=5; i++) {
//			
//			fact *= i;
//			
//		}
//		System.out.print("factorial : "+fact);
		
		
		
//		String s = "banana";
//		Map<Character, Integer> freq = new HashMap<>();
//		
//		for(char c : s.toCharArray()) {
//			freq.put(c, freq.getOrDefault(c, 0)+1);
//		}
//		System.out.print(freq);
		
		
		String s = "Roshan";
		Map<Character, Integer> freq = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0)+1);
		}
		System.out.print(freq);
		
		
		
		int[] a= {1,1,2,2,3,3,4,4,5,5};
		Set set = new HashSet<>();
		for(int num:a) {
			set.add(num);	
		}
		System.out.print(set);
		
		

		
	}
	
//	Abstraction- hiding the implimentation and showing functionality
//	1. partial abstraction (abstract class)
//	2. 100% abstraction (Interface)
//	not able to create obj of abstract class
//	
//	this - differentiate between local and global variables
//	super- is used to call parent class instance variables
//	
//	Polymorphism- polymorphism means “many forms”. It allows the same method or object to behave differently depending on the context/obj
//	method overloading(compile time polymorphism)- same method name with different parameters within same class
//	method overriding(Run Time and require inheritance)- inheriting the properties from parent class to child class and override the methods which has same method name and parameters
//	
//	
//	Encapsulation-  hiding the data means binding the data with the help of getters and setters method
//	Declares variables as private and methods as public
//	
//	linklist- manupulation is done

}
