package Week3;

import java.util.Scanner;

//public class GoodFanDemo {
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		PullThread thread=new PullThread();
//		SwitchOn on=new SwitchOn();
//		MediumSpeed medium=new MediumSpeed();
//		HighSpeed high=new HighSpeed();
//		SwitchOff off=new SwitchOff();
//		PullThread[] obj= {on,medium, high,off};
//		while(true) {
//			for(PullThread i:obj) {
//				scan.next();
//				thread.pull=i;
//				thread.pullThread();
//			}
//		}
//	}
//}
//
//class PullThread{
//	PullThread pull;
//	public void pullThread() {
//		System.out.println(pull);
//	}
//	
//}
//
//class SwitchOn extends PullThread{
//	
//}
//
//class MediumSpeed extends SwitchOn{
//	
//}
//
//class HighSpeed extends MediumSpeed{
//	
//}
//
//class SwitchOff extends HighSpeed{
//	
//}


public class GoodFanDemo{
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Pull key=new Pull();
		while (true) {
			System.out.println("Press any key and enter: ");
			scan.next();
			key.pull();
		}
	}
}

class Pull{
	State state=new SwitchOffState();
	public void pull() {
		state.pull(this);
	}
}

abstract class State{
	public abstract void pull(Pull fan);
}

class SwitchOffState extends State{
	public void pull(Pull fan) {
		System.out.println("Switch On state....");
		fan.state=new SwitchOnState();
	} 
}

class SwitchOnState extends State{
	@Override
	public void pull(Pull fan) {
		System.out.println("Medium Speed state....");
		fan.state=new MediumSpeedState();
	}
}

class MediumSpeedState extends State{
	@Override
	public void pull(Pull fan) {
		System.out.println("Hight Speed state....");
		fan.state=new HighSpeedState();
	}
}

class HighSpeedState extends State{
	@Override
	public void pull(Pull fan) {
		System.out.println("Switch Off state....");
		fan.state=new SwitchOffState();
	}
}