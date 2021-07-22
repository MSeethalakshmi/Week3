package Week3;

public class MethodOverloadDemo {
	public static void main(String[] args) {
		Calculate obj=new Calculate();
		obj.square();
		obj.square(3);
		obj.square(4.3f);
		
	}
}

class Calculate{
	public void square() {
		System.out.println("Square method with no parameter is called");
	}
	public int square(int number) {
		System.out.println("Square method with int argument is called");
		return number*number;
	}
	public float square(float number) {
		System.out.println("Square method with float arguement is called");
		return number*number;
	}
}