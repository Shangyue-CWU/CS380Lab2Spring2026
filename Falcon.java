
public class Falcon extends Animal {
	

	protected Falcon(String name) {
		super(name);
		
	}

	@Override
	public void sound() {
		System.out.println("kik-kik-kik!!!");
		
	}

	@Override
	public void play() {
		System.out.println( this.name + " is playing, ee-chup, ee-chup.");
		
	}

}
