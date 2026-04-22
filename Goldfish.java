/**
 * A class representing a Goldfish that extends the abstract Animal class.
 * A Goldfish is a common freshwater fish often kept as a pet.
 * This class overrides the abstract methods sound() and play() from Animal.
 *
 * @author Your Name
 * @version 1.0
 */
public class Goldfish extends Animal {
 
    /**
     * Constructor that takes in a name for the Goldfish.
     *
     * @param name Name of the Goldfish.
     */
    public Goldfish(String name) {
        super(name);
    }
 
    /**
     * Overrides the sound() method from Animal.
     * Goldfish do not make audible sounds, but they blow bubbles
     * as a form of communication.
     */
    @Override
    public void sound() {
        System.out.println(this.name + " blows bubbles: *blub blub blub*");
    }
 
    /**
     * Overrides the play() method from Animal.
     * Goldfish enjoy swimming through hoops and chasing small floating objects.
     */
    @Override
    public void play() {
        System.out.println(this.name + " plays by swimming through little hoops in the tank!");
    }
 
}
