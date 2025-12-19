package SeleniumLearning;

import java.util.HashMap;

public class CoreJavaBrushUp3 {
	public static void main(String[] args) {
		
		//String is an object which represent sequence of characters
		//String literal
		//String s = "roshan padmane";
		String s1 = "roshan padmane";//s1 pointing to s only no new memory allocated
		String s5 = "hello";
		
		//using new keyword
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");//here seperate seprate memory created for s1 and s2
		
		String s = "roshan padmane aloha";
		String[] splitedString = s.split("padmane");
		System.out.println(splitedString[0]);
		System.out.println(splitedString[1]);
		System.out.println(splitedString[1].trim());
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("*****************");
		for(int i=s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}
		//************************************************
		 String name = "Bangalore";
	     for (int i = name.length() - 1; i >= 0; i--) {
	            System.out.print(name.charAt(i));
	        }
	     
	     
	     
	        String a = "Hello";
	        String b = "World";

	        System.out.println("Before swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);

	        // Swapping logic
	        String temp = a;
	        a = b;
	        b = temp;

	        System.out.println("After swapping:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	        System.out.println("******************************************************************************************");
	        
	        
	        
	        String name1 = "Roshan Padmane";
	        name1 = name1.replace(" ", ""); // remove spaces if not needed

	        HashMap<Character, Integer> freqMap = new HashMap<>();

	        for (int i = 0; i < name1.length(); i++) {
	            char ch = name1.charAt(i);
	            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
	        }

	        // Print frequencies
	        for (char ch : freqMap.keySet()) {
	            System.out.println(ch + " → " + freqMap.get(ch));
	        }
	        System.out.println("******************************************************************************************");
	        
	        int[] numbers = {10, 25, 15, 40, 5};
	        int largest = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > largest) {
	                largest = numbers[i];
	            }
	        }
	        System.out.println(largest);

	        System.out.println("Largest = " + largest);
	        System.out.println("******************************************************************************************");
	        
	        String input = "abcd";
	        for (int i = 0; i < input.length(); i++) {
	            System.out.print(i);
	        }
	        
	        System.out.println("******************************************************************************************");
	        for (int i = 0; i < input.length(); i++) {
	            System.out.println(input.charAt(i) + " → " + i);
	        }
	        
	        System.out.println("//////////////////////////");
	        String alphabets ="abcdefgh";
	        for(int i=0; i<alphabets.length(); i++) {
	        	System.out.println(alphabets.charAt(i) + "--->" +i);
	        }
	        
	        //--------------------------
	        String str = "Bangalore 1234";

	        // Split into two parts: word and number
	        String[] parts = str.split(" "); // ["Bangalore", "1234"]

	        String word = parts[0];
	        String number = parts[1];

	        // Reverse the number
	        String reversedNumber = new StringBuilder(number).reverse().toString();

	        // Combine reversed number + word
	        String result = reversedNumber + " " + word;

	        System.out.println(result);



		
	}
	
	
//	((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement) element).getId(), "duration", 2000));
//
//	doubleClickGesture
//	clickGesture
//	dragGesture
//	flingGesture
//	swipeGesture
//	scrollGesture
	


	    
	
	
	
	
	
	
	

}
