package Week3;

public class MultipleCatchDemo {
	public static void main(String[] args) {
		float num=0;
		try {
			num=Float.parseFloat(args[0]);			
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
			num=1;
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex);
			num=1;
		}
		catch(Exception ex) {
			System.out.println(ex);
			num=1;
		}
		float i=1/num;
		System.out.println("Result: "+i);
		
	}
}
