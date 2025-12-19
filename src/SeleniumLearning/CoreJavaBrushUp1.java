package SeleniumLearning;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		int myNum =10;
		String course= "Learn selenium";
		char letter = 't';
		boolean myCard = true;
		double dec= 5.99;
		System.out.println(myNum+" is the value stored in myNum Variable");

		int[] array1 = new int[5];//if you are not confurmed about your values then use this
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;
		array1[3] = 4;
		array1[4] = 5;
		
		int[] arr2 = {1,2,3,4,5};//if you known to your values then use this
		System.out.println("Value at 3rd  position is "+arr2[2]);
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		String[] names = {"rahul", "sahil", "mayur", "akshay", "roshan"};
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		for(String s: names) {
			System.out.println("Names in array is "+s);
		}
		
		
	}
}
