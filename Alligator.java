
/**
 * Steve Buerstatte
 * extends animal class as an Alligator
 */

public class Alligator extends Animal {
	
	
	/**
	 * Constructor for Alligator.
	 * @param name name of the Alligator.
	 */
	public Alligator(String name) {
		
		super(name);
	}

	/**
	 * Prints sound Alligator makes.
	 */
	@Override
	public void sound()
	{
		System.out.println(name + " chomps in the air");
	}
	
	/**
	 * Prints the Alligator playing.
	 */
	@Override
	public void play()
	{
		System.out.println(name + " rolls around in the swamp");
	}
	
	/**
	 * Prints the Alligator eating.
	 */
	@Override
	public void eat()
	{
		System.out.println(name + " eats on some birds");
	}
	
}
