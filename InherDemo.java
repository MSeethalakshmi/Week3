package Week3;

public class InherDemo {
	public static void main(String[] args) {
		Employee eng=new Engineer();
		Employee att=new Attender();
		Employee emp=new Employee();
		eng.met(0);
		att.met(0);
		emp.met(0);
	}
}

class Employee{
	public void met(int n) {
		System.out.println("met method of Employee is called....");
	}
}

class Engineer extends Employee{
	public void met(int n) {
		System.out.println("met method of Engineer is called....");
	}
}

class Attender extends Employee{
	public void met(int n) {
		System.out.println("met method of Attender is called....");
	}
	
}
