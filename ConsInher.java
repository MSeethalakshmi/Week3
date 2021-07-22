package Week3;

public class ConsInher {
	public static void main(String[] args) {
		new RedPaint(8);
		new RedPaint();
	}
}

class Paint{
	int num;
	public Paint() {
		System.out.println("Empty Constructor of Paint class is called....!");
	}
	
	public Paint(int n) {
		System.out.println("Paramterized Constructor of Paint class is called....!");
	}
	
	public void met() {
		System.out.println("met method of Paint is called....!");
	}
}

class RedPaint extends Paint{
	public RedPaint(){
		System.out.println("Empty Constructor of RedPaint class is Called...!");
	}
	public RedPaint(int n) {
		super(n);
		super.num=n;
		super.met();
		System.out.println("Parameterized Constructor of Paint class is called....!");
	}
}