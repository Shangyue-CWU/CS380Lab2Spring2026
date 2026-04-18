package cs380lab2;
/**
 * This is the public class that extends the abstract Animal class
 */
public class SharkAnimal extends Animal{

	/**
	 * This is the SharkAnimal that casts the super type to the name
	 * @param A string
	 */
	
	public SharkAnimal(String name) {
		super(name);
		
	}
	
	/**
	 * This is the Override method for the sound. It overrides the abstract sound method and prints what sound a shark makes. I looked it up and they 
	 * can't really makes sounds as they don't have vocal cords but they do grind their teeth, splash around and some species like lemon sharks communicate when they are young.
	 */
	@Override
	public void sound() {
		System.out.print("Snap grind gnash bubble splash");
	}
	/**
	 * This is the override for the abstract play method, it prints some information I read about shark social behavior.
	 */
	@Override
	public void play() {
		System.out.println("\nSharks exibit social behavior close to playing when they are young, Nipping at eachother and Chasing eachother.\nThey have also been observed interacting with objects on the sea floor");
		
	}
	
	/**
	 * This is the main method, I declare a shark and then call all of the methods so that they can print to the console. Important to note that the
	 * eat method from the Animal.java is not abstract and already has a print statement tied to it. Because of that I did not need to override the
	 * method and instead I just called it using the shark I created in main. 
	 * @param args
	 */

	public static void main(String[] args){
		
		SharkAnimal Sharky = new SharkAnimal("Hungry");
		
		Sharky.sound();
		Sharky.play();
		Sharky.eat();
		
	}


}


