package SeleniumLearning;

public class MethodsDemo {

	public static void main(String[] args) {
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		
		MethodsDemo2 d2 = new MethodsDemo2();
		d2.getUserData();
		
		getData2();

	}
	
	public String getData() {
		System.out.println("hello world");
		return "roshan padmane";
	}
	
	//static means now its refer to class only and you use without creating its object in same class
	public static void getData2() {
		System.out.println("hello world getdata2");	
	}

}
