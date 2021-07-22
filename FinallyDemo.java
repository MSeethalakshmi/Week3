package Week3;

public class FinallyDemo {
	public static void main(String[] args) {
		int i;
		try {
			System.out.println("Before exception inside try block");//This statment will be displayed
			i=1/0;
			System.out.println("After exception inside try block");//This statement won't display
		}catch(Exception e) {
			e.printStackTrace();//This statement will print complete detail of the error
			System.out.println(e);//This statement will print the exception
			System.out.println("After exception inside catch block");//This statement will be displayed
		}
		finally {
			System.out.println("Finally block is called...");//Whether the exception occurs or not this block always executed
		}	
	}
}
