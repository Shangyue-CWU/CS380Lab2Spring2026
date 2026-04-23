/**
 * Raven class extends from Animal class
 * @author Brayan Villanueva
 */
public class Raven extends Animal {

    /**
     * Constructor takes in a name for the Raven.
     *
     * @param name of the Raven.
     */
    public Raven(String name) {
        super(name);
    }

    /**
     * Overrides the sound method to represent the sound of a Raven.
     */
    @Override
    public void sound() {
        System.out.println(this.name + " goes: CAW, CAW!");
    }

    /**
     * Overrides the play method to represent how ravens play.
     */
    @Override
    public void play() {
        System.out.println(this.name + " tosses a stick into the air and catches it.");
    }

}
