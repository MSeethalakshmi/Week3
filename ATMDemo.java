package Week3;

import java.util.Scanner;

public class ATMDemo {
		public static void main(String[] args)throws Exception{
			Scanner scan=new Scanner(System.in);
			System.out.println("Insert your ATM card...!");
			ProcessCard process=new ProcessCard();
//			ATM card=new Invalid();
			String name=scan.nextLine();
			Class cls=Class.forName("lab."+name);
			ATM card=(ATM)cls.newInstance();
			process.check(card);
		}
	}

	class ProcessCard{
		public void check(ATM card) {
			try {
				card.execute();
				System.out.println("Transaction Completed...!");
			}
			catch(InvalidCardException ex) {
				System.out.println(ex);
				System.out.println("Transaction failed...!");
			}
			finally {
				System.out.println("You can take your card...!");
			}
		}
	}

	abstract class ATM{
		public abstract void execute() throws InvalidCardException;
	}

	class Invalid extends ATM{
		public void execute() throws InvalidCardException{
			throw new InvalidCardException("The card is Invalid...!");
		}
	}

	class Valid extends ATM{
		public void execute() throws InvalidCardException{
			System.out.println("Processign wait for a momment...!");
		}
	}


	class InvalidCardException extends Exception{
		String msg;
		public InvalidCardException(String msg) {
			this.msg=msg;
		}
		
		@Override
		public String toString() {
			return msg;
		}
	}

