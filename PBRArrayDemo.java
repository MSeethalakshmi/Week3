package Week3;

public class PBRArrayDemo {
	static int clsVar;
	int instVar;
	static int arr[]=new int[5];
	int array[]=new int[5];
	public static void main(String[] args) {
		int locarr[]=new int[5];
		System.out.println("Class variable: "+clsVar);
		PBRArrayDemo obj=new PBRArrayDemo();
		System.out.println("Instance variable: "+obj.instVar);
		
		int locVar=0;
		System.out.println("Local variable: "+locVar);
		
		System.out.println("\nArray declared as class variable");
		for(int i:arr) {
			System.out.print(i+"\t");
		}
		
		System.out.println("\nArray declared as instance variable");
		for(int i:obj.array) {
			System.out.println(i+"\t");
		}
		
		System.out.println("\nArray declared as local variable");
		for (int i:locarr) {
			System.out.println(i+"\t");
		}
		
		AcceptArray obj1= new AcceptArray();
		obj1.modifyArray(locarr);
		
		System.out.println("\nAfter Modification");
		for (int i:locarr) {
			System.out.println(i+"\t");
		}
	}
}

class AcceptArray{
	public void modifyArray(int a[]) {
		a[2]=300;
	}
}
