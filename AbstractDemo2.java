package Week3;

abstract class Item{
	public abstract int cost();
}
abstract class Cream extends Item{
	
}
abstract class Ingredients extends Item{
	
}
class Vanila extends Cream{//static binding - what cannot be changed at runtime
	Item item;
	public Vanila() {
		// TODO Auto-generated constructor stub
	}
	public Vanila(Item item) {// dynamic binding - at constructor level
		this.item=item;
	}
	@Override
	public int cost() {
		if(item==null) {
			return 10;
		}else {
			return 10+item.cost();
		}
			
	}
}
class ButterScotch extends Cream{
	Item item;
	public ButterScotch() {
		// TODO Auto-generated constructor stub
	}
	public ButterScotch(Item item) {
		this.item=item;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(item==null) {
			return 15;
		}
		else {
			return 15+item.cost();
		}
	}
}
class Nuts extends Ingredients{
	Item item;
	public Nuts() {
		
	}
	public Nuts(Item item) {
		this.item=item;
	}
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(item==null) {
			return 5;
		}else {
			return 5 +item.cost();
		}
	}
}
class DryFruit extends Ingredients{
	Item item;
	public DryFruit() {
		// TODO Auto-generated constructor stub
	}
	public DryFruit(Item item) {
		// TODO Auto-generated constructor stub
		this.item=item;
	}
	
	@Override
	public int cost() {
		// TODO Auto-generated method stub
		if(item==null) {
			return 10;
		}
		else {
			return 10+item.cost();
		}
	}
}
public class AbstractDemo2 {
	public static void main(String[] args) {
		Item iceCream=new Vanila(new Nuts(new ButterScotch(new DryFruit(new Vanila()))));
		System.out.println("One Vanila cup..+ Nuts. + Butter Scotch:"+iceCream.cost());
		
		
	}
}