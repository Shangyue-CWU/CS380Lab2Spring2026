/**
 * The Iguana class represents an iguana.
 * It extends the Animal class and implements
 * its abstract methods.
 * 
 * This version automatically assigns the name "Iggy"
 * to every Iguana object.
 * 
 * @author Eli
 */
public class Iguana extends Animal {

    /**
     * Constructs a new Iguana object with the name "Iggy".
     */
    public Iguana() {
        super("Iggy");
    }

    /**
     * Makes the sound of the iguana.
     */
    @Override
    public void sound() {
        System.out.println(this.name + " makes a quiet hissing sound.");
    }

    /**
     * Describes how the iguana plays.
     */
    @Override
    public void play() {
        System.out.println(this.name + " climbs on branches and basks in the sun.");
    }
}
