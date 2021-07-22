package Week3;

public class StackOverflowDemo {
	public static void main(String[] args) {
		Rec obj =new  Rec();
		try {
			obj.met();
		}
		catch(StackOverflowError e){
			System.out.println(e);
			System.out.println("Here Stack Overflow error is occured.....");
		}
	}
}

class Rec{
	public Rec met() {
		return met();
	}
}