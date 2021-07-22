package Week3;

public class PbvPbr {
	public static void main(String[] args) {
		Laddu1 laddu=new Laddu1();
		laddu.setSize(10);
		Pbv pbvobj=new Pbv();
		Pbr pbrobj=new Pbr();
		
		System.out.println("Size of laddu before bite...."+laddu.getSize());
		
		pbvobj.modifySizeOfLaddu(laddu.size);
		System.out.println("Size of laddu after using call by value...."+laddu.getSize());
		
		pbrobj.modifySizeOfLaddu(laddu);
		System.out.println("Size of laddu after using call by refference...."+laddu.getSize());
	}
}

class Laddu1{
	int size;
	public void setSize(int n) {
		size=n;
	}
	public int getSize() {
		return size;
	}
}

class Pbv{
	public void modifySizeOfLaddu(int size) {
		size=size-5;
	}
}

class Pbr{
	public void modifySizeOfLaddu(Laddu1 l) {
		l.setSize(5);
	}
}
