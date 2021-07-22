package Week3;

public class ExceptionDogDemo{
	public static void main(String[] args) {
		Dog tiger =new Dog();
		Child sidhu=new Child();
		Item1 item1=new Stick();
		sidhu.playWithDog(tiger, item1);
	}
}

abstract class DogException extends Exception{
	
}

class DogAngryException extends DogException{
	String msg;
	public DogAngryException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return msg;
	}
}

class DogHappyException extends DogException{
	String msg;
	public DogHappyException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return msg;
	}
	
}

abstract class Item1{
	public abstract void execute()throws DogException;
}

class Stick extends Item1{
	public void execute() throws DogAngryException{
		throw new DogAngryException("You beat I bite......!");
	}
}

class Biscuit extends Item1{
	public void execute() throws DogHappyException{
		throw new DogHappyException("I love biscuits.....!");
	}
}

class Dog{
	public void play(Item1 item1) throws DogException{
		item1.execute();
	}
}

class Child{
	public void playWithDog(Dog tiger,Item1 item1) {
		try {
			tiger.play(item1);
		}
		catch(DogException dex) {
			System.out.println(dex);
		}
	}
}
