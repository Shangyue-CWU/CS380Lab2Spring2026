/**
 * Duck class that extends the abstract Animal class.
 * A duck has its own sound and play.
 * 
 * @author Hai Huynh
 */
public class Duck extends Animal {
/**
 * Constructs a Duck object with the given name.
 * 
 * @param name the name of the duck
 */
	public Duck(String name) {
		super(name);
	}
	
	/**
	 * Prints the sound of the duck.
	 */
	@Override
	public void sound() {
		System.out.println(this.name + " says quack quack.");
	}
	
	/**
	 * Prints an activity of the duck.
	 */
	@Override
	public void play() {
		System.out.println(this.name + " likes to swim, eat, and splash water.");
	}
}
