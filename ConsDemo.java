package Week3;

public class ConsDemo {
	
	public ConsDemo() {
		System.out.println("Constructor with empty parameter is called...");
	}
	
	public ConsDemo(int i) {
		System.out.println("Constructor with int parameter is called...");
	}
	
	public ConsDemo(String s) {
		System.out.println("Constructor with string parameter is called...");
	}
	
	public ConsDemo(int s, String str) {
		System.out.println("Multi parameter constructor is called...");
	}
	
	public static void main(String[] args) {
		ConsDemo obj=new ConsDemo();
		new ConsDemo(0);
		new ConsDemo(null);
		new ConsDemo(0, null);
		
		obj.met();
		obj.met(1);
	}
	
	void met() {
		System.out.println("Empty parameterized method is called...");
	}
	
	void met(int i) {
		System.out.println("Method with parameter is called...");
	}
}