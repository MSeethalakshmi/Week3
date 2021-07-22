package Week3;

public class TemplatePattern {
	public static void main(String[] args) {
		ABCSchool cls=new VIIclass();
		cls.rulesandRegulation();
	}
}

abstract class ABCSchool{
	final void uniform(){
		System.out.println("Students uniform is designed by ABCSchool");
	}
	final void assembly() {
		System.out.println("Morning assembly is must in ABCSchool");
	}
	final void annualExam() {
		System.out.println("Annual exam is conducted by ABCSchool");
	}
	public abstract void questionBank();
	public abstract void classes();
	public void rulesandRegulation(){
		uniform();
		assembly();
		classes();
		annualExam();
		questionBank();
	}
}

class VIIclass extends ABCSchool{
	public void questionBank() {
		System.out.println("Question bank for VII class is prepared by teachers");
	}
	public void classes() {
		System.out.println("Classes will be taken by teachers");
	}
}