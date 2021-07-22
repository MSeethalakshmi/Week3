package Week3;

public class Service {
	
	void help(Police p) {
		System.out.println("Connect with control room...");
	}
	
	void help(AccidentVictim a) {
		System.out.println("Connect with hospital...");
	}
	
	void help(Helper h) {
		System.out.println("Connect with organisation...");
	}
	
	public static void main(String[] args) {
		Service objcall=new Service();
		Police obj100=new Police();
		AccidentVictim obj108=new AccidentVictim();
		Helper volunteer=new Helper();
		objcall.help(obj108);
	}
}

class Police{
	
}

class AccidentVictim{
	
}

class Helper{
	
}